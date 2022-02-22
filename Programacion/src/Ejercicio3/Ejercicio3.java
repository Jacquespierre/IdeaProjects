package Ejercicio3;

import java.util.Scanner;

//Realiza un programa que lea por teclado dos cadenas de texto y compruebe si son palindromo
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una linea: ");
        String linea = teclado.nextLine();
        if (palindromo(linea)) {
            System.out.println("El texto ES un palíndrono.");
        } else {
            System.out.println("El texto NO ES un palindromo.");
        }
    }

    public static boolean palindromo(String linea) {
        linea = linea.replace(" ", "");

        StringBuffer aux = new StringBuffer(linea);

        if (aux.reverse().toString().equalsIgnoreCase(linea)) {
            return true;
        }
        return false;
    }
}
