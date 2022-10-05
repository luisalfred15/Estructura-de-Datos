
public class App3 {
	public static void main(String[] args) {
		String palabra = "Hola";
		String palabra2 = ",";
		String palabra3 = "¿";
		String palabra4 = "cómo";
		String palabra5 = "estás";
		String palabra6 = "?";
		short num = 32767;

		System.out.println(palabra + palabra2 + ' ' + palabra3 + palabra4 + ' ' + palabra5 + palabra6); // Cuando se
																										// concatena no
																										// deja espacio
		System.out.println("El numero es " + num);
	}
}

// Strings son datos no primitivos, los demas si (es una clase)
// Todo programa de Java debe tener un metodo principal
// String se pueden concatenar con suma
// Nota: siempre usar comillas dobles