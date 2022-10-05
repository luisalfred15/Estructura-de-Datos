import java.util.Scanner;

class Perro {
	
	// Datas/estados/instance variables
	String nombre;
	String raza;
	int peso;
	
}


public class App13 {

	public static void main(String[] args) {
		
		// Declara objeto sc
		Scanner sc = new Scanner(System.in);
		
		// Declara objeto perro1 que es una instancia de la clase Perro
		// Declara una variable de tipo Perro y crea un objeto nuevo de esa clase
		Perro perro1 = new Perro();
		
		// Pide los datos del objeto perro1
		System.out.println("Por favor, introduce el nombre de tu perro: ");
		perro1.nombre = sc.nextLine();
		System.out.println("Por favor, introduce la raza de tu perro: ");
		perro1.raza = sc.nextLine();
		System.out.println("Por favor, introduce el peso de tu perro en kg: ");
		perro1.peso = sc.nextInt();
		
		// Cierra el sc
		sc.close();
		
		System.out.println("Los datos de tu perro son: ");
		System.out.println("Nombre: " + perro1.nombre + ";" + " Raza: " + perro1.raza + ";" + " Peso: " + perro1.peso);
	}

}
