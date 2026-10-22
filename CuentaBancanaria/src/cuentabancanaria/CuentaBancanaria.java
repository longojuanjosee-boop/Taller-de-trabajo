/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancanaria;

/**
 *
 * @author USUARIO
 */
public class CuentaBancanaria {

    /**
     * @param args the command line arguments
     */
   
   // 1. Atributos privados (Encapsulamiento)
    private String titular;
    private double saldo;

    // 2. Constructor para crear los objetos con datos iniciales
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0; // Evita saldos iniciales negativos
        }
    }

    // 3. Método retirar con validaciones de lógica de negocio
    public void retirar(double valor) {
        if (valor <= 0) {
            System.out.println("Error: El valor a retirar debe ser mayor a cero.");
        } else if (valor > saldo) {
            System.out.println("Error: Fondos insuficientes para realizar el retiro.");
        } else {
            saldo -= valor; // Operación segura
            System.out.println("Retiro exitoso de: $" + valor);
        }
    }

    // 4. Métodos Getters y Setters para acceso controlado
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    } 
}
