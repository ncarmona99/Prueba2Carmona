package Libreria;

/**
 *
 * @author Nicolás Carmona
 */
public class Main {
    public static void main(String[] args) {
        Infantil infantil = new Infantil("5 a 8 años", 5000, "Mazapán", "Libro de canciones de niños", "Infantil");
        Deportes deportes = new Deportes("Tenis", 8000, "Nicolás Massu", "Guía para ser el mejor tenista", "Deporte");
        ColecLibros libros = new ColecLibros();
        libros.agregaLibro(infantil);
        libros.agregaLibro(deportes);
        infantil.calculaDesc(infantil, "infantil");
        deportes.calculaDesc(deportes, "Deporte");
        libros.MostrarLibrosCategoria();
        libros.validaLibro(deportes);
        
        
    }
}
