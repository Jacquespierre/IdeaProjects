package Ejercicio4;

//Ejercicio1Tema10

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static double potencia(int num1, int num2) {
        return Math.pow(num1, num2);
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        int n1,n2;
        System.out.println("Introduzca el primer número:");

        try {
            n1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El número no es válido.");
            return;
        }
        System.out.println("Introduzca el segundo número:");
        try {
            n2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El número no es válido.");
            return;
        }

        System.out.println("Introduzca la operación a realizar:");
        String op = sc.next();

        switch (op.toLowerCase()) {
            case "suma":
                resultado = suma(n1, n2);
                break;
            case "resta":
                resultado = resta(n1, n2);

            case "division":
                try {
                    resultado = division(n1, n2);
                } catch (ArithmeticException ex) {
                    System.out.println("No se permiten divisiones por 0");
                    //ex.printStackTrace();
                } catch (Exception ex) {
                    System.out.println("Error" + ex.getMessage());
                }
                break;
            case "multiplicacion":
                resultado = multiplicacion(n1, n2);
                break;
            case "potencia":
                resultado = potencia(n1, n2);
                break;
        }
        System.out.println("El resultado de la operación es: " + resultado);
    }
}
