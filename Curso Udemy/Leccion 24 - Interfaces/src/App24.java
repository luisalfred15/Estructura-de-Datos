
public class App24 {

	public static void main(String[] args) {
		Avion avion1 = new Avion();
		Autobus bus1 = new Autobus();

		avion1.imprimirDatos();
		bus1.imprimirDatos();

		// Esto es posible ya que Avion implementa la interfaz Data
		// Se guarda un espacio de memoria para un objeto de la clase Avion y que apunta
		// 	a la variable "data1"
		Data data1 = new Avion();
		
		// Tambien se puede apuntar a una variable ya existente de una clase que implemente cierta interfaz
		Data data2 = bus1;
		
		mostrarInfo(data1);
		mostrarInfo(data2);
		
		// Se puede pasar "avion1" ya que implementa la interfaz Data
		mostrarInfo(avion1);
	}
	
	// Una aplicacion de interfaces es crear un metodo que tome objetos de tipo Data y ejecute los metodos de la interfaz
	public static void mostrarInfo(Data data) {
		data.imprimirDatos();
	}

}
