
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int menu;
        int subMenu;
        double n1;
        LR LR = new LR(); 
        QR QR = new QR();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("              MENU            ");
            System.out.println("");
            System.out.println("1. Static SLR");
            System.out.println("2. Custom SLR");
            System.out.println("3. Static QR");
            System.out.println("4. Custom QR");
            System.out.println("5. Polynomial");
            System.out.println("6. Exit");
            System.out.println("");
            menu = sc.nextInt();

            switch (menu) {
                case 1://Static SLR
                    do { 
                        int staticX[] = { 23, 26, 30, 34, 43, 48, 52, 57, 58 };
                        int staticY[] = { 651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518 };
                       
                       
                       
                        DataS.x.clear();
                        DataS.y.clear();

                        for (int value : staticX) {
                            DataS.x.add((double) value);
                        }
                        for (int value : staticY) {
                            DataS.y.add((double) value);
                        }
                        System.out.println("Ingrese x");
                        n1 = sc.nextDouble();
                        System.out.println("la prediccion de y es: " + LR.prediccion(n1));
                        System.out.println("Do you want to continue with Static array? (1 for Yes, 0 for No)");
                        subMenu = sc.nextInt();
                    } while (subMenu == 1);

                break;

                case 2://Custom SLR
                    System.out.println("Ingrese el tamaño de los arreglos:");
                    int size = sc.nextInt();

                    System.out.println("Ingrese los valores para el arreglo x:");
                    for (int i = 0; i < size; i++) {
                        System.out.print("Valor " + (i + 1) + ": ");
                        double valueX = sc.nextDouble();
                        DataS.x.add(valueX);
                    }

                    System.out.println("Ingrese los valores para el arreglo y:");
                    for (int i = 0; i < size; i++) {
                        System.out.print("Valor " + (i + 1) + ": ");
                        double valueY = sc.nextDouble();
                        DataS.y.add(valueY);
                    }

                    do {
                        System.out.println("Ingrese x");
                        n1 = sc.nextDouble();
                        System.out.println("la prediccion de y es: " + LR.prediccion(n1));
                        System.out.println("Do you want to continue with Static array? (1 for Yes, 0 for No)");
                        subMenu = sc.nextInt();
                    } while (subMenu == 1);

                break;

                case 3://Static QR
                    do{
                        int staticX[] = {108, 115, 106, 97, 95, 91, 97, 83, 83, 78, 54, 67, 56, 53, 61, 115, 81, 78, 30, 45, 99, 32, 25, 28, 90, 89 };
                        int staticY[] = {  95,   96,   95, 97, 93, 94, 95, 93, 92, 86, 73, 80, 65, 69, 77,   96, 87, 89, 60, 63, 95, 61, 55, 56, 94, 93 };


                        DataS.x.clear();
                        DataS.y.clear();

                        for (int value : staticX) {
                            DataS.x.add((double) value);
                        }
                        for (int value : staticY) {
                            DataS.y.add((double) value);
                        }
                        System.out.println("A: " + QR.A());
                        System.out.println("B: " + QR.B());
                        System.out.println("C: " + QR.C());
                        System.out.println("");
                        System.out.println("Ingrese x");
                        n1 = sc.nextDouble();
                        System.out.println("la prediccion de y es: " + QR.prediccion(n1));
                        System.out.println("Do you want to continue with Static array? (1 for Yes, 0 for No)");
                        subMenu = sc.nextInt();

                    }while(subMenu == 1);



                case 6:
                    System.out.println("Thanks for using this program");
                break;

                default:
                    System.out.println("Invalid input");
                break;
            }
        } while (menu != 6);

        sc.close();
    }
}