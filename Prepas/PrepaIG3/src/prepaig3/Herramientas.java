/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepaig3;

import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class Herramientas {
    
    public static int verificarEntero(String input) {
        int numero;
        
        try {
            numero = Integer.parseInt(input);
            return numero;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, ingrese un dato valido");
        }
        
        return 0;
    }
    
}
