/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luisalfred.primitivas2;

/**
 *
 * @author luisa
 */
public class Pila {
    
    private Nodo nodoCima;
    private Nodo nodoBase; // Puede no incluirse para las pruebas
    private int longitud;
    
    public Pila() {
        this.nodoCima = null;
        this.nodoBase = null;
        this.longitud = 0;
    }
    
    public boolean esVacia() {
        return nodoCima == null;
    }
    
    public void vaciar() {
        this.nodoCima = null;
        this.nodoBase = null;
        this.longitud = 0;
    }
    
    public void apilar (Object dato) {
        Nodo nodoNuevo = new Nodo(dato);
        if (this.esVacia()) {
            this.nodoCima = this.nodoBase = nodoNuevo;
        } else {
            nodoNuevo.setNodoSiguiente(this.nodoCima);
            this.nodoCima = nodoNuevo;
        }
        this.longitud++;
    }
    
    public void desapilar() {
        if (this.esVacia()) {
            System.out.println("La pila esta vacia.");
        } else if (this.longitud == 1) {
            this.esVacia();
        } else {
            this.nodoCima = this.nodoCima.getNodoSiguiente();
            this.longitud--;
        }
    }
    
    public String imprimirPila(String impresionPila) {
        if (!this.esVacia()) {
            Nodo nodoActual = this.nodoCima;
            desapilar();
            impresionPila += nodoActual.getDatos() + ", ";
            impresionPila = imprimirPila(impresionPila);
            apilar(nodoActual.getDatos());
        }
        return impresionPila;
    }
    
    

    /**
     * @return the nodoCima
     */
    public Nodo getNodoCima() {
        return nodoCima;
    }

    /**
     * @param nodoCima the nodoCima to set
     */
    public void setNodoCima(Nodo nodoCima) {
        this.nodoCima = nodoCima;
    }

    /**
     * @return the nodoBase
     */
    public Nodo getNodoBase() {
        return nodoBase;
    }

    /**
     * @param nodoBase the nodoBase to set
     */
    public void setNodoBase(Nodo nodoBase) {
        this.nodoBase = nodoBase;
    }

    /**
     * @return the longitud
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
    
}
