/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivas;

/**
 *
 * @author luisa
 */
public class NodoListaArreglo<T> {
    
    private T datos;
    private int nodoSiguiente;
    
    public NodoListaArreglo(T datos) {
        
        this.datos = datos;
        this.nodoSiguiente = -1;
    }
    
    public NodoListaArreglo(T datos, int nodoSiguiente) {
        this.datos = datos;
        this.nodoSiguiente = nodoSiguiente;
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
     * @return the nodoSiguiente
     */
    public int getNodoSiguiente() {
        return nodoSiguiente;
    }

    /**
     * @param nodoSiguiente the nodoSiguiente to set
     */
    public void setNodoSiguiente(int nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
    
    
}
