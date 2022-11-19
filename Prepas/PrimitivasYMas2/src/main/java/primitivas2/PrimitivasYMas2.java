/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package primitivas2;

/**
 *
 * @author luisa
 */
public class PrimitivasYMas2 {

    public static void main(String[] args) {
        
        Cola cola = new Cola();
        
        for (int i = 0; i < 5; i++) {
            cola.encolar(i);
        }
        
        String impresion = cola.imprimirRecur("");
        System.out.println(impresion);
        
    }
}
