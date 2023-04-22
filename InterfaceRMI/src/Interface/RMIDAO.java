/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Cristhian - Alejandro - Johan
 */
public interface RMIDAO extends Remote{
    
    public boolean VerificarUsuarios(String usuario, String contrasenia)throws RemoteException;
    public String encriptar(String dato, String claveSectreta) throws RemoteException;
    public String Mensaje(String mensaje) throws RemoteException;
    
}
