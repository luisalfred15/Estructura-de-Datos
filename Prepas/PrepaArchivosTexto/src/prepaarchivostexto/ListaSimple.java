/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepaarchivostexto;

/**
 *
 * @author luisa
 */
public class ListaSimple {

    private int longitud;
    private NodoCliente nodoPrimero;

    public ListaSimple() {

        this.nodoPrimero = null;
        this.longitud = 0;

    }

    public boolean esVacia() {
        return this.nodoPrimero == null;
    }

    public void vaciar() {
        this.nodoPrimero = null;
        this.longitud = 0;
    }

    public void agregarAlInicio(String nombre, int cedula) {
        NodoCliente nuevoNodo = new NodoCliente(nombre, cedula);
        if (this.esVacia()) {
            this.nodoPrimero = nuevoNodo;
        } else {
            nuevoNodo.setNodoSiguiente(this.nodoPrimero);
            this.nodoPrimero = nuevoNodo;
        }
        longitud++;
    }

    public NodoCliente obtenerNodoUltimo() {
        NodoCliente nodoAux = this.getNodoPrimero();
        while (nodoAux.getNodoSiguiente() != null) {
            nodoAux = nodoAux.getNodoSiguiente();
        }
        NodoCliente nodoUltimo = nodoAux;
        return nodoUltimo;
    }

    public void agregarAlFinal(String nombre, int cedula) {
        NodoCliente nuevoNodo = new NodoCliente(nombre, cedula);
        if (this.esVacia()) {
            this.nodoPrimero = nuevoNodo;
        } else {
            NodoCliente nodoUltimo = this.obtenerNodoUltimo();
            nodoUltimo.setNodoSiguiente(nuevoNodo);
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
        NodoCliente nodoAuxiliar = nodoPrimero;
        if (this.esVacia()) {
            return "La lista esta vacia";
        }

        while (nodoAuxiliar != null) {
            impresion += nodoAuxiliar.getNombre() + ", ";
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
    public NodoCliente getNodoPrimero() {
        return nodoPrimero;
    }

    /**
     * @param nodoPrimero the nodoPrimero to set
     */
    public void setNodoPrimero(NodoCliente nodoPrimero) {
        this.nodoPrimero = nodoPrimero;
    }

}
