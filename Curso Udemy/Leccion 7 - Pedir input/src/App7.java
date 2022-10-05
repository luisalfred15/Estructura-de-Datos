import java.util.Scanner;

public class App7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un entero: ");
		int dato = sc.nextInt();
		
		if (sc.hasNextInt()) {
			System.out.println("El valor introducido es " + dato);
		} else {
			System.out.println("Introduzca un valor adecuado");
		}
		
		sc.close();
	}
}

// Se usa la clase Scanner
// Sintx: Scanner (nombre de objeto) = new Scanner(System.in);
// Luego se ensenia el prompt (mensaje anterior al input)
// Despues se escribe String (nombre) = (nombre de input).nextLine(); -> Cualquier linea. El tipo de input puede ser diferente
// Importar clase Scanner
// Shrtct: Ctrl + Shift + O