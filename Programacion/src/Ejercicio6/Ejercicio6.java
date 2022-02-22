package Ejercicio6;

import Ejercicio5.Ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
    public class ExcepcionEdadInvalida extends ArithmeticException{
        ExcepcionEdadInvalida(String mensaje);
            super();
    }
    public static void main(String[] args) throws ExcepcionEdadInvalida {
        int anonaciment = 0;
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el año de nacimiento.");
            anonaciment = teclado.nextInt();
            if (anonaciment < 0) {
                System.out.println("El año es menor que 0");
            }
        } catch (InputMismatchException e) {
            System.out.println("El número no es válido.");
            return;
        }
    }
}



