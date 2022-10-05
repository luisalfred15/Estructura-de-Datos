class Rana {
	
	// El metodo toString lo tienen todas las clases por defecto en Java (todas son hijas de la clase madre Object)
	// Sirve para convertir el objeto cuando es llamado. Asi, debuggear se vuelve algo mas sencillo
	
	// Suponiendo que la clase Rana tiene como atributos "id" y "nombre",
	// se puede hacer que el metodo toString() devuelva un mensaje
	
	private int id;
	private String nombre;
	
	public Rana(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}
	
	public String toString() {
		/*
		// Esta forma es valida. Sin embargo, consume mucha memoria
		return nombre + ": " + id;
		*/
		
		/*
		// Es mas eficiente usar la clase StringBuilder
		StringBuilder sb = new StringBuilder("");
		sb.append(nombre).append(": ").append(id);
		return sb.toString();
		 */
		
		// Otra forma es usando la clase String junto al metodo format() y la sintaxis de formateo
		return String.format("%s: %5d", nombre, id); // %s para cuando reciba string
	}
}

class Camion {
	
	// Cuando no esta definido el metodo toString(), se devuelve la clase del objeto mas un hash code 
	// Ojo: no devuelve una direccion de memoria, devuelve un hash code
	
	private String modelo;
	private String placa;
	
	public Camion(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}
}


public class App21 {

	public static void main(String[] args) {
		
		Rana rana1 = new Rana("Rene", 13);
		Rana rana2 = new Rana("Pepito", 69);
		
		System.out.println(rana1);
		System.out.println(rana2);
		
		Camion camion1 = new Camion("Range Rover", "123ABC");
		
		// Probando para imprimir
		System.out.println(camion1);

	}

}
