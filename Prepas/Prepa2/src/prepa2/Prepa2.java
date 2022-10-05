    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepa2;

/**
 *
 * @author luisa
 */
public class Prepa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numero = "a123";
        int numero2 = 0;
        
        // Va a caer en la primera excepcion
        try {
            numero2 = Integer.parseInt(numero);
            System.out.println(numero);
        } catch (Exception e) { // Se puede especificar la excepcion que se arroja
            System.out.println("No es numero. Error: " + e);
        }
    
    // Procedimientos (funciones void) : Subrutina
    // Metodos (funciones no void) : Subrutina
    
    }
    
}
