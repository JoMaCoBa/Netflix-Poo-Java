public class Serie extends Contenido {

    // Atributos
    private int temporadas;

    //Constructor
    public Serie() {

    }
    public Serie (String titulo, String genero, String creador, int duracion, int temporadas) {

        super(titulo, genero, creador, duracion);
        this.temporadas = temporadas;

    }

    // Setters
    public void setTemporadas (int temporadas) {
        this.temporadas = temporadas;
    }

    // Getters
    public int getTemporadas () {
        return temporadas;
    }

    // Metodos
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "No. Temporadas: " + temporadas;
    }

}
