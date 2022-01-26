package daw.poo.maquinavending.gabrielallendejuanjosebazan;

public class Bandejas {

// Atributos    
    private Productos producto;

    private int codBandeja; //¿preferimos int o String?

// Constructor sin parametrizar
    public Bandejas() {

    }
// Constructor parametrizado

    public Bandejas(Productos producto, int codBandeja) {
        this.producto = producto;

        this.codBandeja = codBandeja;
    }

    @Override
    public String toString() {
        return "Bandejas{" + "producto=" + producto + ", codBandeja=" + codBandeja + '}';
    }

// Setters y Getters    
    public Productos getProducto1() {
        return producto;
    }

    public void setProducto1(Productos producto1) {
        this.producto = producto1;
    }

    public int getCodBandeja() {
        return codBandeja;
    }

    public void setCodBandeja(int codBandeja) {
        this.codBandeja = codBandeja;
    }

}
