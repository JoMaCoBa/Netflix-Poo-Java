public class Pelicula extends Contenido {

    // Atributos
    private int anio;

    // Constructor
    public Pelicula (String titulo, String genero, String creador, int duracion, int anio) {

        super(titulo, genero, creador, duracion);
        this.anio = anio;

    }

    // Setters
    public void setAnio (int anio) {
        this.anio = anio;
    }

    // Getters
    public int getAnio () {
        return anio;
    }

    // Metodos

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Año: " + anio;
    }
}
