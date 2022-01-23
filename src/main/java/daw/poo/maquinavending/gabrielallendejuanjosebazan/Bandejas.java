package daw.poo.maquinavending.gabrielallendejuanjosebazan;

public class Bandejas {

// Atributos    
    private Productos producto1;
    private Productos producto2;
    private Productos producto3;
    private Productos producto4;
    private Productos producto5;
    private Productos producto6;

    private int codBandeja;

// Constructor sin parametrizar
    public Bandejas() {

    }
// Constructor parametrizado

    public Bandejas(Productos producto1, Productos producto2, Productos producto3, Productos producto4, Productos producto5, Productos producto6, int codBandeja) {
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
        this.producto4 = producto4;
        this.producto5 = producto5;
        this.producto6 = producto6;
        this.codBandeja = codBandeja;
    }

    @Override
    public String toString() {
        return "Bandejas{" + "producto1=" + producto1 + ", producto2=" + producto2 + ", producto3=" + producto3 + ", producto4=" + producto4 + ", producto5=" + producto5 + ", producto6=" + producto6 + ", codBandeja=" + codBandeja + '}';
    }

// Setters y Getters    
    public Productos getProducto1() {
        return producto1;
    }

    public void setProducto1(Productos producto1) {
        this.producto1 = producto1;
    }

    public Productos getProducto2() {
        return producto2;
    }

    public void setProducto2(Productos producto2) {
        this.producto2 = producto2;
    }

    public Productos getProducto3() {
        return producto3;
    }

    public void setProducto3(Productos producto3) {
        this.producto3 = producto3;
    }

    public Productos getProducto4() {
        return producto4;
    }

    public void setProducto4(Productos producto4) {
        this.producto4 = producto4;
    }

    public Productos getProducto5() {
        return producto5;
    }

    public void setProducto5(Productos producto5) {
        this.producto5 = producto5;
    }

    public Productos getProducto6() {
        return producto6;
    }

    public void setProducto6(Productos producto6) {
        this.producto6 = producto6;
    }

    public int getCodBandeja() {
        return codBandeja;
    }

    public void setCodBandeja(int codBandeja) {
        this.codBandeja = codBandeja;
    }

}
