package Ejercicio8;

import java.util.Scanner;

//Dado un array de numeros enteros de N posiciones, rellenarlo y guardar
//sus valores en otro array distinto pero con los valores invertidos.
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la cadena: ");
        int tamaño = teclado.nextInt();

        //Relleno de array
        int[] original = rellenaArray(tamaño);
        int[] invertido = invertirArray(original);

    }

    public static int[] rellenaArray(int tamaño) {
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = (int) (Math.random() * 50000000);
        }
        return array;
    }

    public static int[] invertirArray(int[] original) {
        int[] invertido = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];


        }
        return invertido;
    }
}