package Ejercicio1;
//Realiza un método que tome como parametros de entrada dos arrays entereros y devuelva como salida un unico
//array con los elementos de los anteriores arrays ordenados de forma ascendete


import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] array = ordenaPositivo(
                new int[]{1, 2, 3, 8, 7, 9},
                new int[]{1, 3, 4, 6}
        );
        System.out.println(Arrays.toString(array));
    }


    public static int[] ordenaPositivo(int[] array1, int[] array2) {
        //Genero un array de suma
        int length = array1.length + array2.length;
        int[] nuevoArray = new int[length];
        System.arraycopy(array1, 0, nuevoArray, 0, array1.length);
        System.arraycopy(array2, 0, nuevoArray, array1.length, array2.length);
        return burbuja(nuevoArray);

    }

    public static int[] burbuja(int[] array) {
        int aux;
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                if (array[j] > array[j+1]) {
                    aux = array[j+1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }

            }

        }
        return array;
    }
}
   /*public static void ordena(int array[]) {
        int aux;
        boolean cambio;
        for (int i = array.length; i > 0; i--) {
            cambio = false;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                    cambio = true;
                }
            }
        }
    }
    */