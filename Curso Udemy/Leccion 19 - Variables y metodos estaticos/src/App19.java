class Arepa {

	// Una variable estatica es comun a todas las instancias de la clase Arepa. En
	// contra a las variables de instancia o no estaticas, que cada objeto tiene una
	// diferente
	// Las variables estaticas pertenecen a la clase. Las de instancia pertenecen a
	// cada objeto que venga de una clase (de ahi a que se llamen de instancia)
	public int radio;
	public static String descripcion;
	public static int contador = 0;
	public int id;

	public Arepa() {
		
		contador++;
		
		id = contador;
	
	}
	
	// Existen las variables finales, que son constantes
	// Se nombran con mayus. sostenidas
	public final int CANTIDAD_MASA = 100;

	// Tambien existen metodos estaticos
	// Ojo: estos *no* pueden acceder a informacion no estatica
	public static void imprimirDescripcion() {
		System.out.println(descripcion);
	}

	public void imprimirInformacion() {
		System.out.println("Tiene un radio de " + radio + " cm y su ID es " + id);
		System.out.println(descripcion);
	}

	public void imprimirRadio() {
		System.out.println(radio);
	}
}

public class App19 {

	public static void main(String[] args) {

		// Para declarar una variable estatica
		Arepa.descripcion = "Plato tipico venezolano hecho de harina de maiz precocida.";

		// Para invocar un metodo estatico
		Arepa.imprimirDescripcion();

		// Probando a crear objetos de la clase Arepa
		Arepa arepa1 = new Arepa();
		Arepa arepa2 = new Arepa();

		// Radio, al ser un atributo no estatico (o variable de instancia), puede llegar
		// a ser diferente por cada instancia de la clase Arepa
		arepa1.radio = 3;
		arepa2.radio = 5;

		arepa1.imprimirRadio();
		arepa2.imprimirRadio();

		// Descripcion, como es una variable estatica, no cambia al crearse una nueva
		// instancia de la clase Arepa
		System.out.println(Arepa.descripcion);

		// Imprimir una variable de tipo final
		System.out.println(arepa1.CANTIDAD_MASA);

		// Invocando un metodo que imprime data estatica y no estatica
		arepa1.imprimirInformacion();
		arepa2.imprimirInformacion();
		
		// La libreria Math cuenta con muchas variables de tipo estatico
		System.out.println(Math.PI);

		/*
		// Variables finales no admiten cambio de valor 
		arepa1.CANTIDAD_MASA = 40;
		 */
	}

}
