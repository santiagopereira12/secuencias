import java.util.Scanner;

public class OperacionesMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        //String repetir;
        String salir = null;


        do {
            System.out.println("Ingrese el primer nunmero");
            int numA = sc.nextInt();
            System.out.println("Ingrese el Segundo numero");
            int numB = sc.nextInt();
            if (numA != 0 && numB != 0) {
                System.out.println("----//Menu//----");
                System.out.println("Escoja la operacion que desea realizar");
                System.out.println("1.Suma \n2.Resta \n3.Multiplicacion \n4.Division \n5.Potencia \n6.Radicacion");
                int opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("SUMA");
                        result = numA + numB;
                        System.out.println("El resultado de la suma es: " +result);
                        break;
                    case 2:
                        System.out.println("RESTA");
                        if (numA < numB) {
                            System.out.println("Recuerda que el primer numero debe ser mayor al segundo.");
                        } else {
                            result = numA - numB;
                            System.out.println("El resultado de la resta es: " +result);
                        }
                        break;
                    case 3:
                        System.out.println("Multiplicacion");
                        result = numA * numB;
                        System.out.println("El resultado de la multiplicacion es: " +result);
                        break;
                    case 4:
                        System.out.println("DIVISION");
                        if (numA < numB) {
                            System.out.println("Recuerda que el primer numero debe ser mayor al segundo.");
                        } else {
                            result = numA / numB;
                            System.out.println("El resultado de la multiplicacion es: " +result);
                        }
                        break;
                    case 5:
                        System.out.println("POTENCIACION");
                        double resulta = Math.pow(numA, numB);
                        System.out.println("El resultado de la potenciacion es: " +resulta);
                        break;
                    case 6:
                        System.out.println("RADICACION");
                        resulta = Math.pow(numA, 1.0 / numB);
                        System.out.println("El resultado de la radicacion es: " +resulta);
                        break;
                    default:
                        System.out.println("opcion invalida");
                        break;
                }
            }else {
                System.out.println("uno de los numero ingresados es meno o igual a 0");
            }
            System.out.println("Desea realizar otra operación (s/n)");
            String repetir = sc.nextLine();
            if (repetir != "s" && repetir != "S"){
                System.out.println("Salio del sistema");
                System.out.println("Desea salir del menu (s/n)");
                salir = sc.nextLine();
                if (salir == "s" && salir == "S"){
                    break;
                }
            }
        }while (salir == "s");
    }
}
