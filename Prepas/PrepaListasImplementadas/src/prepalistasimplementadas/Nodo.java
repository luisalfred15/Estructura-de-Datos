/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepalistasimplementadas;

/**
 *
 * @author luisa
 */
public class Nodo<T> {
    
    private T datos;
    private int siguiente;
    
    public Nodo(T datos) {
        this.datos = datos;
        this.siguiente = -1; // Inicialmente apunta al equivalente de null
    }
    
    public Nodo(T datos, int siguiente) {
        this.datos = datos;
        this.siguiente = siguiente;
    }

    /**
     * @return the datos
     */
    public T getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(T datos) {
        this.datos = datos;
    }

    /**
     * @return the siguiente
     */
    public int getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(int siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
