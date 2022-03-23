/*
1. Introduce un trabajador controlando duplicados.
2. Busca un trabajador por NIF, si existe, mostrar su nombre" +
    y sino mensaje de error.
3. Buscar un trabajador por mombre, si existe mostrar su NIF y sino error.");
4. Modificar trabajador, controlar si existe, en caso que sí, se deberá"
    borrar el existente y volverlo a crear con los nuevos datos.
5. Borrar trabajador
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Probador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String, String> trabajadores = new HashMap<>();
        String nif, nombre;
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1. Introduce un trabajador controlando duplicados.");
            System.out.println("2. Busca un trabajador por NIF.");
            System.out.println("3. Buscar un trabajador por mombre.");
            System.out.println("4. Modificar trabajador.");
            System.out.println("5. Borrar trabajador");

            try {
                System.out.println("Elige una opción.");
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el NIF del trabajador.");
                        nif = teclado.next();
                        System.out.println("Introduce el nombre.");
                        nombre = teclado.next();
                        if (trabajadores.containsKey(nif)) {
                            System.out.println("El trabajador ya existe.");
                        } else {
                            trabajadores.put(nif, nombre);
                        }
                        break;
                    case 2:
                        System.out.println("Introduce el NIF del trabajador.");
                        nif = teclado.next();
                        if (trabajadores.containsKey(nif)) {
                            System.out.println("El nombre es " + trabajadores.get(nif));
                        }
                        System.out.println("El trabajador no existe.");

                        break;
                    case 3:
                        System.out.println("Introduce el nombre del trabajador.");
                        nombre = teclado.next();
                        for (nif : trabajadores.keySet()) {
                            if (trabajadores.get(nif).equals(nombre)) {
                                System.out.println("El trabajador es ";
                            }
                            System.out.println("El trabajador no existe");
                        }
                        break;
                    case 4:
                        System.out.println("Introduce el NIF del trabajador");
                        nif = teclado.next();
                        System.out.println("Introduce el nombre cambiado.");
                        nombre = teclado.next();

                        if (trabajadores.containsKey(nif)) {
                            trabajadores.remove(nif);
                            trabajadores.put(nif, nombre);
                            System.out.println("Cambio realizado.");
                        }
                        break;
                    case 5:
                        System.out.println("Introduce el NIF del trabajador.");
                        nif = teclado.next();
                        if (trabajadores.containsKey(nif)) {
                            trabajadores.remove(nif);
                        } else {
                            System.out.println("El trabajador no existe.");
                        }
                        break;
                    default:
                        System.out.println("Introduce un numero correcto.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número");
            }
        }
    }
}
