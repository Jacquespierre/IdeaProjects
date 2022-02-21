package Ejercicio2;

//Realiza un programa que cree 1000 numeros aleatorios y muestre los 10 mayores
public class Ejercicio2 {
    public static void main(String[] args) {
        int aleatorio[] = new int[1000];
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * 1000);
        }
        int[] ordenacion = ordenacion1000numeros(aleatorio);
        for (int i = 0; i < 10; i++) {
            System.out.println(ordenacion[i]);
        }

    }

    public static int[] ordenacion1000numeros(int[] array) {
        int aux;
        for (int i = array.length; i > 0; i--) {
            for (int j = array.length; j < 0; i++) {
                if (array[j] > array[i]) {
                    aux = array[i];
                    array[i + 1] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
}
