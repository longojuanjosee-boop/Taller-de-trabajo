/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main3;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== REGISTRO DE PRODUCTO ===");
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese el precio: $");
        double precio = teclado.nextDouble();

        System.out.print("Ingrese la cantidad inicial: ");
        int cantidad = teclado.nextInt();

        // Creamos el objeto Producto
        Producto prod = new Producto(nombre, precio, cantidad);
        
        System.out.println("\n=== INFORMACIÓN INICIAL ===");
        prod.mostrarInformacion();

        // --- SIMULACIÓN DEL EJEMPLO DEL TALLER ---
        System.out.println("\n=== PROCESANDO OPERACIONES ===");

        // 1. Primera Venta
        System.out.print("\nIngrese unidades a vender (Prueba Venta Exitosa): ");
        int venta1 = teclado.nextInt();
        prod.vender(venta1);

        // 2. Intento de sobreventa
        System.out.print("\nIngrese unidades a vender (Prueba Inventario Insuficiente): ");
        int venta2 = teclado.nextInt();
        prod.vender(venta2);

        // 3. Reabastecimiento
        System.out.print("\nIngrese unidades para reabastecer: ");
        int refil = teclado.nextInt();
        prod.reabastecer(refil);

        // Fin del programa
        System.out.println("\n=== INVENTARIO FINAL ===");
        prod.mostrarInformacion();

        teclado.close();
        
    }
    
}
