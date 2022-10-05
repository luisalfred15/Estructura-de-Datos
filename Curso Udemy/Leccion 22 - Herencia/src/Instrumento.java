
public class Instrumento {
	
	// Para proteger variables y que los hijos puedan acceder a estas, se usa "protected"
	// El scope de esto es todo el paquete, incluyendo clases hijas
	protected int precio = 20000;
	
	public void tocarMusica() {
		System.out.println("*Suena alguna cancion*");
	}
	
	public void sonarNota() {
		System.out.println("Tocando la nota mi");
	}
}
