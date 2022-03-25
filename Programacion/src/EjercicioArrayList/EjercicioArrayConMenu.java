package EjercicioArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioArrayConMenu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1.Agregar un número");
            System.out.println("2.Buscar un número");
            System.out.println("3.Buscar un número");
            System.out.println("4.Modificar un número");
            System.out.println("5.Eliminar un número");
            System.out.println("6.Insertar un número en una posición dada");
            System.out.println("7.Salir");

            try {
                System.out.println("Escribe una de las opciones.");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número correcto");
                teclado.nextInt();
            }
        }

    }
}
