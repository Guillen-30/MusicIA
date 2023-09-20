public abstract class PromptLetra {
	private String frase;
	
	public PromptLetra(String frase) {
		this.frase = frase;
	}
	
	public abstract String generarLetra();
}
