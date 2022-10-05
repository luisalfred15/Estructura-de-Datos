
// Esta debe ser siempre la primera linea del codigo
import com.arribasistemicos.ecosistema.Acuario;
import oceano.Piedra;
import oceano.Robalo; // Parecida las rutas de archivos, pero en ves de / se usa .
import oceano.plantas.Algas;

/*
// Tambien puedes importar todas las clases de un paquete de la siguiente forma
import oceano.*
 */

// Los paquetes ayudan a organizar los proyectos de Java
// De esta forma, no se generan conflictos entre archivos

public class App23 {

	public static void main(String[] args) {
		// Declarando un objeto de la clase Robalo y usando el comando, se autocompleta arriba la importacion 
		Robalo robalo1 = new Robalo();
		Piedra piedra1 = new Piedra();
		Algas algas1 = new Algas();
		Acuario acuario1 = new Acuario();
		
	}

}
