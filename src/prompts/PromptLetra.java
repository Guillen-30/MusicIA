public class PromptLetra {
	private String frase;
	
	public PromptLetra(String frase) {
		this.frase = frase;
	}

	public void agregarFrase(String nuevaFrase){
		this.frase = frase + ", " + nuevaFrase;
	}
}
