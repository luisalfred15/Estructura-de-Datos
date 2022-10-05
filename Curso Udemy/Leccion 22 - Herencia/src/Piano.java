// Para heredar atributos o metodos, se usa la keyword "extends"
// En este caso, la clase Piano hereda de Instrumento
// Las clases hijas tambien se llaman "subclases"
// Las clases padres tambien se pueden llamar "superclases"

public class Piano extends Instrumento {

	// Heredar metodos con @Override y usando herramientas de Eclipse
	@Override // Se llama anotacion y no es necesaria
	public void tocarMusica() {
		super.tocarMusica(); // Aqui se puede introducir cualquier cosa, no necesariamente lo que genera
	}
	
	// Heredar metodos sin @Override
	public void sonarNota() {
		System.out.println("Tocando la nota fa");
	}
	
	public void imprimirInfo() {
		StringBuilder sb = new StringBuilder("Piano. Precio: ");
		String info = sb.append(precio).toString();
		System.out.println(info);
	}
	
}
