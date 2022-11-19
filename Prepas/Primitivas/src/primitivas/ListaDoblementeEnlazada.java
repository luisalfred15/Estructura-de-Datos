/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivas;

/**
 *
 * @author luisa
 */
public class ListaDoblementeEnlazada<T> {
    
    private int longitud;
    private Nodo nodoPrimero;
    private Nodo nodoUltimo;
    
    public ListaDoblementeEnlazada() {
        this.nodoUltimo = null;
        this.nodoPrimero = null;
        this.longitud = 0;
    }
    
    public boolean esVacia() {
        return this.nodoPrimero == null;
    }
    
    public void vaciar() {
        this.nodoUltimo = null;
        this.nodoPrimero = null;
        this.longitud = 0;
    }
    
    public void agregarAlFinal(T datos) {
        Nodo nuevoNodo = new Nodo(datos);
        if (this.esVacia()) {
            this.nodoPrimero = this.nodoUltimo = nuevoNodo;
        } else {
            this.nodoUltimo.setNodoSiguiente(nuevoNodo);
            this.nodoUltimo = nuevoNodo;
        }
        longitud++;
    }
    
    public void agregarAlInicio(T datos) {
        Nodo nuevoNodo = new Nodo(datos);
        if (this.esVacia()) {
            this.nodoPrimero = this.nodoUltimo = nuevoNodo;
        } else {
            nuevoNodo.setNodoSiguiente(this.nodoPrimero);
            this.nodoPrimero = nuevoNodo;
        }
        longitud++;
    }
    
    public void eliminarAlInicio() {
        if (!this.esVacia()) {
            if (longitud == 1) {
                this.vaciar();
            } else {
                nodoPrimero = nodoPrimero.getNodoSiguiente();
                longitud--;
            }
        }
    }
    
    public String imprimirLista() {
        String impresion = "";
        Nodo nodoAuxiliar = nodoPrimero;
        if (this.esVacia()) {
            return "La lista esta vacia";
        }
        
        while (nodoAuxiliar != null) {
            impresion += nodoAuxiliar.getDatos() + ", ";
            nodoAuxiliar = nodoAuxiliar.getNodoSiguiente();
        }
        
        return impresion + "//";
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

    /**
     * @return the nodoPrimero
     */
    public Nodo getNodoPrimero() {
        return nodoPrimero;
    }

    /**
     * @param nodoPrimero the nodoPrimero to set
     */
    public void setNodoPrimero(Nodo nodoPrimero) {
        this.nodoPrimero = nodoPrimero;
    }

    /**
     * @return the nodoUltimo
     */
    public Nodo getNodoUltimo() {
        return nodoUltimo;
    }

    /**
     * @param nodoUltimo the nodoUltimo to set
     */
    public void setNodoUltimo(Nodo nodoUltimo) {
        this.nodoUltimo = nodoUltimo;
    }
    
    
}
