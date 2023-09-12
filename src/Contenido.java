public class Contenido implements iVisualizable {

    // Atributos
    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    private boolean visto = false;

    // Constructores
    public Contenido () {}
    public Contenido (String titulo, String creador) {

        this.titulo = titulo;
        this.creador = creador;

    }
    public Contenido (String titulo, String genero, String creador, int duracion ) {

        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;

    }

    // Setters
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    public void setGenero (String genero) {
        this.genero = genero;
    }
    public void setCreador (String creador) {
        this.creador = creador;
    }
    public void setDuracion (int duracion) {
        this.duracion = duracion;
    }

    // Getters
    public String getTitulo () { return this.titulo; }
    public String getGenero () { return  this.genero; }
    public String getCreador () { return this.creador; }
    public int getDuracion () { return this.duracion; }

    // Metodo
    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n" +
                "Genero: " + genero + "\n" +
                "Creador: " + creador + "\n" +
                "Duracion: " + duracion;
    }

    @Override
    public void marcarVisto() {
        this.visto = true;
    }

    @Override
    public boolean esVisto() {
    return this.visto;
    }

    @Override
    public int tiempoVisto() {
        return duracion;
    }
}
