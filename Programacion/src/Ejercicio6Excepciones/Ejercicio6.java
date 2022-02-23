package Ejercicio6Excepciones;

import java.util.Scanner;

public class Ejercicio6 {

    public static int lecturaaño() throws ExcepcionEdadInvalida {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el año de nacicmiento.");
        int año = teclado.nextInt();

        if (año < 0) {
            throw new ExcepcionEdadInvalida();
        }
        return año;
    }



    public static void main(String[] args) {
        try {
            System.out.println("Has introducido el año " + lecturaaño());
        } catch (ExcepcionEdadInvalida ex) {
            System.out.println("El año no es correcto");
        }

    }
}
