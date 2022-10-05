
public class App12 {

	public static void main(String[] args) {
		// Arreglo de  1 dimension
		long[] largos = new long[2];
		
		// Arreglo de 2 dimensiones
		int[][] tabla = {
				{1, 2, 3},
				{4, 5, 65},
				{7, 8, 9, 10}
		}; // Ojo: arreglos de 2 dimensiones no necesariamente son matrices. P. ej., el de arriba
		
		System.out.println(tabla[2][3]);
		
		// Inicializar y declarar al mismo tiempo
		String[][] palabras = new String[3][4]; // Esta si es una matriz
		
		palabras[1][2] = "Buenos dias";
		System.out.println(palabras[1][2]);
		
		// Tambien se pueden crear arreglos de 2 dimensiones con filas indefinidas
		int[][] tabla2 = new int[2][];
		
		// Como las filas estan indefinidas, se deben inicializar
		tabla2[0] = new int[4];
		
		tabla2[0][3] = 15;
		
		// For anidado con iterador para barrer arreglos multidimensionales
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t"); // Asi se muestran los elementos en una sola linea
			}
			
			System.out.println(); // Hace que imprima en la siguiente linea los elementos de la siguiente fila
		}
		/*
		// For anidado sin iterador
		for (int[] i: tabla2) {
			for (int j: i) {
				System.out.print(i + "\t");
			}
			System.out.println();
		} // Mi intento de for sin iterador xd
		*/
	}

}
