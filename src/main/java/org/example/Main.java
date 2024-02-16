package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        int respuesta = 0;
        Scanner scanner = new Scanner(System.in);
        while (respuesta != 5 ){
            System.out.println("Elija la operación que deseaa realizar");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            respuesta = scanner.nextInt();
            switch (respuesta) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicacion();
                    break;
                case 4:
                    division();
                    break;
            }
        }
        scanner.close();
        System.out.println("Vuelva pronto!!");

    }


    public static double obtenerV1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Valor 1");
        double leer=scanner.nextDouble();

        return leer;
    }

    public static double obtenerV2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Valor 2");
        double leer=scanner.nextDouble();

        return leer;
    }

    public static void suma()
    {
        double v1 =obtenerV1();
        double v2 = obtenerV2();

        double res= v1+v2;
        System.out.println("El resultado es: "+ res);


    }
    public static void resta()
    {
        double v1 =obtenerV1();
        double v2 = obtenerV2();

        double res= v1-v2;
        System.out.println("El resultado es: "+ res);

    }
    public static void multiplicacion()
    {
        double v1 =obtenerV1();
        double v2 = obtenerV2();

        double res= v1*v2;
        System.out.println("El resultado es: "+ res);
    }
    public static void division()
    {
        while (true) {

            double v1 =obtenerV1();
            double v2 = obtenerV2();

            try {
                double res= v1/v2;

                System.out.println("El resultado es: "+ res);
                break;
            } catch (ArithmeticException e) {

                System.out.println("Error: No se puede dividir entre cero. Por favor, ingrese un denominador diferente.");
            }
        }


    }




}