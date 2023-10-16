package Libreria;

import java.util.ArrayList;

/**
 *
 * @author Nicolás Carmona
 */
public class ColecLibros {

    public ColecLibros() {
    }
    
    ArrayList <Libro> libros = new ArrayList<>();
    
    public void agregaLibro(Libro librito){             //Incluye la validación
        for (Libro libro : libros) {
            if(libro.getTitulo().equals(librito.getTitulo()) && libro.getAutor().equals(librito.getAutor())){
                System.out.println("El libro ingresado ya se encuentra agregado");
            }else{
                libros.add(librito);
                System.out.println("Libro agregado con éxito");
            }
        }
    }
    public void mostrarLibros(){
        for (Libro libro : libros) {
            System.out.println("-----------------------------------");
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Categoria: " + libro.getCategoria());
            System.out.println("Precio: $" + libro.getPrecio());
        }
    }
    public void MostrarLibrosCategoria(){
        int contDeporte = 0;
        int contInfantil = 0;
        for (Libro libro : libros) {
            if(libro.getCategoria().equalsIgnoreCase("deporte")){
                contDeporte+=1;
                System.out.println("Libro de Deportes: " + libro.getTitulo());
            }else if(libro.getCategoria().equalsIgnoreCase("infantil")){
                contInfantil+=1;
                System.out.println("Libro Infantil: " + libro.getTitulo());
            }
        }
        System.out.println("Cantidad de libros infantiles: " + contInfantil);
        System.out.println("Cantidad de libros de deporte: " + contDeporte);
    }
}
