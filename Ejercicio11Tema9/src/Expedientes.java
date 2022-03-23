import java.util.HashMap;
import java.util.Scanner;

public class Expedientes {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Integer, String> expedientes = new HashMap<>();
        int numExp;

        expedientes.put(1, "Paco");
        expedientes.put(2, "Laura");
        expedientes.put(3, "Roberto");

        System.out.println("El numero de alumnos es "+expedientes.size());
        System.out.println("Introduce el número de expediente.");
        numExp = teclado.nextInt();
    }

}
