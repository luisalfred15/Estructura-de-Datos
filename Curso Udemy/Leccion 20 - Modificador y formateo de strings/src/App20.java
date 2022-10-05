
public class App20 {

	public static void main(String[] args) {
		// ** Modificacion de strings **//

		// Para agregar informacion a un string, se hace de la siguiente forma

		// Se declara la variable de tipo string
		String texto = "";

		// Y se le aniade informacion, concatenandolo con mas texto
		texto += "Hola,";
		texto += " ";
		texto += "me llamo Luis.";

		// Imprimiendolo
		System.out.println(texto);

		// Sin embargo, este metodo consume gran cantidad de memoria
		// En Java, los strings son inmutables
		// Por cada linea, se esta creando un nuevo string a partir de "", asignandole
		// la variable "texto"

		// La forma mas adecuada es usando la clase StringBuilder

		// Declarando un objeto de dicha clase
		StringBuilder sb = new StringBuilder(""); // Dentro de los parentesis puede ir un cierto valor inicial
													// cualquiera

		// Para aniadir informacion al string inicial
		sb.append("Hola,");
		sb.append(" ");
		sb.append("soy un elefante.");

		// Imprimiendo el string creado
		System.out.println(sb.toString()); // El metodo usado convierte la data almacenada en string

		// De esta forma, se modifica solo la informacion que contiene StringBuilder
		// A diferencia del otro metodo, que consume mas memoria

		// Se pueden encadenar los metodos tambien
		StringBuilder s = new StringBuilder();
		String info = s.append("Hola, ").append("soy una cadena.").toString(); // Acepta este tipo de formato

		System.out.println(info);

		// ** Formateo de strings **//

		// * Formateo para enteros

		// Se emplea el siguiente comando, donde se espera recibir tambien argumentos
		// 	para sustituir los datos
		// Imprime en la misma linea
		// Entre % y d se escribe la longitud esperada de la entrada. Si recibe una entrada 
		//	mas corta de lo esperado, compensa con espacios
		// Se agrega - para centrar a la izquierda, no se agrega para centrar a la derecha
		// Si se escribe un numero mayor a la longitud que la entrada, se complemeta con
		// 	espacios
		System.out.printf("El pan cuesta %d dolares. \n", 2);
		System.out.printf("Los zapatos cuestan %d Bs. y los pantalones %d Bs. \n", 20, 30);
		System.out.printf("Ingresos: %d; Perdidas: %s \n", 100, 20);
		System.out.printf("Edad: %5d; Nombre: Luis \n", 19); // Aqui imprimiria 3 espacios mas el del string

		// * Formateo para flotantes

		// Se debe usar f
		// Entre % y f, se puede colocar los decimales que se quieren tomar del numero
		// Ademas se redondea el ultimo de estos
		// Ademas, entre % y ., se puede aniadir al mismo tiempo lo que se va a tomar de
		// 	la entrada, como arriba
		System.out.printf("Sueldo: %11.3f", 123945.1489); // No se toma en cuenta el decimal 
														  // 	a la hora de captar la entrada
	}

}
