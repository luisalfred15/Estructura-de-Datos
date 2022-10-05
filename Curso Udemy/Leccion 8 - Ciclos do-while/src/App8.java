import java.util.Scanner;

public class App8 {
	public static void main(String[] args) {
		
		// Crea el objeto sc de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declara la variable "valor" debido a que el scope del programa lo requiere
		int valor = 0;
		
		do { // En este loop se ejecuta, al menos, una vez el bloque de codigo dentro del "do". Luego se verifica la condicion 
			// del "while" para saber si se sigue ejecutando el bloque anterior
			
			// Imprime el prompt
			System.out.println("Ingrese un entero para saber si acertaras: ");
			
			// Verifica si la entrada introducida es de tipo int. Si lo es, arroja el prompt de nuevo. 
			// Si no lo es, vuelve a esperar a la entrada
			while (!sc.hasNextInt()) sc.next();
			
			// Asigna a la variable "valor" la entrada introducida anteriormente
			valor = sc.nextInt();
		
		// Mientras se cumpla esta condicion, el bloque de codigo dentro del "do" siempre se ejecutara
		} while (valor != 9);
		
		sc.close();
		
		System.out.println("Acertaste!");
		
	}
}
