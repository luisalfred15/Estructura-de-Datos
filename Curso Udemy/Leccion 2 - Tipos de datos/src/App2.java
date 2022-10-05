
public class App2 {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		int miNumero = 69; // Declaracion: Primero siempre se declara el tipo de variable y su nombre
		 // Inicializacion: Inicializando la variable, valor de 32 bit
		short miShort; // Valor de 16 bit
		miShort = 666;
		long miLong; // Valor de 64 bit
		miLong = 5967897;
		double miDecimal; // Doble
		miDecimal = 3.141632;
		float elFlotador; // Float
		elFlotador = 2.274327f; // Siempre al final de un float se añade una f, sino lo toma como double
		// Ojo: se puede inicializar una variable al mismo tiempo que se declara
		// Existen booleanos tambien (true/false)
		
		byte miByte = 127; // Datos de 8 bits
		
		int prueba = 2;
		char miLetra = 'l';
		
		System.out.println(miNumero);
		System.out.println(miShort);
		System.out.println(miLong);
		System.out.println(miDecimal);
		System.out.println(elFlotador);
		System.out.println(prueba);
		System.out.println(miLetra);
		System.out.println(miByte);
	}
}

// Byte: 8 bits
// Short: 16 bits
// Int: 32 bits
// Long: 64 bits
// Los bits se cuentan de 0 hasta n - 1
