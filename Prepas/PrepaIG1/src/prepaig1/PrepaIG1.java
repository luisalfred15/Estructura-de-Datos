
package prepaig1;

public class PrepaIG1 {

    public static void main(String[] args) {
    }
    
}

// toUpperCase(): transformar en todo mayuscula. Se usa como PY. Lo mismo para toLowerCase()
// length(): lo mismo que en PY
// charAt(): caracter en cierta posicion
// (int) [caracter]: devuelve codigo ASCII del caracter
// split(): divide un String usando un separador
// replace(): dado un String, se da un String que se cambiara por algo que esta en el String original
// isBlank(): retorna booleano si el String es vacio/espacio
// isEmpty(): retorna booleano si el String es de la forma ""
// equals(): USAR PARA COMPARAR STRINGS
// contains(): dado un String, retorna booleano si este esta contenido en otro String
// compareTo(): comparar dos Strings dados caracter por caracter con ASCII
// compareToIgnoreCase(): hace lo mismo solo que no toma en cuenta la mayuscula

// Para crear GUI: 1. crear paquete que guardara GUIs, 2. crear clase Interfaz 3. abrira las herramientas para crearla, con arbol de controles
// Sobre ventanas: set layouts > absolute layouts (para que no se desplace)
// Properties: configuraciones mas detalladas
// Resizable: OFF; Undecorated: ON -> asi las ventanas se amplian
// Importante agregar panel para las ventanas
// Importante cambiarle nombre a los TextFields, para distinguir
// Para agregar imagenes: seleccionar label y colocarle como fondo la imagen deseada (por propiedades > icon > images)
// Con dispose: se sigue ejecutando aunque no se vea
// setLocationRelativeTo(null) para que aparezca la ventana en medio