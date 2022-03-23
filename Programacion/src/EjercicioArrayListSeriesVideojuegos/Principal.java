package EjercicioArrayListSeriesVideojuegos;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Serie> listaSeries = new ArrayList<Serie>();
        ArrayList<Videojuego> listaVideojuegos = new ArrayList<Videojuego>();

        listaSeries.add(new Serie());
        listaSeries.add(new Serie("Juego de tronos", "George R. R. Martin "));
        listaSeries.add(new Serie("Los Simpsons", 25, "Humor", "Matt Groening"));
        listaSeries.add(new Serie("Padre de familia", 12, "Humor", "Seth MacFarlane"));
        listaSeries.add(new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan"));

        listaVideojuegos.add(new Videojuego());
        listaVideojuegos.add(new Videojuego("Assasin creed 2", 30, "Aventura", "EA"));
        listaVideojuegos.add(new Videojuego("God of war 3", 25));
        listaVideojuegos.add(new Videojuego("Super Mario 3DS", 30, "Plataforma", "Nintendo"));
        listaVideojuegos.add(new Videojuego("Final fantasy X", 200, "Rol", "Square Enix"));

        listaSeries.get(0).entregar();
        listaSeries.get(1).entregar();
        listaVideojuegos.get(0).entregar();
        listaVideojuegos.get(1).entregar();

        //// SERIES Y VIDEOJUEGOS ENTREGADOS
        int entregados = 0;
        Iterator<Serie> ser = listaSeries.iterator();
        while (ser.hasNext()) {
            Serie serie = ser.next();
            if (serie.isEntregado()) {
                entregados += 1;
            }
        }
        Iterator<Videojuego> vid = listaVideojuegos.iterator();
        while (vid.hasNext()) {
            Videojuego videojuego = vid.next();
            if (videojuego.isEntregado()) {
                entregados += 1;
            }
        }
        System.out.println("Hay " + entregados + " articulos entregados");
//// VIDEOJUEGO CON MÁS HORAS Y SERIE CON MÁS TEMPORADAS
        int serieMayor = 0;
        int videojuegoMayor = 0;

        for (int i = 1; i < listaSeries.size(); i++) {
            if (listaSeries.get(serieMayor).getNumeroTemporadas() < listaSeries.get(i).getNumeroTemporadas()) {
                serieMayor = i;
            }
        }
        for (int i = 1; i < listaVideojuegos.size(); i++) {
            if (listaVideojuegos.get(videojuegoMayor).getHorasEstimadas() < listaVideojuegos.get(i).getHorasEstimadas()) {
                videojuegoMayor = i;
            }
        }
        System.out.println(listaSeries.get(serieMayor));
        System.out.println(listaVideojuegos.get(videojuegoMayor));
    }
}
