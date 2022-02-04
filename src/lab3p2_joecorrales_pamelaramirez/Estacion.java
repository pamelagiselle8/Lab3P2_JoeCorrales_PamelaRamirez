
package lab3p2_joecorrales_pamelaramirez;


public class Estacion {
    String nombre = "";
    int x = 0;
    int y = 0;

    public Estacion() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "\n Nombre: " + nombre + "\n Coordenada en x: " + x + "\n Coordenada en y: " + y;
    }
}
