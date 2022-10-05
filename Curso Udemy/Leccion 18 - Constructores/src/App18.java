class Computadora {

	// Se declaran las variables de instancia
	private String modelo;
	private long serie;

	// Se ejecuta siempre que se crea una instancia de la clase
	// Siempre es publico y no se le indica si es void o no
	// Va despues de las variables de instancia
	public Computadora() {
		System.out.println("Constructor 1 funcionando correctamente");

		modelo = "Acer Swift"; // Se pueden declarar variables constantes
		serie = 123456789;

	}

	// Puede haber mas de un constructor. C.u. debe tener diferentes argumentos
	public Computadora(String modelo, long serie) {

		// Puede llamar al otro constructor. Siempre debe estar al inicio
		this();

		System.out.println("Constructor 2 funcionando correctamente");

		this.modelo = modelo; // Se usa this para indicar que es una caracteristica de la clase
		this.serie = serie;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public long getSerie() {
		return serie;
	}
}

public class App18 {

	public static void main(String[] args) {

		// Aqui se ejecuta el constructor 1
		Computadora computadora1 = new Computadora();

		// Y aqui el 2
		Computadora computadora2 = new Computadora("Acer Swift", 123456789);
		
		System.out.println(computadora1.getModelo());
		System.out.println(computadora2.getSerie());
	}

}
