
package lab3p2_joecorrales_pamelaramirez;


public class Taxi extends Transporte{
    int numTaxi = 0;
    

    public Taxi() {
        super.capacidad = 4;
    }
    
    public Taxi(String placa, String color, int numTaxi) {
        super(placa, color);
        this.numTaxi = numTaxi;
        super.capacidad = 4;
        super.tipo = "Taxi";
    }

    public int getNumTaxi() {
        return numTaxi;
    }

    public void setNumTaxi(int numTaxi) {
        this.numTaxi = numTaxi;
    }

    public int getCapacidadMax() {
        return super.capacidad;
    }

    public void setCapacidadMax(int capacidadMax) {
        super.capacidad = capacidadMax;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Numero de taxi: " + numTaxi + "\n Capacidad maxima: " + super.capacidad;
    }
}
