
package lab3p2_joecorrales_pamelaramirez;

import java.util.ArrayList;


public class Bus extends Transporte{
    int sillas = 0;
    int personasDePie = 0;

    public Bus() {
        
    }
    
    public Bus(String placa, String color, int sillas, int personasDePie){
        super(placa, color);
        this.sillas = sillas;
        this.personasDePie = personasDePie;
    }
    
    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public int getPersonasDePie() {
        return personasDePie;
    }

    public void setPersonasDePie(int personasDePie) {
        this.personasDePie = personasDePie;
    }
    
    public int getCapacidadMax(){
        return sillas + personasDePie;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Sillas: " + sillas + "\n Capacidad de personas de pie: " + personasDePie;
    }
}
