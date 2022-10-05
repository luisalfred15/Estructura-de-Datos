
public class App11 {
	public static void main(String[] args) {

		// Aparta suficiente espacio de memoria para tres strings
		String[] palabras = new String[4];
		
		// Guarda en un espacio de memoria cada string
		palabras[0] = "Bienvenido";
		palabras[1] = "a";
		palabras[2] = "tu";
		palabras[3] = "casa";
		
		// Forma directa
		String[] mercado = {"harina", "leche", "queso"};
		
		// Barrer arreglo con for diferente
		for (String producto: mercado) {
			System.out.println(producto);
		}
		
		// Almacena suficiente memoria para un entero
		// Tipo primitivo porque empieza con minuscula
		int valor = 0;
		
		// String es un tipo no primitivo (clase, tiene mayuscula)
		// Asocia memoria para una direccion de memoria (referencia)
		// Valor default: null, no hay nada a que referenciar
		
		// Almacena una referencia de un arreglo (referencia de referencias)
		String[] textos = new String[3];
		
		// Almacena el String en esa variable (espacio de memoria)
		// Se apunta el String a la variable
		textos[0] = "hola";
	}
}