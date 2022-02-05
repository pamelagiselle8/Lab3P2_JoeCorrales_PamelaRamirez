
package lab3p2_joecorrales_pamelaramirez;


public class Mototaxi extends Transporte{
    int capacidadMax = 2;

    public Mototaxi() {
        
    }

    public Mototaxi(String placa, String color) {
        super(placa, color);
    }
    
    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Capacidad maxima: " + capacidadMax;
    }
}
