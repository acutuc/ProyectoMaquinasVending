
package daw.poo.maquinavending.gabrielallendejuanjosebazan;

/**
 *
 * @author acutuc
 */

//Definición de la clase
public class Productos {
    //Atributos de la clase Productos:
    private String nombreProducto;
    private int precioProducto; //Precio de producto en CÉNTIMOS.
    private int stockProducto; //Stock del producto. Decrecerá al vender o aumentará al rellenar.

    //Constructor parametrizado.
    public Productos(String nombreProducto, int precioProducto, int stockProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        //Restricción que controla que el precio de un producto nunca pueda ser negativo.
        if(precioProducto < 0){
            this.precioProducto = Math.abs(precioProducto);
        }
        this.stockProducto = stockProducto;
    }

    //Constructor con sus valores predeterminados.
    public Productos() {
    }
    
    //Getters y setters:

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        if(precioProducto < 0){
            this.precioProducto = Math.abs(precioProducto);
        }
        this.precioProducto = precioProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }
    
    
    //toString.

    @Override
    public String toString() {
        return "Productos{" + "nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + '}';
    }
       
    public void rellenarProducto(int cantidadProductosAMeter){
        this.stockProducto = stockProducto + cantidadProductosAMeter;
    }
   
    public void productoVendido(){
        this.stockProducto = stockProducto - 1;
    }
    
    
}
