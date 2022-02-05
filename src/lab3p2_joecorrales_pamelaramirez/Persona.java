package lab3p2_joecorrales_pamelaramirez;

public class Persona {
    protected String nombre;
    protected static int identidad;
    protected String cumpleAnnios;

    public Persona() {}

    public Persona(String nombre, String cumpleAnnios) {
        this.nombre = nombre;
        identidad = Persona.identidad++;
        this.cumpleAnnios = cumpleAnnios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentidad() {
        return identidad;
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
