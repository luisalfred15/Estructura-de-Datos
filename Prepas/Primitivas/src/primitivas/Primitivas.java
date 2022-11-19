/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primitivas;

/**
 *
 * @author luisa
 */
public class Primitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimple lista1 = new ListaSimple();
        
        lista1.agregarAlFinal(1);
        lista1.agregarAlFinal(2);
        lista1.agregarAlFinal(3);
        lista1.agregarAlFinal(7);
        lista1.agregarAlFinal(13);
        lista1.agregarAlFinal(45);

        
        System.out.println(lista1.imprimirLista());
        
        lista1.eliminar(45);
        
        System.out.println(lista1.imprimirLista());
        
//        UIListaSimple ventana1 = new UIListaSimple();
//        ventana1.setVisible(true);
    }
    
}
