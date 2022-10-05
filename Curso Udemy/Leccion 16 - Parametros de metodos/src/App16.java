class Carro {
	
	// Los parametros entre parentesis
	public void decirCantidadGasolina(int cantidad) {
		System.out.println("Tiene " + cantidad + " litros de gasolina");
	}
	
	// Recordar siempre el encapsulamiento y el tipo de funcion
	public void decirVelocidad(int velocidad) {
		System.out.println("Va a " + velocidad + " km/h");
	}
	
	public void girarVolante(int grados, String lado) {
		System.out.println("Girando " + grados + " grados hacia la " + lado);
	}
}


public class App16 {

	public static void main(String[] args) {
		Carro corolla = new Carro();
		
		corolla.decirCantidadGasolina(70);
		
		// Guarda un espacio de memoria para el numero
		int rapidez = 30;
		
		// Toma el papel del parametro "velocidad"
		corolla.decirVelocidad(rapidez);
		
		// Asigna un "label" al string "izquierda"
		String lado = "izquierda";
		
		// Toma el papel de "lado", aunque se llamen igual
		corolla.girarVolante(25, lado);
	}

}
