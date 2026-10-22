/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package biblioteca.de.libros;

/**
 *
 * @author USUARIO
 */
public class BibliotecaDeLibros {

    /**
     * @param args the command line arguments
     */
   
    //Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;
    
    //Constructores 
    public BibliotecaDeLibros () {
        this.titulo = "asignado";
        this.autor = "asignado";
        this.isbn = "no asignado";
        this.disponible = true;
    }
    
    public BibliotecaDeLibros (String titulo, String autor, String isbn, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }
    
    //metodos y funciones de get
    public String getTitulo () {
        return titulo;
    }
    
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor () {
        return autor;
    }
    
    public void setAutor (String autor) {
        this.autor = autor;
    }
    
    public String getIsbn () {
        return isbn;
    }
    
    public void setIsbn (String isbn) {
        this.isbn = isbn;
    }
    
    public boolean isDisponible () {
        return disponible;
    }
    
    public void setDisponible (boolean disponible) {
        this.disponible = disponible;
    }
    
     public void mostrarInformacion() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("[" + isbn + "] " + titulo + " - " + autor + " (" + estado + ")");
    }
}
