//colocando el paquete
package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Cristhian - Alejandro - Johan
 */
public interface RMIDAO extends Remote{
    //Se crea el metodo VerificarUsuarios
    public boolean VerificarUsuarios(String usuario, String contrasenia)throws RemoteException;
    //Se crea el metodo encriptar
    public String encriptar(String dato, String claveSectreta) throws RemoteException;
    //Se crea el metodo Mensaje
    public String Mensaje(String mensaje) throws RemoteException;
    
}
