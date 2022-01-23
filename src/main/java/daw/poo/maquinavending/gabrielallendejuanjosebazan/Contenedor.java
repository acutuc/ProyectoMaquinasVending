package daw.poo.maquinavending.gabrielallendejuanjosebazan;

public class Contenedor {

    private Productos productoActual;

    public Contenedor() {

    }

    public Contenedor(Productos productoActual) {
        this.productoActual = productoActual;
    }

    public Productos getProductoActual() {
        return productoActual;
    }

    public void setProductoActual(Productos productoActual) {
        this.productoActual = productoActual;
    }
    
    

}
