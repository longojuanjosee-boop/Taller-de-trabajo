/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productos;

/**
 *
 * @author USUARIO
 */
public class Productos {

    /**
     * @param args the command line arguments
     */
   
    // Atributos privados (Encapsulamiento)
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor para inicializar los datos
    public Producto (String nombre, double precioInicial, int cantidadInicial) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        
        // Validación básica al crear el producto
        if (precioInicial >= 0) {
            this.precio = precioInicial;
        } else {
            this.precio = 0;
        }
        
        if (cantidadInicial >= 0) {
            this.cantidad = cantidadInicial;
        } else {
            this.cantidad = 0;
        }
    }

    // Método para consultar la información (Getter)
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en inventario: " + cantidad);
    }

    // Método para actualizar el precio evitando valores negativos
    public void actualizarPrecio(double nuevoPrecio) {
        if (nuevoPrecio >= 0) {
            this.precio = nuevoPrecio;
            System.out.println("Precio actualizado con éxito a: $" + nuevoPrecio);
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    // Método para vender unidades
    public void vender(int unidades) {
        if (unidades <= 0) {
            System.out.println("Error: La cantidad a vender debe ser mayor a cero.");
        } else if (unidades > cantidad) {
            System.out.println("Error: inventario insuficiente.");
        } else {
            this.cantidad -= unidades;
            System.out.println("Venta de " + unidades + " unidades realizada.");
        }
        System.out.println("Inventario actual: " + this.cantidad);
    }

    // Método para reabastecer el inventario
    public void reabastecer(int unidades) {
        if (unidades > 0) {
            this.cantidad += unidades;
            System.out.println("Reabastecimiento de " + unidades + " unidades realizado.");
        } else {
            System.out.println("Error: Las unidades a reabastecer deben ser mayores a cero.");
        }
        System.out.println("Inventario actual: " + this.cantidad);
    }

    // Getters necesarios para la consulta externa limpia
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
}
