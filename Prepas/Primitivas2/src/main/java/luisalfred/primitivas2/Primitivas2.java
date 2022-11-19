/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package luisalfred.primitivas2;

/**
 *
 * @author luisa
 */
public class Primitivas2 {

    public static void main(String[] args) {
//        Cola cola = new Cola();
//        
//        for (int i = 0; i < 5; i++) {
//            cola.encolar(i);
//        }
//        
//        String impresion = cola.imprimirRecur("");
//        System.out.println(impresion);

        ArbolGeneral arbol = new ArbolGeneral();
        NodoArbol raiz = new NodoArbol("A");
        arbol.insertarNodo(null, raiz);
        NodoArbol nodo1 = new NodoArbol("B");
        arbol.insertarNodo(raiz, nodo1);
        NodoArbol nodo2 = new NodoArbol("C");
        arbol.insertarNodo(raiz, nodo2);
        NodoArbol nodo3 = new NodoArbol("D");
        arbol.insertarNodo(raiz, nodo3);
        NodoArbol nodo4 = new NodoArbol("E");
        arbol.insertarNodo(nodo1, nodo4);
        NodoArbol nodo5 = new NodoArbol("F");
        arbol.insertarNodo(nodo1, nodo5);
        NodoArbol nodo6 = new NodoArbol("G");
        arbol.insertarNodo(nodo1, nodo6);
        NodoArbol nodo7 = new NodoArbol("H");
        arbol.insertarNodo(nodo3, nodo7);
        NodoArbol nodo8 = new NodoArbol("I");
        arbol.insertarNodo(nodo3, nodo8);
        NodoArbol nodo9 = new NodoArbol("J");
        arbol.insertarNodo(nodo7, nodo9);
        NodoArbol nodo10 = new NodoArbol("K");
        arbol.insertarNodo(nodo7, nodo10);
        NodoArbol nodo11 = new NodoArbol("L");
        arbol.insertarNodo(nodo7, nodo11);
        
        String impresion = arbol.imprimirEnInorden("", raiz);
        System.out.println(impresion);
        String impresio = arbol.imprimirEnPosorden("", raiz);
        System.out.println(impresion);
    }
}
