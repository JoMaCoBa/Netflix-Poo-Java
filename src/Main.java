public class Main {
    public static void main(String[] args) {

        // Variables
        Pelicula peliculaNueva = new Pelicula();
        Serie serieTemporadas = new Serie();
        int minutosVistos = 0;

        // Array Peliculas
        Pelicula[] peliculas = new Pelicula[5];
        peliculas[0] = new Pelicula("Benjamin Button", "Drama", "David Fincher", 166, 2008);
        peliculas[1] = new Pelicula("Matrix", "Accion", "Wachowski Brothers", 136, 1999);
        peliculas[2] = new Pelicula("Walter Mitty", "Comedia", "Ben Stiller", 114, 2013);
        peliculas[3] = new Pelicula("Your Name", "Animada", "Makoto Shinkai", 107, 2016);
        peliculas[4] = new Pelicula("Spiderman 2", "SuperHeroes", "Sam Raimi", 127, 2004);

        // Marcar Peliculas Vistas
        peliculas[0].marcarVisto();
        peliculas[2].marcarVisto();
        peliculas[4].marcarVisto();

        // Impresion Peliculas Vistas
        System.out.println("---------------\n Peliculas Vistas \n---------------");
        for ( Pelicula pelicula : peliculas ) {
            // Verificar la serie con mas temporadas
            if (peliculaNueva.getAnio() < pelicula.getAnio()) {
                peliculaNueva = pelicula;
            }
            // Imprimir Series Vistas
            if (pelicula.esVisto()){
                System.out.println(pelicula + "\n---------------");
                minutosVistos += pelicula.tiempoVisto();
            }
        }
        System.out.println("Pelicula Estreno \n" + "---------------\n" + peliculaNueva + "\n---------------");
        System.out.println("Los minutos reproducidos en Peliculas son: " + minutosVistos);

        // Array Series
        Serie[] series = new Serie[5];
        series[0] = new Serie("The OC", "Drama", "Josh Schwartz", 3864, 4);
        series[1] = new Serie("How I Meet Your Mother", "Comedia", "Carter Bays", 4576, 9);
        series[2] = new Serie("House", "Drama", "David Shore", 7611, 8);
        series[3] = new Serie("Lakers", "Drama", "Jeff Pearlman", 750, 2);
        series[4] = new Serie("The Bear", "Drama", "Christopher Storer", 720, 2);

        // Marcar Series Vistas
        series[0].marcarVisto();
        series[3].marcarVisto();

        minutosVistos = 0;
        // Impresion Series Vistas
        System.out.println("---------------\n Series Vistas \n---------------");
        for ( Serie serie : series ) {
            // Verificar la serie con mas temporadas
            if (serieTemporadas.getTemporadas() < serie.getTemporadas()) {
                serieTemporadas = serie;
            }
            // Imprimir Series Vistas
            if (serie.esVisto()){
                System.out.println(serie + "\n---------------");
                minutosVistos += serie.tiempoVisto();
            }
        }
        System.out.println("Mayor Temporadas \n" + "---------------\n" + serieTemporadas + "\n---------------");
        System.out.println("Los minutos reproducidos en Series son: " + minutosVistos);

    }
}
