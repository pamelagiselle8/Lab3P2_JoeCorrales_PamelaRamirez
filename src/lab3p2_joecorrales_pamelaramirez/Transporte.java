
package lab3p2_joecorrales_pamelaramirez;

import java.util.ArrayList;


public class Transporte {
    String placa = ""; // <- unica
    String color = "";
    // transportista
    ArrayList <Estacion> estaciones = new ArrayList();
    
    public Transporte() {
        
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    @Override
    public String toString() {
        return "\n Placa: " + placa + "\n Color: " + color + "\n Estaciones: " + estaciones;
    }
}
