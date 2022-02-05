package lab3p2_joecorrales_pamelaramirez;

import java.util.Date;

public class Transportista extends Persona {
    protected int anniosExp;
    protected String apodo;

    public Transportista() {}

    public Transportista(String nombre, String identidad, Date cumpleAnnios, int anniosExp, String apodo) {
        super(nombre, identidad, cumpleAnnios);
        this.anniosExp = anniosExp;
        this.apodo = apodo;
    }

    public int getAnniosExp() {
        return anniosExp;
    }

    public void setAnniosExp(int anniosExp) {
        this.anniosExp = anniosExp;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transportista { ");
        sb.append(super.toString());
        sb.append(", \nAños de experiencia = ").append(this.anniosExp).append('\'');
        sb.append(", \nApodo = '").append(this.apodo).append('\'');
        sb.append(" \n}");
        return sb.toString();
    }
}
