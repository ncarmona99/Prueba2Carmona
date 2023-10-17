package Libreria;

/**
 *
 * @author Nicolás Carmona
 */
public class Infantil extends Libro {
    private String rangoEdad;

    public Infantil() {
    }

    public Infantil(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    public Infantil(String rangoEdad, int precio, String autor, String titulo, String categoria) {
        super(precio, autor, titulo, categoria);
        this.rangoEdad = rangoEdad;
    }

    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    @Override
    public String toString() {
        return "Infantil{" + "rangoEdad=" + rangoEdad + '}' + " " + super.toString();
    }

    @Override
    public void totalImpuesto(int totalSinImpuesto, Libro librito) {
        super.totalImpuesto(totalSinImpuesto, librito);
    }
    
    
}
