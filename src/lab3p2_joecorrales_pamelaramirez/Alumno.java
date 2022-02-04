package lab3p2_joecorrales_pamelaramirez;

import java.util.ArrayList;

public class Alumno extends Persona {
    protected String idEstudiante;
    protected ArrayList<Clase> clases;

    public Alumno() {}

    public Alumno(String nombre, String identidad, String cumpleAnnios, String idEstudiante) {
        super(nombre, identidad, cumpleAnnios);
        this.idEstudiante = idEstudiante;
        clases = new ArrayList<Clase>();
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    //=============================
    //No se si se necesitan
    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }
    // =============================


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alumno { ");
        sb.append(super.toString());
        sb.append(" \nIdentidad Estudiantil = '").append(idEstudiante).append('\'');
        sb.append(", \nClases = ").append(clases.size());
        sb.append(" \n}");
        return sb.toString();
    }
}
