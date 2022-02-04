package lab3p2_joecorrales_pamelaramirez;

public class Persona {
    protected String nombre;
    protected String identidad;
    protected String cumpleAnnios;

    public Persona() {}

    public Persona(String nombre, String identidad, String cumpleAnnios) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.cumpleAnnios = cumpleAnnios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getCumpleAnnios() {
        return cumpleAnnios;
    }

    public void setCumpleAnnios(String cumpleAnnios) {
        this.cumpleAnnios = cumpleAnnios;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" \nNombre = '").append(this.nombre).append('\'');
        sb.append(", \nIdentidad = '").append(this.identidad).append('\'');
        sb.append(", \nFecha de Nacimiento = '").append(this.cumpleAnnios).append('\'');
        return sb.toString();
    }
}
