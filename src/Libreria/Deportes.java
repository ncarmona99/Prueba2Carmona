package Libreria;

/**
 *
 * @author Nicolás Carmona
 */
public class Deportes extends Libro {
    private String tipoDeporte;

    public Deportes() {
    }

    public Deportes(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public Deportes(String tipoDeporte, int precio, String autor, String titulo, String categoria) {
        super(precio, autor, titulo, categoria);
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    @Override
    public String toString() {
        return "Deportes{" + "tipoDeporte=" + tipoDeporte + '}' + " " + super.toString();
    }

    @Override
    public void totalImpuesto(int totalSinImpuesto, Libro librito) {
        super.totalImpuesto(totalSinImpuesto, librito);
    }
    
    
}
