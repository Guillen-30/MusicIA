public abstract class Cancion {
    private String titulo;
    private PromptGenero genero;
    private String letra;

    public Cancion(String titulo, PromptGenero genero, String letra) {
        this.titulo = titulo;
        this.genero = genero;
        this.letra = letra;
    }

    public abstract Cancion generarCancion();
}