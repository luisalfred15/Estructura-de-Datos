import jardin.Flor;

// La encapsulacion es una forma de proteger datos en Java
// Existen cuatro formas para aplicar declarar la encapsulacion en variables de instancia: private, protected, 
// 	public y sin keyword
// Esto solo aplica para variables de instancia y para metodos
// Por cada archivo debe haber por lo menos una clase declarada publica que coincida con el nombre del archivo

public class App25 {

	public static void main(String[] args) {
		Pino pino1 = new Pino();
		Flor flor1 = new Flor();
		Arbol arbol1 = new Arbol();
		
		// Al estar en el mismo paquete, ser subclase de Arbol y estar protegido, esto sirve
		System.out.println(pino1.especie);
		
		/*
		// No funciona ya que "color" es privado
		System.out.println(flor1.color);
		*/
		
		/*
		// No funciona ya que ese atributo tiene alcance de paquetes solamente
		System.out.println(flor1.cantidadPetalos);
		*/
		
		// Funciona al estar en el mismo paquete
		System.out.println(pino1.edad);
		
		// Funciona porque cumple la condicion de estar en el mismo paquete (es protegido)
		System.out.println(pino1.colorMadera);
		
		/*
		// No funciona ya que "radio" es privado
		System.out.println(pino1.radio);
		*/
	}

}
