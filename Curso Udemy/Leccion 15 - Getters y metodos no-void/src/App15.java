import java.util.Scanner;

class Persona {
	String nombre;
	int edad;
	long cedula;

	// Metodo que retorna valor
	boolean determinarCedulaPrimo(long cedula) {
		boolean cedulaEsPrimo = false;
		int cont = 0;
		for (int i = 1; i <= cedula; i++) {
			if (cedula % i == 0) {
				cont += 1;
			}
			if (cont == 2 && i == cedula) {
				cedulaEsPrimo = true;
			}
		}
		return cedulaEsPrimo;
	
	}
	// Metodo que no retorna valor (void)
	void decirCedulaPrima(boolean cedulaEsPrimo) {
		if (cedulaEsPrimo == true) {
			System.out.println("Mi numero de cedula es un numero primo!");
		} else {
			System.out.println("Mi numero de cedula no es un numero primo :(");
		}
	}
	
	// Otro metodo void
	void imprimirSaludo() {
		System.out.println("Hola!");
	}
	
	// Getters
	String getNombre() {
		return nombre;
	}
	
	int getEdad() {
		return edad;
	}
	
	long getCedula() {
		return cedula;
	}
}

public class App15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Persona persona1 = new Persona();
		
		System.out.println("Ingresa tu nombre: ");
		persona1.nombre = sc.nextLine();
		
		System.out.println("Ingresa tu edad: ");
		persona1.edad = sc.nextInt();
		
		System.out.println("Ingresa tu numero de cedula: ");
		persona1.cedula = sc.nextLong();
		
		persona1.imprimirSaludo();
		
		String nombre = persona1.getNombre();
		int edad = persona1.getEdad();
		long cedula = persona1.getCedula();
		
		boolean cedulaEsPrimo = persona1.determinarCedulaPrimo(cedula);
		
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Tengo " + edad + " anios");
		System.out.println("Mi numero de cedula es " + cedula);
		persona1.decirCedulaPrima(cedulaEsPrimo);
		
		sc.close();
		
	}

}
