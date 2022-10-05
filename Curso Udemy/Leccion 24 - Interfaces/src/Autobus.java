
// Para implementar una interfaz, se usa la keyword "implements", seguido del nombre de la interfaz
public class Autobus implements Data {

	private String marca = "Encava";
	private long precio = 150000;
	
	public void imprimirDatos() {
		System.out.println("Autobus " + marca + " que cuesta " + precio + " $");
	}

}
