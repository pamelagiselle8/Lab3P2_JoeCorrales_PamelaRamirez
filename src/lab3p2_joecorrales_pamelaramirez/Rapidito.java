
package lab3p2_joecorrales_pamelaramirez;

import java.util.ArrayList;


public class Rapidito extends Transporte{
    int sillas = 0;

    public Rapidito() {
        
    }
    
    public Rapidito(String placa, String color, int sillas){
        super(placa, color);
        this.sillas = sillas;
        super.tipo = "Rapidito";
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
        super.capacidad = sillas;
    }
    

    @Override
    public String toString() {
        return super.toString() + "\n Sillas: " + sillas;
    }
}
