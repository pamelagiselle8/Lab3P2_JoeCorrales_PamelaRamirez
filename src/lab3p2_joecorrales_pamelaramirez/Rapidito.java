
package lab3p2_joecorrales_pamelaramirez;


public class Rapidito extends Transporte{
    // ArrayList <Alumno> alumnos = new ArrayList();
    int sillas = 0;
    // int capacidadMax = sillas;

    public Rapidito() {
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Sillas: " + sillas;
    }
}
