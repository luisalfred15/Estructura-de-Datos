// Usar Java with Ant, no Java with Maven
package prepa1;

public class Prepa1 {

    public static void main(String[] args) {

        String nombre = "Moisés";
        int edad = 19;
        double precio = 20;
        System.out.println(nombre);
        
        String numero1S = "150";
        int numero1 = Integer.parseInt(numero1S);
        
        // Para flotantes
        float flotante1 = 46.7f; // Asume que es double
        
        // Para doubles
        double doble1 = 23.1;
        
        byte num = (byte) numero1;
        
        byte hola = 64;
        
        int num2 = (num > 0) ? num++: num--;
        
    }

}

// JavaDoc: documentacion de Java
// Cada ubicacion tiene una utilizacion especifica
// Contiene la informacion de quien y cuando se hizo el comentario