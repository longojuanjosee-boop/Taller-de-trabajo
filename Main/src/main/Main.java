/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== REGISTRO DEL NUEVO LIBRO ===");
        
        // Pedimos los datos al usuario
        System.out.print("Escribe el título del libro: ");
        String tituloUsuario = teclado.nextLine();
        
        System.out.print("Escribe el autor del libro: ");
        String autorUsuario = teclado.nextLine();
        
        System.out.print("Escribe el ISBN del libro: ");
        String isbnUsuario = teclado.nextLine();
        
        // Creamos el objeto usando tu Constructor 2 con los datos capturados
        // Por defecto lo creamos como disponible (true)
        BibliotecaDeLibros miLibro = new BibliotecaDeLibros(tituloUsuario, autorUsuario, isbnUsuario, true);
        
        System.out.println("numero de Libro creado exitosamente en el sistema!");
        
        // Variables para el menú interactivo
        int opcion = 0;
        
        // Bucle para que el menú se repita hasta que el usuario decida salir
        do {
            System.out.println("\n==== MENÚ DE OPCIONES (" + miLibro.getTitulo() + ") ====");
            System.out.println("1. Ver información completa y estado");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Modificar título (Prueba de validación)");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer del scanner
            
            System.out.println("no esta asignado nada");
            
            switch (opcion) {
                case 1:
                    String estado = miLibro.isDisponible() ? "Disponible" : "Prestado";
                    System.out.println("Título: " + miLibro.getTitulo());
                    System.out.println("Autor: " + miLibro.getAutor());
                    System.out.println("ISBN: " + miLibro.getIsbn());
                    System.out.println("Estado: " + estado);
                    break;
                    
                case 2:
                    // Enviamos 'false' a tu método setDisponible para marcarlo como prestado
                    miLibro.setDisponible(false); 
                    break;
                    
                case 3:
                    // Enviamos 'true' a tu método setDisponible para marcarlo como devuelto
                    miLibro.setDisponible(true); 
                    break;
                    
                case 4:
                    System.out.print("Escribe el nuevo título (deja espacios vacíos para probar el error): ");
                    String nuevoTitulo = teclado.nextLine();
                    miLibro.setTitulo(nuevoTitulo); // Llama a tu método con filtro de validación
                    break;
                    
                case 5:
                    System.out.println("Saliendo del sistema de la biblioteca. ¡Adiós!");
                    break;
                    
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
            System.out.println("----------------------------------------");
            
        } while (opcion != 5);
        
        // Cerramos el scanner al terminar el programa
        teclado.close(); 
    }
    
}
