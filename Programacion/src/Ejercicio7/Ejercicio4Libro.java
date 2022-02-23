package Ejercicio7;

import java.util.Scanner;

public class Ejercicio4Libro {
    public static void main(String[] args) {
        String cadena;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto");
        cadena = teclado.nextLine();

        while (true){
            System.out.println("Que posicion quieres buscar?");
            int posicion = teclado.nextInt();
            try {
                System.out.println(posicion + " "+cadena.charAt(posicion));

            }catch ();
        }
    }
    public static void imprimircaracter(){

    }
}