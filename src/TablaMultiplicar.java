import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir;
        do {
            System.out.print("Ingrese el numero de la primera tabla: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingrese el numero de la tabla final: ");
            int num2 = scanner.nextInt();
            tablaMultiplicacion(num1, num2);
            System.out.print("Desea ingresar otra secuencia de tablas (s/n): ");
            repetir = scanner.next().charAt(0);
        } while (repetir == 's' || repetir == 'S');
        scanner.close();
    }

    public static void tablaMultiplicacion(int valorA, int valorB) {
        if (valorA != 0 && valorB != 0) {
            for (int i = valorA; i <= valorB; i++) {
                for (int j = 1; j <= 10; j++) {
                    int resultado = i * j;
                    System.out.println(i + " X " + j + " = " + resultado);
                }
                System.out.print("Presione Enter para continuar...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                scanner.close();
                limpiarPantalla();
            }
        } else {
            System.out.println("Recuerde que cualquiera de los datos suministrados debe ser mayor a 0");
        }
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
