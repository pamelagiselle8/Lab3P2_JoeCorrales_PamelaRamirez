
package lab3p2_joecorrales_pamelaramirez;


public class Taxi extends Transporte{
    int numTaxi = 0;
    int capacidadMax = 4;

    public Taxi() {
        
    }
    
    public Taxi(String placa, String color, int numTaxi) {
        super(placa, color);
        this.numTaxi = numTaxi;
    }

    public int getNumTaxi() {
        return numTaxi;
    }

    public void setNumTaxi(int numTaxi) {
        this.numTaxi = numTaxi;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Numero de taxi: " + numTaxi + "\n Capacidad maxima: " + capacidadMax;
    }
}
