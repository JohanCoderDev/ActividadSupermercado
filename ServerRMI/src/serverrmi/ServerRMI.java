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
    //definiendo
//    private String claveSecreta = "clave";
//    private String datos = "datos";
    
    //server
    public ServerRMI() throws RemoteException{
        super();
    }

    
 
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
    //se protege el metodo encriptar
    @Override
    public String encriptar(String dato, String claveSectreta){
        SecretKeySpec secretKey = null;
        try {
            secretKey = crearClave(claveSectreta);
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
            datosEncriptar = dato.getBytes("UTF-8");
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
    //se protege el metodo Mensaje
    @Override
    public String Mensaje(String mensaje) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //se protege el metodo VerificarUsuarios
    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
       boolean estado = false;
               
        String datosCorrectos = encriptar("johan", "1234");
        String datosCorrectos1 = encriptar("alejandro", "1234");
        String datosCorrectos2 = encriptar("cristhian", "1234");
        String datosUsuario = encriptar(usuario, contrasenia);
        
        System.out.println(datosCorrectos);
        System.out.println(datosUsuario);
        
        if((datosUsuario.equals(datosCorrectos) || (datosUsuario.equals(datosCorrectos1)) || (datosUsuario.equals(datosCorrectos2)))){
           estado = true;
        }
        
        return estado;
    }
    
    
}
