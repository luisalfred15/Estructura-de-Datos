import java.util.Scanner;

public class App9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese la definicion que desea buscar por palabra. Si desea salir, presione S: ");

		String busqueda = sc.nextLine();
		
		sc.close();

		switch (busqueda) {

		case "Arepa":
			System.out.println("Comida venezolana hecha a partir de harina de maiz precocida.");
			break;

		case "Computadora":
			System.out.println(
					"Maquina compuesta de circuitos electronicos capaz de hacer todo tipo de operaciones matematicas.");
			break;

		case "Lapiz":
			System.out.println("Herramienta hecha de madera que usa grafito para escribir sobre papel.");
			break;
		
		// Este bloque se ejecuta cuando la variable no es declarada con alguno de los valores adjudicados para los casos
		default:
			break;
		}

	}
}
