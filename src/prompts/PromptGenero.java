public class PromptGenero {
	private String genero;
	private int cantidad = 1;
	
	public PromptGenero(String genero) {
		this.genero = genero;
		this.cantidad++;
	}

	public void agregarGeneroFusion(PromptGenero generoFusion) {
        Cancion.PromptGenero=genero+" "+generoFusion;
    } 
}
