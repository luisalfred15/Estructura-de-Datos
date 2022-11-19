/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepalistasimplementadas;

/**
 *
 * @author luisa
 */
public class PrepaListasImplementadas {
    
    public static void main(String[] args) {
        
        ListaConArreglos nuevaLista1 = new ListaConArreglos(5);
        
        for (int i = 5; i > 0; i--) {
            nuevaLista1.agregarAlInicio(i); // [5, 4, 3, 2, 1]
        }
        
        ListaConArreglos nuevaLista2 = new ListaConArreglos(5);
        
        for (int i = 0; i < 5; i++) {
            nuevaLista2.agregarAlFinal(i + 1);
        }
        
        String impresionLista1 = nuevaLista1.imprimirLista();
        System.out.println(impresionLista1);
        String impresionLista2 = nuevaLista2.imprimirLista();
        System.out.println(impresionLista2);
        
        ListaConArreglos nuevaLista3 = new ListaConArreglos(6);
        
        nuevaLista3.agregarAlFinal('a');
        nuevaLista3.agregarAlFinal('b');
        nuevaLista3.agregarAlFinal('c');
        nuevaLista3.agregarAlFinal('e');
        nuevaLista3.agregarAlFinal('f');
        
        System.out.println(nuevaLista3.imprimirLista()); // [q, b, c, d, e, f]
        
        nuevaLista3.insertarPalabra('d');
        
        System.out.println(nuevaLista3.imprimirLista());
        
        ListaConArreglos nuevaLista4 = new ListaConArreglos(5);
        
        nuevaLista4.agregarAlFinal(1);
        nuevaLista4.agregarAlFinal(3);
        nuevaLista4.agregarAlFinal(4);
        nuevaLista4.agregarAlFinal(5);
        
        System.out.println(nuevaLista4.imprimirLista());
        
        nuevaLista4.insertarEntero(2);
        
        System.out.println(nuevaLista4.imprimirLista());
        
        
        
    }
    
}
