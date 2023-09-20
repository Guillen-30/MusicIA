public abstract class Cancion {
    private String titulo;
    private GeneroMusical genero;
    private String letra;

    public Cancion(String titulo, GeneroMusical genero, String letra) {
        this.titulo = titulo;
        this.genero = genero;
        this.letra = letra;
    }

    public abstract void reproducir();

    public void agregarGeneroFusion(GeneroMusical generoFusion) {
        
    }
}