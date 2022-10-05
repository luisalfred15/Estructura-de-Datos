class Tortuga {
	private String nombre;
	private int edad;

	// Setters, tambien llamados mutators
	
	// Setter usando variable diferente
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}

	// Setter usando this.
	public void setEdad(int edad) {
		this.edad = edad; // Hace que la variable de instancia cambie de valor al nuevo
	}

	// Para imprimir las variables de instancia encapsuladas, se usan los getters
	public String getNombre() {
		return nombre; // Aqui no es necesario aniadir el this. ya que en el scope solo hay una
						// variable "nombre"
	}

	public int getEdad() {
		return edad;
	}
}

public class App17 {

	public static void main(String[] args) {
		Tortuga tortuga1 = new Tortuga();

		/*
		 * // A nombre no se le asigna ese string ya que esta encapsulado
		 * tortuga1.nombre = "Jose";
		 */

		tortuga1.setNombre("Jose");
		tortuga1.setEdad(80);

		System.out.println(tortuga1.getNombre());
		System.out.println(tortuga1.getEdad());
	}

}
