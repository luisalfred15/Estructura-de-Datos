import java.util.Scanner;

public class App10 {
	public static void main(String[] args) {
		/*
		// Se aparta un espacio de 32 bits para guardar un entero, el 7 (value type)
		int numero = 7;
		
		// Se indica que la variable "numeros" es una lista de enteros. Nombre de referencia (reference type)
		int[] numeros;
		
		
		// Se asigna un espacio de memoria para el arreglo. En este caso, un arreglo de 3 enteros
		// Se aparta el estado de memoria, pero como tal no se le tiene asignado ningun valor
		
		numeros = new int[3];
		
		// Inicializacion al mismo tiempo que declaracion
		
		int[] valores = {1, 2, 3, 4};
		*/
		
		// Se crea la instancia de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		// Se inicializa el arreglo
		short[] numerosElegidos;
		
		// Se declara el arreglo, indicando que contendra tres shorts
		numerosElegidos = new short[3];
		
		for (int i = 1; i <= 3; i++) {
			
			// Prompt para los inputs
			System.out.println("Ingrese el numero " + i + ":");
			
			short input = sc.nextShort();
			
			// Asignacion al arreglo de cada input
			numerosElegidos[i - 1] = input;
		}
		
		sc.close();
		
		// Impresion del arreglo usando for
		System.out.println("Los numeros elegidos son:");
		
		for (int i = 0; i < numerosElegidos.length; i++) {
			System.out.println(numerosElegidos[i]);
		}
	}
}
