
package lab3p2_joecorrales_pamelaramirez;


public class Bus extends Transporte{
    // ArrayList <Alumno> alumnos = new ArrayList();
    int sillas = 0;
    int personasDePie = 0;
    // Capacidad máxima de lista de alumnos = numero de sillas + capacidad de personas de pie

    public Bus() {
        
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

    @Override
    public String toString() {
        return super.toString() + "\n Sillas: " + sillas + "\n Capacidad de personas de pie: " + personasDePie;
    }
}
