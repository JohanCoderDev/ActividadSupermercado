/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArchivosBinarios;

import Vista_1.MasOpciones;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Johan Ordoñez - Cristhian Padilla - Alejandro Portilla 
 */

public class ArchivoBinario {
    
    /** 
     * Metodo para escribir codigo binario en el archivo Lacteos.bin 
     * @param dato 
     * @throws IOException  
     */
    public static void escribirBinarioLacteoTexto(String dato) throws IOException {
    try {
        File archivo = new File("LacteoTexto.bin");

        FileOutputStream archivoSalida = new FileOutputStream(archivo);
        DataOutputStream escritura = new DataOutputStream(archivoSalida);

        escritura.writeUTF(dato);

        escritura.close();
        archivoSalida.close();
    } catch (IOException error) {
        error.printStackTrace(System.out);
    }
}


    /**
     * Metodo para escribir codigo binario en el archivo Lacteos.bin 
     * @param dato  
     * @throws IOException  
     */
    public static void escribirBinarioFrutaTexto(String dato) throws IOException {
    try {
        File archivo = new File("FrutaTexto.bin");

        FileOutputStream archivoSalida = new FileOutputStream(archivo);
        DataOutputStream escritura = new DataOutputStream(archivoSalida);

        escritura.writeUTF(dato);

        escritura.close();
        archivoSalida.close();
    } catch (IOException error) {
        error.printStackTrace(System.out);
    }
}
    
    /**
     * Metodo para escribir codigo binario en el archivo Lacteos.bin 
     * @param dato 
     * @throws IOException  
     */
    
    public static void escribirBinarioVerduraTexto(String dato) throws IOException {
    try {
        File archivo = new File("VerduraTexto.bin");

        FileOutputStream archivoSalida = new FileOutputStream(archivo);
        DataOutputStream escritura = new DataOutputStream(archivoSalida);

        escritura.writeUTF(dato);

        escritura.close();
        archivoSalida.close();
    } catch (IOException error) {
        error.printStackTrace(System.out);
    }
}
    
    //------------------------------------------------------------------------------------
    
    
    /**
     * Metodo para escribir codigo binario en el archivo Lacteos.bin 
     * @param dato 
     * @throws IOException  
     */
    public static int escribirBinarioCanasta1Precio(int dato) throws IOException {
        int resultado = 0;
    try {
        
        File archivo = new File("LacteosPrecio.bin");

        FileOutputStream archivoSalida = new FileOutputStream(archivo);
        DataOutputStream escritura = new DataOutputStream(archivoSalida);
        escritura.writeInt(dato);
        resultado = dato;

        escritura.close();
        archivoSalida.close();
    } catch (IOException error) {
        error.printStackTrace(System.out);
    }
        
        
    return resultado;
}


  
    /**
     * Metodo para escribir codigo binario en el archivo Frutas.bin 
     * @param dato 
     * @throws IOException  
     */
    public static int escribirBinarioFrutas1Precio(int dato) throws IOException {
        int resultado = 0;
    try {
        File archivo = new File("FrutasPrecio.bin");

        FileOutputStream archivoSalida = new FileOutputStream(archivo);
        DataOutputStream escritura = new DataOutputStream(archivoSalida);
        escritura.writeInt(dato);
        resultado = dato;

        escritura.close();
        archivoSalida.close();
    } catch (IOException error) {
        error.printStackTrace(System.out);
    }
    return resultado;
}
    
    /**
     * Metodo para escribir codigo binario en el archivo Verduras.bin 
     * @param dato 
     * @throws IOException  
     */
    public static int escribirBinarioVerdura1Precio(int dato) throws IOException {
        int resultado = 0;
    try {
        File archivo = new File("VerdurasPrecio.bin");

        FileOutputStream archivoSalida = new FileOutputStream(archivo);
        DataOutputStream escritura = new DataOutputStream(archivoSalida);
        escritura.writeInt(dato);
        resultado = dato;
        
        escritura.close();
        archivoSalida.close();
    } catch (IOException error) {
        error.printStackTrace(System.out);
    }
    return resultado = 0;
}








    //-------------------------------------------------------------------------------------

    
    /**
     * Metodo utilizado para leer el archivo binario llamado LacteosPrecio.bin 
     * @return 
     * @throws IOException  
     */
    public static int leerBinarioCanasta1Precio() throws IOException {
        int resultado = 0;
    try {
        FileInputStream archivoEntrada = new FileInputStream("LacteosPrecio.bin");
        DataInputStream lectura = new DataInputStream(archivoEntrada);
        
        while (archivoEntrada.available() > 0) {
            int dato = lectura.readInt();
            resultado = dato;
        }
        
        lectura.close();
    } catch (IOException error) {
        error.printStackTrace(System.out);
    }
    return resultado;
    }
    
    
    
    /**
     * Metodo utilizado para leer el archivo binario llamado FrutasPrecio.bin 
     * @return 
     * @throws IOException  
     */
     public static int leerBinarioFrutas1Precio() throws IOException {
         int resultado = 0;
    try {
        FileInputStream archivoEntrada = new FileInputStream("FrutasPrecio.bin");
        DataInputStream lectura = new DataInputStream(archivoEntrada);
        
        while (archivoEntrada.available() > 0) {
            int dato = lectura.readInt();
            resultado = dato;
            
        }
        
        lectura.close();
    } catch (IOException error) {
        error.printStackTrace(System.out);
    }
    return resultado;
}
     
     
    /**
     * Metodo utilizado para leer el archivo binario llamado VerdurasPrecio.bin 
     * @return 
     * @throws IOException 
     */
      public static int leerBinarioVerduras1Precio() throws IOException {
         int resultado = 0;
    try {
        FileInputStream archivoEntrada = new FileInputStream("VerdurasPrecio.bin");
        DataInputStream lectura = new DataInputStream(archivoEntrada);
        
        while (archivoEntrada.available() > 0) {
            int dato = lectura.readInt();
            resultado = dato;
        }
        
        lectura.close();
    } catch (IOException error) {
        error.printStackTrace(System.out);
    }
    return resultado;
}
      
      //------------------------------------------------------------------------------------
      
      
      /**
       * Metodo utilizado para leer el archivo binario FrutaTexto.bin 
       * @throws IOException 
       */
       public static String leerBinarioFrutaTexto() throws IOException {
    String resultado = "";
    try {
        FileInputStream archivoEntrada = new FileInputStream("FrutaTexto.bin");
        DataInputStream lectura = new DataInputStream(archivoEntrada);

        resultado = lectura.readUTF();

        lectura.close();
    } catch (IOException error) {
        error.printStackTrace(System.out);
    }
    return resultado;
}
       
       /**
       * Metodo utilizado para leer el archivo binario LacteoTexto..bin 
       * @throws IOException 
       */
        public static String leerBinarioLacteoTexto() throws IOException {
            String resultado = "";
    try {
        FileInputStream archivoEntrada = new FileInputStream("LacteoTexto.bin");
        DataInputStream lectura = new DataInputStream(archivoEntrada);
        
        resultado = lectura.readUTF();

        lectura.close();
    } catch (IOException error) {
        error.printStackTrace(System.out);
    }
    return resultado;
}
        
        /**
       * Metodo utilizado para leer el archivo binario VerduraTexto.bin 
       * @throws IOException 
       */
         public static String leerBinarioVerduraTexto() throws IOException {
             String resultado = "";
    try {
        FileInputStream archivoEntrada = new FileInputStream("VerduraTexto.bin");
        DataInputStream lectura = new DataInputStream(archivoEntrada);
        
         resultado = lectura.readUTF();
            
        lectura.close();
    } catch (IOException error) {
        error.printStackTrace(System.out);
    }
    return resultado;
}
    
}


    
