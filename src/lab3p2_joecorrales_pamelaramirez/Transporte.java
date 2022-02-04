
package lab3p2_joecorrales_pamelaramirez;

import java.util.ArrayList;


public class Transporte {
    protected String placa = ""; // <- unica
    protected String color = "";
    protected Transportista transportista = new Transportista();
    protected ArrayList <Estacion> estaciones = new ArrayList();
    protected ArrayList <Alumno> alumnos = new ArrayList();
    
    public Transporte() {
        
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    // Metodos de administracion
    public void subirAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
    
    public void bajarAlumno(Alumno alumno){
        this.alumnos.remove(alumno);
    }
    
    public void quitarTransportista(){
        transportista = new Transportista();
    }
    
    public void simulacion(){
        
    }
    
    @Override
    public String toString() {
        return "\n Placa: " + placa + "\n Color: " + color + "\n Estaciones: " + estaciones;
    }
}
