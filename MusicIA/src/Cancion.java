public abstract class Cancion {
    private String titulo;
    private GeneroCancion genero;
    private String letra;

    public Cancion(String titulo, GeneroCancion genero, String letra) {
        this.titulo = titulo;
        this.genero = genero;
        this.letra = letra;
    }

    abstract Cancion generarCancion(Frase frases, Genero generos);

}