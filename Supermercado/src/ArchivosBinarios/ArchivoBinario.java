/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArchivosBinarios;

import java.io.*;
/**
 *
 * @author Johan Ordoñez
 */



public class ArchivoBinario {
    
    private ArchivoBinario carrito;

    // Otros métodos y lógica de la aplicación

    public void guardarCarritoEnArchivo() {
        try (OutputStream output = new FileOutputStream("carrito.bin");
             ObjectOutputStream objectOutput = new ObjectOutputStream(output)) {
            objectOutput.writeObject(carrito);
        } catch (IOException e) {
            // Manejar excepciones
        }
    }

    public void cargarCarritoDesdeArchivo() {
        try (InputStream input = new FileInputStream("carrito.bin");
             ObjectInputStream objectInput = new ObjectInputStream(input)) {
            carrito = (ArchivoBinario) objectInput.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Manejar excepciones
        }
    }

    // Resto de la implementación de la aplicación
}


    
