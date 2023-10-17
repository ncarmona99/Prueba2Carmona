package Libreria;

/**
 *
 * @author Nicolás Carmona
 */
public abstract class Libro implements IValores {
    protected int precio;          //Sin impuesto
    protected String autor,titulo,categoria;
    
    ColecLibros libros = new ColecLibros();

    public Libro() {
    }

    public Libro(int precio, String autor, String titulo, String categoria) {
        this.categoria = categoria;
        this.precio = precio;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String Categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "categoria=" + categoria + ", precio=" + precio + ", autor=" + autor + ", titulo=" + titulo + '}';
    }

    @Override
    public void totalImpuesto(int totalSinImpuesto, Libro librito) {
        double totalDeporte = 0;
        double totalInfantil = 0;
        double totalAmbos = 0;
        for (Libro libro : libros.libros) {
            if (libro.getCategoria().equalsIgnoreCase("deporte")){
                totalDeporte = totalDeporte + (libro.getPrecio()*iva) - (libro.getPrecio()*descDeporte);
            }else if (libro.getCategoria().equalsIgnoreCase("infantil")){
                totalInfantil = totalInfantil + (libro.getPrecio()*iva) - (libro.getPrecio()*descInfantil);
            }
        }
        totalAmbos = totalDeporte+totalInfantil;
        System.out.println("El total de la compra es $ "+totalAmbos);
    }

    @Override
    public void calculaDesc(Libro libro, String categoria) {
        
    }
    
    
    
}
