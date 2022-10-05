public class App6 {
	public static void main(String[] args) {
		
		long poblacion = 50;
		int contagios = 1;
		
		for (long k = poblacion; k > 0; k--) {
			contagios = 2 * contagios;
			
			if (contagios <= 5) {
				System.out.println("La pandemia esta empezando");
			} else if (contagios <= 15) {
				System.out.println("Crecen los contagios");
			} else if (contagios <= 30) {
				System.out.println("Ya se contagio mas de un tercio de la poblacion");
			} else if (contagios <= 50) {
				System.out.println("La gran mayoria estan contagiados :(");
				break;
			}
		}
	
	}
}

// Sintx: if (cond. a ser V) {
//		(bloque de codigo)
// } else if {
//
// } else if {
//
// } 
// ...
// } else {
//
// {