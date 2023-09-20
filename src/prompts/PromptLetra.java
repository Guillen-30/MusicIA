
public abstract class PromptLetra {
	private String texto;
	
	public PromptLetra(String texto) {
		this.texto = texto;
	}
	
	public abstract String generarLetra();
}
