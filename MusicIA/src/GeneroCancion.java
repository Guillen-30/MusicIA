public class GeneroCancion extends Genero{
	private Genero mainGenero;
	private Genero subGenero1;
	private Genero subGenero2;
	
	public void Genero(Genero genero) {
		this.mainGenero = genero;
		this.subGenero1=null;
		this.subGenero2=null;

	}

	public void agregarGeneroFusion(Genero generoFusion) {
		if (this.subGenero1==null){
        	this.subGenero1 = generoFusion;
		} else if(this.subGenero2==null){
			this.subGenero2 = generoFusion;
		} else{
			System.out.println("No se puede añadir más de dos subGeneros");
		}
    } 
}
