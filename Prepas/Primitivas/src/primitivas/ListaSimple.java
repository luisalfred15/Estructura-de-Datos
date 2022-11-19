/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivas;

/**
 *
 * @author luisa
 */
public class ListaSimple<T> {

    private int longitud;
    private Nodo nodoPrimero;

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

    public void agregarAlInicio(T datos) {
        Nodo nuevoNodo = new Nodo(datos);
        if (this.esVacia()) {
            this.nodoPrimero = nuevoNodo;
        } else {
            nuevoNodo.setNodoSiguiente(this.nodoPrimero);
            this.nodoPrimero = nuevoNodo;
        }
        longitud++;
    }

    public Nodo obtenerNodoUltimo() {
        if (this.esVacia()) {
            return null;
        } else {
            Nodo nodoAux = this.getNodoPrimero();
            while (nodoAux.getNodoSiguiente() != null) {
                nodoAux = nodoAux.getNodoSiguiente();
            }
            Nodo nodoUltimo = nodoAux;
            return nodoUltimo;
        }
    }

    public void agregarAlFinal(T datos) {
        Nodo nuevoNodo = new Nodo(datos);
        if (this.esVacia()) {
            this.nodoPrimero = nuevoNodo;
        } else {
            Nodo nodoUltimo = this.obtenerNodoUltimo();
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

    public void eliminarAlFinal() {
        if (!this.esVacia()) {
            if (longitud == 1) {
                this.vaciar();
            } else {
                Nodo nodoUltimo = this.obtenerNodoUltimo();
                Nodo nodoAux = this.getNodoPrimero();
                while (nodoAux.getNodoSiguiente() != nodoUltimo) {
                    nodoAux = nodoAux.getNodoSiguiente();
                }
                nodoAux.setNodoSiguiente(null);
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

    public boolean buscarNodoBool(T dato) {
        boolean hallado = false;
        if (!this.esVacia()) {
            Nodo nodoAux = this.getNodoPrimero();
            while (nodoAux != null) {
                if (nodoAux.getDatos() != dato) {
                    nodoAux = nodoAux.getNodoSiguiente();
                } else {
                    hallado = true;
                    return hallado;
                }
            }
            return hallado;
        }
        return hallado;
    }

    public void eliminar(T dato) {
        if (!this.esVacia()) {
            boolean estaEnLista = this.buscarNodoBool(dato);
            Nodo nodoAux = this.getNodoPrimero();
            Nodo nodoAnterior = null;
            if (estaEnLista) {
                if (this.getNodoPrimero().getDatos() == dato) {
                    this.setNodoPrimero(nodoAux.getNodoSiguiente());
                    nodoAux.setNodoSiguiente(null);
                } else {
                    while (nodoAux.getDatos() != dato) {
                        nodoAnterior = nodoAux;
                        nodoAux = nodoAux.getNodoSiguiente();
                    }
                    nodoAnterior.setNodoSiguiente(nodoAux.getNodoSiguiente());
                }

            }

        }
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

}
