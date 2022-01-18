
package daw.poo.maquinavending.gabrielallendejuanjosebazan;

/**
 *
 * @author acutuc
 */

//Definición de la clase
public class Productos {
    //Atributos de la clase Productos:
    private String nombreProducto;
    private double precioProducto;

    //Constructor parametrizado.
    public Productos(String nombreProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
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

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    //toString.

    @Override
    public String toString() {
        return "Productos{" + "nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + '}';
    }
       
    
}
