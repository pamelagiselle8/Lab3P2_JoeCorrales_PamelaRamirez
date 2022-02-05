package lab3p2_joecorrales_pamelaramirez;

import java.util.Scanner;

public class FuncionesEstaticas {

    //Este metodo crea y agrega la clase automaticamente
    private static void crearYsumarClase() {
        int codigoStu = myNextInt("Id Estudinate: ");
        String nombre = myNextString("Nombre de la clase: ");
        int codigo = myNextInt("Codigo de la clase: ");
        for (int i = 0; i < alumnos.size(); i++) {
           if (codigoStu == alumnos.get(i).getIdEstudiante()
           && codigo != alumnos.get(i).getCodigo() ) {
               alumnos.get(i).clases.add(new Clase(nombre, codigo));
           } else System.out.println("Ese ID no existe");
        }
    }

    private static void crearAlumno() {
        String nombre = myNextString("Nombre del estudiante: ");
        String cumpleAnnios = myNextString("Fecha de nacimiento: ");
        alumnos.add(new Alumno(nombre, cumpleAnnios));
    }

    private static Estacion crearEstacion() {
        String nombre = myNextString("Nombre de la estacion: ");
        int x = myNextInt("Coordenada en x: ");
        int y = myNextInt("Coordenada en y: ");
        return new Estacion(nombre, x, y);
    }

    private static Transportista crearTransportista() {
        String nombre = myNextString("Nombre del transportista: ");
        String cumpleAnnios = myNextString("Fecha de nacimiento");
        int anniosExp = myNextInt("Años de experiencia: ");
        String apodo = myNextString("Apodo del transportista: ");
        return new Transportista(nombre, cumpleAnnios, anniosExp, apodo);
    }

    private static Transporte crearTransporte() {
        String placa = myNextString("Ingrese la placa: ");
        String color = myNextString("Ingrese el color del transporte: ");
        for (int i = 0; i < transportes.size(); i++) {
            if (placa.equalsIgnoreCase(transportes.get(i).getPlaca())) {
                System.out.println("Esa placa ya existe!");
            }
        }
        return new Transporte(placa, color);
    }


    private static void simulacion() {
        //Codigo de la simulacion
    }

    private static void listarClases() {
        int codigoStu = myNextInt("Ingrese su codigo estudiantil: ");
        for (int i = 0; i < alumnos.size(); i++) {
            if (codigoStu == alumnos.get(i).getIdEstudiante()) {
                System.out.println("Hola "+ alumnos.get(i).getNombre());
                System.out.println("Sus clases son: ");
                for (int j = 0; j < alumnos.get(i).clases.size(); j++) {
                    System.out.println((i+1) + ". "+ alumnos.get(i).clases.get(j));
                }
            } else System.out.println("Ese codigo no existe!");
        }
    }

    private static void listarLista(ArrayList<Object> lista, String tipoDeLista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i+1)+". "+ lista.get(i));
        }
    }

    public static int myNextInt(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje);
        return input.nextInt();
    }

    public static String myNextString(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje);
        return input.next();
    }
}
