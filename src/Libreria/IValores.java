package Libreria;

/**
 *
 * @author Nicolás Carmona
 */
public interface IValores {
    double iva = 0.19;
    double descInfantil = 0.05;
    double descDeporte = 0.1;
    
    public void totalImpuesto(int totalSinImpuesto,String categoria);
    public void calculaDesc(Libro libro, String categoria);
}
