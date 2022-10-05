
// Cualquier clase puede implementar cualquier cantidad de interfaces
// Esto en contraparte con la herencia, ya que una clase solo puede ser heredada por otra
public class Avion implements Data {

	private int numeroAsientos = 120;
	private String aerolinea = "Lufthansa";

	public void imprimirDatos() {
		StringBuilder sb = new StringBuilder();
		String mensaje = sb.append("Es un avion de la aerolinea ").append(aerolinea).append(" que tiene ").append(numeroAsientos)
				.append(" asientos").toString();
		System.out.println(mensaje);
	}

}
