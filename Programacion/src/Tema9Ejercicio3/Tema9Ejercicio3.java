package Tema9Ejercicio3;

import java.util.Scanner;
import java.util.Stack;

public class Tema9Ejercicio3 {
    public static void main(String[] args) {
        Stack<String> caracteres = new Stack<String>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las letras que quieras.");
        while (true) {
            String line = teclado.nextLine();
            if (line.equals("")) {
                break;
            }
            caracteres.push(line);
        }
        System.out.println("Operaciones");
        while (!caracteres.isEmpty()) {
            System.out.println(caracteres.pop());
        }
    }
}