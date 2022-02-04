package lab3p2_joecorrales_pamelaramirez;

public class Clase {
    protected String nombre;
    protected int codigo;

    public Clase() {}

    public Clase(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clase { ");
        sb.append(" \nNombre='").append(this.nombre).append('\'');
        sb.append(", \nCodigo=").append(this.codigo);
        sb.append(" \n}");
        return sb.toString();
    }
}
