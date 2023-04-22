/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serverrmi;

/**
 *
 * @author Cristhian - Alejandro - Johan
 */

import Interface.RMIDAO; //libreria propia
import java.io.UnsupportedEncodingException;

//librerias que se importan
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;


public class ServerRMI extends UnicastRemoteObject implements RMIDAO{
    
    private String claveSecreta = "clave";
    private String datos = "datos";
    

    public ServerRMI() throws RemoteException{
        super();
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Registry registro = LocateRegistry.createRegistry(7777);
            registro.rebind("RemotoRMI", new ServerRMI());
            System.out.println("Servidor esta activo");
        }catch(RemoteException ex){
            System.out.println(ex.getMessage());
        }
    }
    

    private SecretKeySpec crearClave(String clave) throws UnsupportedEncodingException, NoSuchAlgorithmException{
        
        byte[] claveEncriptar = clave.getBytes("UTF-8");
        MessageDigest sha = MessageDigest.getInstance("SHA-1");
        
        claveEncriptar = sha.digest(claveEncriptar);
        claveEncriptar = Arrays.copyOf(claveEncriptar,16);
        
        SecretKeySpec secretKey = new SecretKeySpec(claveEncriptar, "AES");
        
        return secretKey;
        
    }
    
    @Override
    public String encriptar(String dato, String claveSectreta){
        SecretKeySpec secretKey = null;
        try {
            secretKey = this.crearClave(claveSecreta);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(ServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(ServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        byte[] datosEncriptar = null;
        try {
            datosEncriptar = datos.getBytes("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte[] bytesEncriptados = null;
        try {
            bytesEncriptados = cipher.doFinal(datosEncriptar);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(ServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(ServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String encriptado = Base64.getEncoder().encodeToString(bytesEncriptados);
        
        return encriptado;
    }

    @Override
    public String Mensaje(String mensaje) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
       boolean estado = false;
        
        String usuarioCorrecto = "johan";
        String contraseniaCorrecta = "1234";
        String datosCorrectos = null;
        
        datosCorrectos = encriptar(usuarioCorrecto, contraseniaCorrecta);
    
        if((usuario.equals(datosCorrectos))&&(contrasenia.equals(contraseniaCorrecta))) {
           estado = true;
        }
        return estado;
    }
    
    
}
