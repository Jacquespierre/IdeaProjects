import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Provincias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        HashMap<Integer, String> codigosPostales = new HashMap<>();
        codigosPostales.put(15000, "La Coruña");
        codigosPostales.put(15981, "La Coruña");
        codigosPostales.put(36000, "Pontevedra");
        codigosPostales.put(36980, "Pontevedra");
        codigosPostales.put(32000, "Ourense");
        codigosPostales.put(32930, "Ourense");
        codigosPostales.put(27000, "Lugo");
        codigosPostales.put(27891, "Lugo");

        System.out.println("Introduce el código de la provincia.");
        int codigo = teclado.nextInt();
        if (codigosPostales.containsKey(codigo)) {
            System.out.println("La provincia es " + codigosPostales.get(codigo));
        } else {
            System.out.println("El codigo postal no existe");
        }

        //Borrado de provincias
        teclado = new Scanner(System.in);
        Iterator<Map.Entry<Integer, String>> iter = codigosPostales.entrySet().iterator();
        System.out.println("Introduce la provincia que quieres borrar:");
        String nombre = teclado.nextLine();
        while (iter.hasNext()) {
            Map.Entry<Integer, String> entrada = iter.next();
            if (entrada.getValue().equals(nombre)) {
                iter.remove();
            }
        }
        System.out.println(codigosPostales);
    }
}
