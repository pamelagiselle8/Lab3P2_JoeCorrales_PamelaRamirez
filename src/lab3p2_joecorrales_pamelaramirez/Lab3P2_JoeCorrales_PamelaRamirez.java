package lab3p2_joecorrales_pamelaramirez;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab3P2_JoeCorrales_PamelaRamirez {
    static Scanner lea = new Scanner(System.in);
    static ArrayList <Estacion> estacionesMain = new ArrayList();
    static ArrayList <Alumno> alumnos = new ArrayList();
    static ArrayList <Estacion> estaciones = new ArrayList();
    static ArrayList <Transporte> transportes = new ArrayList();
    static ArrayList <Transportista> transportistas = new ArrayList();
    static Transporte transporte = new Transporte();
    static Transportista transportista = new Transportista();
    static ArrayList <Clase> clases = new ArrayList();
    
    public static void main(String[] args) {
        ejecutar();
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
            + "\n 9. Listar estaciones"
            + "\n 10. Listar alumnos"
            + "\n 11. Listar transportistas"
            + "\n 12. Listar transportes"
            + "\n Ingrese una opción: ");
    }

    private static void ejecutar(){
        switch(menu()){
            case 1: {
                crearYsumarClase();
                ejecutar();
                break;
            }
            case 2: {
                agregarEstacion();
                ejecutar();
                break;
            }
            case 3: {
                crearAlumno();
                ejecutar();
                break;
            }
            case 4: {
                crearYsumarClase();
                ejecutar();
                break;
            }
            case 5: {
                crearTransportista();
                ejecutar();
                break;
            }
            case 6: {
                agregarTransporte();
                ejecutar();
                break;
            }
            case 7: {
                ejecutarSimulacion();
                ejecutar();
                break;
            }
            case 8: {
                listarClases();
                ejecutar();
                break;
            }
            case 9: {
                listarEstaciones();
                ejecutar();
                break;
            }
            case 10: {
                listarAlumnos();
                ejecutar();
                break;
            }
            case 11: {
                listarTransportistas();
                ejecutar();
                break;
            }
            case 12: {
                listarTransportes();
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
                + "\n 11. Destruccion"
                + "\n Ingrese una opción: ");
    }
    
    private static void ejecutarSimulacion(){
        switch(menuSimulacion()){
            case 1: {
                escogerTr();
                ejecutarSimulacion();
                break;
            }
            case 2: {
                subirAlumno();
                ejecutarSimulacion();
                break;
            }
            case 3: {
                bajarAlumno();
                ejecutarSimulacion();
                break;
            }
            case 4: {
                listarTr();
                ejecutarSimulacion();
                break;
            }
            case 5: {
                escogerTransportista();
                ejecutarSimulacion();
                break;
            }
            case 6: {
                transportista = new Transportista();
                ejecutarSimulacion();
                break;
            }
            case 7: {
                agregarRuta();
                ejecutarSimulacion();
                break;
            }
            case 8: {
                borrarRuta();
                ejecutarSimulacion();
                break;
            }
            case 9: {
                System.out.println("\n Tipo de transporte: " + transporte.tipo);
                System.out.println(transporte);
                System.out.println("\n");
                ejecutarSimulacion();
                break;
            }
            case 10: {
                comenzar();
                System.out.println("Fin");
                ejecutar();
                break;
            }
            case 11: {
                for (Transporte t : transportes) {
                    if (t == transporte) {
                        listarTr();
                        for (Alumno a : alumnos) {
                            for (Alumno aa : t.alumnos) {
                                if (a == aa) {
                                    alumnos.remove(a);
                                }
                            }
                        }
                        transportes.remove(t);
                    }
                }
                ejecutarSimulacion();
                break;
            }
            case 0: {
                ejecutar();
                break;
            }
            default: {
                System.out.println("\n Ingrese una opción válida. \n");
                ejecutarSimulacion();
                break;
            }
        }
    }
    
    private static void comenzar(){
        int cant = transporte.alumnos.size() / transporte.estaciones.size();
        for (Estacion e : transporte.estaciones) {
            System.out.println("Estación " + e.nombre);
            System.out.println("Bajarán los siguientes alumnos:");
            for (int i = 0; i < cant; i++) {
                System.out.println("-" + transporte.getAlumnos().get(i).nombre);
                transporte.alumnos.remove(i);
            }
        }
    }

    private static int myNextInt(String mensaje) {
        System.out.print(mensaje);
        int op = lea.nextInt();
        return op;
    }
    
    private static void agregarRuta(){
        String nom = myNextString("Ingrese el nombre de la estación a añadir: ");
        boolean si = false;
        for (Estacion e : estaciones) {
            if (e.nombre.equalsIgnoreCase(nom)) {
                transporte.estaciones.add(e);
                si = true;
            }
        }
        if (!si) {
            System.out.println("\n No existe una estacion con el nombre ingresado.\n");
        }
    }
    
    private static void borrarRuta(){
        String nom = myNextString("Ingrese el nombre de la estación a añadir: ");
        boolean si = false;
        for (Estacion e : estaciones) {
            if (e.nombre.equalsIgnoreCase(nom)) {
                transporte.estaciones.remove(e);
                si = true;
            }
        }
        if (!si) {
            System.out.println("\n No existe una estacion con el nombre ingresado.\n");
        }
    }
    
    private static void listarTr(){
        for (Alumno a : transporte.getAlumnos()) {
            System.out.println(a);
        }
    }
    
    private static void escogerTr(){
        String placa = myNextString("Ingrese la placa del transporte: ");
        for (Transporte t : transportes) {
            if (t.placa.equalsIgnoreCase(placa)) {
                transporte = t;
            }
        }
    }
    
    private static void escogerTransportista(){
        String id = myNextString("Ingrese la identidad del transporte: ");
        for (Transportista t : transportistas) {
            if (t.identidad.equalsIgnoreCase(id)) {
                transportista = t;
            }
        }
    }
    
    private static void subirAlumno(){
        System.out.println(transporte.alumnos);
        if (transporte.alumnos.size() <= transporte.capacidad) {
            System.out.print("Ingrese el id estudiantil del alumno: ");
            String id = lea.next();
            boolean si = false;
            for (Alumno a : alumnos) {
                if (a.idEstudiante.equalsIgnoreCase(id)) {
                    transporte.alumnos.add(a);
                    alumnos.remove(a);
                    si = true;
                }
            }
            if (!si) {
                System.out.println("\n No existe ningun alumno con ese id \n");
            }
        }
        else{
            System.out.println("\n Se ha alcanzado la capacidad máxima del vehículo. \n");
        }
    }
    
    private static void bajarAlumno(){
        System.out.print("Ingrese el id del alumno: ");
        String id = lea.next();
        for (Alumno a : alumnos) {
            if (a.idEstudiante.equalsIgnoreCase(id)) {
                transporte.getAlumnos().remove(a);
            }
        }
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
            System.out.println("\n Ya existe otro transporte con esa placa. \n");
            agregarTransporte();
        }
    }

    
    private static void tipoTransporte(String placa, String color){
        int op = myNextInt("\nDeclare el tipo de transporte:"
                + "\n1. Bus"
                + "\n 2. Rapidito"
                + "\n 3. Taxi"
                + "\n 4. Mototaxi"
                + "\n Ingrese una opcion: ");
        switch(op){
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
    
    private static void agregarClase(){
        System.out.print("\nIngrese el nombre de la clase: ");
        String nombre = lea.next();
        System.out.print("\nIngrese el codigo de la clase: ");
        int codigo = lea.nextInt();
        boolean si = true;
        for (Clase c : clases) {
            if (c.codigo == codigo) {
                si = false;
            }
        }
        if (si) {
            clases.add(new Clase(nombre, codigo));
        }
        else{
            System.out.println("\nYa existe una clase con ese codigo.\n");
        }
    }
    
    //Este metodo crea y agrega la clase automaticamente
    private static void crearYsumarClase() {
        String codigoStu = myNextString("Id Estudinate: ");
        String nombre = myNextString("Nombre de la clase: ");
        int codigo = myNextInt("Codigo de la clase: ");
        boolean si = false;
        if (alumnos.isEmpty()) {
            System.out.println("\n No hay ningun alumno en registro actualmente.");
        }
        else{
            if (clases.isEmpty()) {
                System.out.println("\n No hay ninguna clase en registro actualmente.");
            }
            else{
                for (Alumno a : alumnos) {
                    if (a.idEstudiante.equalsIgnoreCase(codigoStu)) {
                        for (Clase c : clases) {
                            if (c.codigo == codigo) {
                                a.clases.add(new Clase(nombre, codigo));
                                si = true;
                            }
                        }
                        if (si) {
                            System.out.println("\nNo hay una clase con ese codigo registrada.\n");
                        }
                    }
                }
            }
        }
    }

    private static void crearAlumno() {
        boolean si = true;
        String nombre = myNextString("Nombre del estudiante: ");
        String id = myNextString("Identidad: ");
        for (Alumno a : alumnos) {
            if (a.identidad.equalsIgnoreCase(id)) {
                si = false;
            }
        }
        if (si) {
            String cumple = myNextString("Fecha de nacimiento en formato 'día/mes/año': ");
            Date fecha = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            try {
                fecha = formato.parse(cumple);
            } catch (ParseException ex) {
                Logger.getLogger(Lab3P2_JoeCorrales_PamelaRamirez.class.getName()).log(Level.SEVERE, null, ex);
            }
            String idE = myNextString("Identidad estudiantil: ");
            for (Alumno a : alumnos) {
                if (a.idEstudiante.equalsIgnoreCase(idE)) {
                    si = false;
                }
            }
            if (si) {
                alumnos.add(new Alumno(nombre, id, fecha, idE));
            }
            else{
                System.out.println("\n No es posible agregar el alumno porque ya existe un alumno con la misma identidad estudiantil.");
            }
        }
        else{
            System.out.println("\n No es posible agregar el alumno porque ya existe un alumno con la misma identidad.");
        }
    }

    private static void crearTransportista() {
        boolean si = true;
        String nombre = myNextString("Nombre del transportista: ");
        String id = myNextString("Identidad: ");
        for (Transportista a : transportistas) {
            if (a.identidad.equalsIgnoreCase(id)) {
                si = false;
            }
        }
        if (si) {
            String cumple = myNextString("Fecha de nacimiento en formato 'día/mes/año': ");
            Date fecha = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            try {
                fecha = formato.parse(cumple);
            } catch (ParseException ex) {
                Logger.getLogger(Lab3P2_JoeCorrales_PamelaRamirez.class.getName()).log(Level.SEVERE, null, ex);
            }
            int anniosExp = myNextInt("Años de experiencia: ");
            String apodo = myNextString("Apodo del transportista: ");
            transportistas.add(new Transportista(nombre, id, fecha, anniosExp, apodo));
        }
        else{
            System.out.println("\n No es posible agregar el transportista porque ya existe un transportista con la misma identidad.");
        }
    }

    private static void listarClases() {
        String codigoStu = myNextString("Ingrese su codigo estudiantil: ");
        boolean si = false;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getIdEstudiante().equalsIgnoreCase(codigoStu)) {
                si = true;
                System.out.println("Hola "+ alumnos.get(i).getNombre());
                System.out.println("Sus clases son: ");
                for (int j = 0; j < alumnos.get(i).clases.size(); j++) {
                    int indice = i + 1;
                    System.out.println(indice + ". " + alumnos.get(i).clases.get(j));
                }
            }
        }
        if (!si) {
            System.out.println("\n No existe ningun alumno con ese id.\n");
        }
    }

    private static void listarAlumnos() {
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println((i+1)+". "+ alumnos.get(i));
        }
    }
    
    private static void listarEstaciones() {
        for (int i = 0; i < estaciones.size(); i++) {
            System.out.println((i+1)+". "+ estaciones.get(i));
        }
    }
    
    private static void listarTransportistas() {
        for (int i = 0; i < transportistas.size(); i++) {
            System.out.println((i+1)+". "+ transportistas.get(i));
        }
    }
    
    private static void listarTransportes() {
        for (int i = 0; i < transportes.size(); i++) {
            System.out.println((i+1)+". "+ transportes.get(i));
        }
    }

    private static String myNextString(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje);
        return input.next();
    }
}
