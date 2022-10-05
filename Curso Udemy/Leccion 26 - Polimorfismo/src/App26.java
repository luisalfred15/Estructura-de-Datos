// Con polimorfismo, las subclases pueden tomar el papel de las superclases
// Adapta los metodos con los que cuenta la clase en funcion de los que va a adquirir
//	(los de Animal a los de Leon)

public class App26 {
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Leon leon = new Leon();
		Animal animal2 = new Animal();

		animal1.comer();

		// Como Leon es subclase de Animal, entonces puedo usar la primera donde sea que
		// 	este la segunda
		animal1 = leon;

		// Como animal1 apunta a leon, al ejecutar el metodo comer() en animal1
		// 	se ejecuta el de leon
		animal1.comer();

		leon.rugir();

		/*
		// Como animal2 es de la clase Animal, y fue declarada inicialmente asi, no
		// 	ejecuta el metodo rugir() 
		animal1.rugir();
		*/
		
		// Aqui ocurre polimorfismo, de nuevo
		caminar(animal1);
		
		caminar(leon);
		caminar(animal2);

	}
	
	// Una de las aplicaciones del polimorfismo es crear un metodo en la clase principal
	// 	del proyecto donde se tomen variables de la clase Animal y se ejecuten dentro
	// 	metodos de esa clase y su subclase, Leon
	public static void caminar(Animal animal) {
		animal.caminar();
	}
}
