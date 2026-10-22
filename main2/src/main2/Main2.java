/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main2;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);

        // 1. Pedir datos para crear la cuenta del objeto
        System.out.print("Ingrese el nombre del titular: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = teclado.nextDouble();

        // Creamos el objeto con los datos ingresados
        CuentaBancaria miCuenta = new CuentaBancaria(nombre, saldoInicial);
        System.out.println("\n--- Cuenta creada con éxito ---");

        // 2. Simular un retiro dinámico
        System.out.print("\n¿Cuánto dinero desea retirar?: ");
        double montoRetiro = teclado.nextDouble();
        
        // El método de la clase evalúa si el retiro es válido o no
        miCuenta.retirar(montoRetiro); 

        // 3. Mostrar el estado final del objeto usando getters
        System.out.println("\n--- Estado de la Cuenta ---");
        System.out.println("Titular: " + miCuenta.getTitular());
        System.out.println("Saldo actual: $" + miCuenta.getSaldo());

        // Cerramos el scanner
        teclado.close();
        
    }
    
}
