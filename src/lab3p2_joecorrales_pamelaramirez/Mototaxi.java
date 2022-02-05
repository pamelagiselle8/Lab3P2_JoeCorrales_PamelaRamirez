
package lab3p2_joecorrales_pamelaramirez;


public class Mototaxi extends Transporte{
    
    
    public Mototaxi() {
        super.capacidad = 2;
        super.tipo = "Mototaxi";
    }

    public Mototaxi(String placa, String color) {
        super(placa, color);
    }
    
    public int getCapacidadMax() {
        return super.capacidad;
    }

    public void setCapacidadMax(int capacidadMax) {
        super.capacidad = capacidadMax;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Capacidad maxima: " + super.capacidad;
    }
}
