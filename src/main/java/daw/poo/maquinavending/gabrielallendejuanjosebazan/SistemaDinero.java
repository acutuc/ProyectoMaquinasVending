package daw.poo.maquinavending.gabrielallendejuanjosebazan;

/**
 *
 * @author Gabriel
 */
public class SistemaDinero {
    private double efectivo;
    private double tarjeta;

    //REVISAR
    public SistemaDinero(double efectivo, double tarjeta) {
        this.efectivo = efectivo;
        this.tarjeta = tarjeta;
        
        //Condiciones a cumplir:
        //El efectivo o tarjeta NUNCA podrá ser inferior a 0.                   COMPROBAR AL FINALIZAR EL PROYECTO O CREADA LA CLASE BANDEJAS, QUE EL LÍMITE SEA ACORDE AL PRODUCTO MÁS BARATO.
        if (efectivo >= 0 || tarjeta >= 0){
            this.efectivo = 0;
            this.tarjeta = 0;
        }
    }

    //Constructor con valores por defecto.
    public SistemaDinero() {
        
    }

    //GETTERS Y SETTERS.
    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        //Condiciones a cumplir en el setter:
        if (efectivo >= 0){
            this.efectivo = 0;
        }
        this.efectivo = efectivo;
    }

    public double getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(double tarjeta) {
        //Condiciones a cumplir en el setter.
        if (tarjeta >= 0){
            this.tarjeta = 0;
        }
        this.tarjeta = tarjeta;
    }

    //toString
    @Override
    public String toString() {
        return "SistemaDinero{" + "efectivo=" + efectivo + ", tarjeta=" + tarjeta + '}';
    }
    
    
    
    
    
}

