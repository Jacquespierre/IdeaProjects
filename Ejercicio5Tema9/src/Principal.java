import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Principal {
    private static String apellido1;
    private static String apellido2;
    private static String nombre;

    public static void main(String[] args) {
        int numeroAlumnos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de alumnos que quieres gestionar.");
        numeroAlumnos = teclado.nextInt();

        Comparator <Alumnos> comparator = Comparator.comparing(Alumnos::getApellido1).
                                                    thenComparing(Alumnos::getApellido2).
                                                    thenComparing(Alumnos::getNombre);

        String nombre = new PriorityQueue<>(comparator);

        for(int i = 0; i < numeroAlumnos; i++){
            System.out.println("Introduce el primer apellido:");
            apellido1=teclado.nextLine();
            System.out.println("Introduce el segundo apellido:");
            apellido2=teclado.nextLine();
            System.out.println("Introduce el nombre:");
            nombre=teclado.nextLine();
        }

        Alumnos.add(new Alumnos("Apell1.1","Apell1.2","NombreAlumno1"));
        Alumnos.add(new Alumnos("Apell2.1","Apell2.2","NombreAlumno2"));


    }
}
