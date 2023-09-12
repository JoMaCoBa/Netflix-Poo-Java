import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {

            // Variables
            Pelicula peliculaNueva = new Pelicula();
            Serie serieTemporadas = new Serie();
            int minutosVistos = 0;

            // ArrayList Peliculas
            ArrayList<Pelicula> peliculas = new ArrayList<>();
            peliculas.add(new Pelicula("Benjamin Button", "Drama", "David Fincher", 166, 2008));
            peliculas.add(new Pelicula("Matrix", "Accion", "Wachowski Brothers", 136, 1999));
            peliculas.add(new Pelicula("Walter Mitty", "Comedia", "Ben Stiller", 114, 2013));
            peliculas.add(new Pelicula("Your Name", "Animada", "Makoto Shinkai", 107, 2016));
            peliculas.add(new Pelicula("Spiderman 2", "SuperHeroes", "Sam Raimi", 127, 2004));

            // Marcar Peliculas Vistas
            peliculas.get(0).marcarVisto();
            peliculas.get(2).marcarVisto();
            peliculas.get(4).marcarVisto();

            // Impresion Peliculas Vistas
            System.out.println("---------------\n Peliculas Vistas \n---------------");
            for (Pelicula pelicula : peliculas) {
                if (peliculaNueva.getAnio() < pelicula.getAnio()) {
                    peliculaNueva = pelicula;
                }
                if (pelicula.esVisto()) {
                    System.out.println(pelicula + "\n---------------");
                    minutosVistos += pelicula.tiempoVisto();
                }
            }
            System.out.println("Pelicula Estreno \n" + "---------------\n" + peliculaNueva + "\n---------------");
            System.out.println("Los minutos reproducidos en Peliculas son: " + minutosVistos);

            // ArrayList Series
            ArrayList<Serie> series = new ArrayList<>();
            series.add(new Serie("The OC", "Drama", "Josh Schwartz", 3864, 4));
            series.add(new Serie("How I Meet Your Mother", "Comedia", "Carter Bays", 4576, 9));
            series.add(new Serie("House", "Drama", "David Shore", 7611, 8));
            series.add(new Serie("Lakers", "Drama", "Jeff Pearlman", 750, 2));
            series.add(new Serie("The Bear", "Drama", "Christopher Storer", 720, 2));

            // Marcar Series Vistas
            series.get(0).marcarVisto();
            series.get(3).marcarVisto();

            minutosVistos = 0;
            // Impresion Series Vistas
            System.out.println("---------------\n Series Vistas \n---------------");
            for (Serie serie : series) {
                if (serieTemporadas.getTemporadas() < serie.getTemporadas()) {
                    serieTemporadas = serie;
                }
                if (serie.esVisto()) {
                    System.out.println(serie + "\n---------------");
                    minutosVistos += serie.tiempoVisto();
                }
            }
            System.out.println("Mayor Temporadas \n" + "---------------\n" + serieTemporadas + "\n---------------");
            System.out.println("Los minutos reproducidos en Series son: " + minutosVistos);

        } catch (Exception e) {
            // Manejo de excepciones
            System.err.println("Se ha producido una excepción: " + e.getMessage());
        }

    }
}

