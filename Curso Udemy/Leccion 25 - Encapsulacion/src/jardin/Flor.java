package jardin;

public class Flor {
	
	// "private" indica que solo se puede acceder desde la propia clase
	private String color;
	
	// Sin identificar indica que el alcance es solo dentro de paquetes
	short cantidadPetalos;
	
	public Flor() {
		System.out.println(color);
		crecer();
	}

	protected void crecer() {
		System.out.println("Crecio 5 cm");
	}
	
}
