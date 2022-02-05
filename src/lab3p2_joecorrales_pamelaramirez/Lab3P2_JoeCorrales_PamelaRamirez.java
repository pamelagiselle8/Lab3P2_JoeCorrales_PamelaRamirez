package lab3p2_joecorrales_pamelaramirez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_JoeCorrales_PamelaRamirez {
    static Scanner lea = new Scanner(System.in);
    static ArrayList <Estacion> estacionesMain = new ArrayList();
    static ArrayList <Alumno> alumnos = new ArrayList();
    static ArrayList <Estacion> estaciones = new ArrayList();
    static ArrayList <Transporte> transportes = new ArrayList();
    static ArrayList <Transportista> transportistas = new ArrayList();
    //static Transporte transporte = new Transporte();
    //static Transportista transportista = new Transportista();
    
    public static void main(String[] args) {
        menu();
    }

    private static int menu(){
        return myNextInt("Menu:"
            + "\n 0. Salir"
            + "\n 1. Crear clase"
            + "\n 2. Crear estacion"
            + "\n 3. Crear alumno"
            + "\n 4. Agregar clase a alumno"
            + "\n 5. Crear transportista"
            + "\n 6. Crear transporte"
            + "\n 7. Simulacion"
            + "\n 8. Listar clases"
            + "\n 9. Listar rutas"
            + "\n 10. Listar alumnos"
            + "\n 11. Listar transportistas"
            + "\n 12. Listar transportes"
            + "\n Ingrese una opción: ");
    }

    private static void ejecutar(){
        switch(menu()){
            case 1: {
                
                ejecutar();
                break;
            }
            case 2: {
                agregarEstacion();
                ejecutar();
                break;
            }
            case 3: {
                
                ejecutar();
                break;
            }
            case 4: {
                
                ejecutar();
                break;
            }
            case 5: {
                
                ejecutar();
                break;
            }
            case 6: {
                agregarTransporte();
                ejecutar();
                break;
            }
            case 7: {
                
                ejecutar();
                break;
            }
            case 8: {
                
                ejecutar();
                break;
            }
            case 9: {
                
                ejecutar();
                break;
            }
            case 10: {
                
                ejecutar();
                break;
            }
            case 11: {
                
                ejecutar();
                break;
            }
            case 12: {
                
                ejecutar();
                break;
            }
            case 0: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("\n Ingrese una opción válida. \n");
                menu();
                break;
            }
        }
    }
    
    private static int menuSimulacion(){
        return myNextInt("Menu:"
                + "\n 0. Salir"
                + "\n 1. Escoger transporte"
                + "\n 2. Subir alumno al transporte"
                + "\n 3. Bajar alumno del transporte"
                + "\n 4. Listar alumnos del transporte"
                + "\n 5. Escoger transportista"
                + "\n 6. Quitar transportista"
                + "\n 7. Añadir estacion"
                + "\n 8. Quitar estacion"
                + "\n 9. Imprimir transporte"
                + "\n 10. Comenzar"
                + "\n Ingrese una opción: ");
    }
    
    private static void ejecutarSimulacion(){
        switch(menuSimulacion()){
            case 1: {
                
                break;
            }
            case 2: {
                
                break;
            }
            case 3: {
                
                break;
            }
            case 4: {
                
                break;
            }
            case 5: {
                
                break;
            }
            case 6: {
                
                break;
            }
            case 7: {
                
                break;
            }
            case 8: {
                
                break;
            }
            case 9: {
                
                break;
            }
            case 10: {
                
                break;
            }
            case 0: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("\n Ingrese una opción válida. \n");
                ejecutarSimulacion();
                break;
            }
        }
    }

    private static int myNextInt(String mensaje) {
        System.out.print(mensaje);
        return lea.nextInt();
    }
    
    private static void agregarEstacion(){
        System.out.print("Ingrese el nombre de la estación: ");
        String nombre = lea.next();
        System.out.print("Ingrese la coordenada en x: ");
        int x = lea.nextInt();
        System.out.print("Ingrese la coordenada en y: ");
        int y = lea.nextInt();
        estaciones.add(new Estacion(nombre, x, y));
    }
    
    private static void agregarTransporte(){
        boolean si = false;
        System.out.print("Ingrese la placa: ");
        String placa = lea.next();
        if (transportes.isEmpty()) {
            si = true;
        }
        else{
            for (Transporte transporte : transportes) {
                if (transporte.getPlaca() == placa) {
                    si = false;
                }
            }
        }
        if (si) {
            System.out.print("Ingrese el color: ");
            String color = lea.next();
            tipoTransporte(placa, color);
        }
        else{
            System.out.println("\n Ya existe otro tranporte con esa placa. \n");
            agregarTransporte();
        }
    }

    
    private static void tipoTransporte(String placa, String color){
        switch(myNextInt("\nDeclare el tipo de transporte:"
                + "\n1. Bus"
                + "\n 2. Rapidito"
                + "\n 3. Taxi"
                + "\n 4. Mototaxi"
                + "\n Ingrese una opcion: ")){
            case 1: {
                System.out.print("Ingrese numero de sillas: ");
                int sillas = lea.nextInt();
                System.out.print("Ingrese capacidad de personas de pie: ");
                int personas = lea.nextInt();
                transportes.add(new Bus(placa, color, sillas, personas));
                break;
            }
            case 2: {
                System.out.print("Ingrese numero de sillas: ");
                int sillas = lea.nextInt();
                transportes.add(new Rapidito(placa, color, sillas));
                break;
            }
            case 3: {
                System.out.print("Ingrese el numero del taxi: ");
                int numTaxi = lea.nextInt();
                transportes.add(new Taxi(placa, color, numTaxi));
                break;
            }
            case 4: {
                transportes.add(new Mototaxi(placa, color));
                break;
            }
            default: {
                System.out.println("\n Ingrese una opción válida. \n");
                tipoTransporte(placa, color);
                break;
            }
        }
    }
}
