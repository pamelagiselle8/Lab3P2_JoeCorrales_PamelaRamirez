package lab3p2_joecorrales_pamelaramirez;

import java.util.Scanner;

public class Lab3P2_JoeCorrales_PamelaRamirez {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    private static int menu(){
        int op = myNextInt("Menú\n"
                + "1. Agregar mascota\n"
                + "2. Listar mascotas\n"
                + "3. Agregar cliente\n"
                + "4. Asignar mascota a cliente\n"
                + "5. Listar clientes\n"
                + "6. Salir\n"
                + "Ingrese una opción: ");
        return op;
    }

    private static void ejecutar(){
        switch(menu()){
            case 1: {
                ejecutar();
                break;
            }
            case 2: {
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
                System.exit(0);
                break;
            }
        }
    }

    private static int myNextInt(String mensaje) {
        System.out.print(mensaje);
        return input.nextInt();
    }
}
