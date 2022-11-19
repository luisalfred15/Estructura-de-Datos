/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivas;

/**
 *
 * @author luisa
 */
public class ListaConArreglos<T> {

    private int primeraPosicion;
    private int ultimaPosicion;
    private NodoListaArreglo[] arregloNodos;
    private int cantidad;

    public ListaConArreglos(int maximo) {
        this.primeraPosicion = -1;
        this.arregloNodos = new NodoListaArreglo[maximo];
        this.cantidad = 0;
    }

    /**
     * @return the primeraPosicion
     */
    public boolean esVacia() {
        return this.primeraPosicion == -1;
    }

    public void vaciar() {
        this.primeraPosicion = -1;
        this.arregloNodos = new NodoListaArreglo[this.arregloNodos.length];
        this.cantidad = 0;
    }

    public boolean estaLlena() {
        boolean varEstaLlena = false;
        if (this.cantidad == this.arregloNodos.length) {
            varEstaLlena = true;
        }
        return varEstaLlena;
    }

    public int buscarEspacioVacio() {

        for (int i = 0; i < this.arregloNodos.length; i++) {
            if (this.arregloNodos[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void agregarAlInicio(T dato) {

        if (!this.estaLlena()) {
            NodoListaArreglo nuevoNodo = new NodoListaArreglo(dato);
            int espacioVacio = this.buscarEspacioVacio();
            this.arregloNodos[espacioVacio] = nuevoNodo;

            if (this.esVacia()) {
                this.primeraPosicion = espacioVacio;
                this.ultimaPosicion = espacioVacio;
            } else {
                this.arregloNodos[espacioVacio].setNodoSiguiente(this.primeraPosicion);
                this.primeraPosicion = espacioVacio;
            }
            this.cantidad++;

        }
    }

    public void agregarAlFinal(T dato) {

        if (!this.estaLlena()) {
            NodoListaArreglo nuevoNodo = new NodoListaArreglo(dato);
            int espacioVacio = this.buscarEspacioVacio();
            this.arregloNodos[espacioVacio] = nuevoNodo;

            if (this.esVacia()) {
                this.primeraPosicion = espacioVacio;
                this.ultimaPosicion = espacioVacio;
            } else {
                this.arregloNodos[espacioVacio - 1].setNodoSiguiente(espacioVacio);
                this.ultimaPosicion = espacioVacio;

            }
            this.cantidad++;
        }
    }

    public String imprimirLista() {
        String impresion = "";
        int aux = this.primeraPosicion;
        while (aux != -1) {
            impresion += this.arregloNodos[aux].getDatos() + ", ";
            aux = this.arregloNodos[aux].getNodoSiguiente();
        }

        return impresion + "//";
    }

    public void insertarPalabra(T dato) {
        if (!this.estaLlena()) {
            if (this.esVacia()) {
                this.agregarAlInicio(dato);
            } else {
                if (String.valueOf(dato).compareToIgnoreCase(String.valueOf(this.arregloNodos[this.primeraPosicion].getDatos())) <= 0) {
                    this.agregarAlInicio(dato);
                } else if (String.valueOf(dato).compareToIgnoreCase(String.valueOf(this.arregloNodos[this.ultimaPosicion].getDatos())) >= 0) {
                    this.agregarAlFinal(dato);
                } else {
                    int anteriorPosicion = this.primeraPosicion;
                    int actualPosicion = this.arregloNodos[this.primeraPosicion].getNodoSiguiente();
                    while (String.valueOf(dato).compareToIgnoreCase(String.valueOf(this.arregloNodos[actualPosicion])) > 0) {
                        anteriorPosicion = actualPosicion;
                        actualPosicion = this.arregloNodos[actualPosicion].getNodoSiguiente();
                    }
                    NodoListaArreglo nuevoNodo = new NodoListaArreglo(dato);
                    int posicionVacia = this.buscarEspacioVacio();
                    this.arregloNodos[posicionVacia] = nuevoNodo;
                    this.arregloNodos[anteriorPosicion].setNodoSiguiente(posicionVacia);
                    this.arregloNodos[posicionVacia].setDatos(dato);
                    this.arregloNodos[posicionVacia].setNodoSiguiente(actualPosicion);
                    cantidad++;
                }
            }
        }
    }

    public void eliminarElemento(T dato) {
        if (!this.esVacia()) {
            if (this.arregloNodos.length == 1) {
                this.vaciar();
            } else {
                int eliminar = this.buscarElemento(dato);
                if (eliminar != -1) {
                    int aux = this.getPrimeraPosicion();
                    if (eliminar == this.getPrimeraPosicion()) {
                        this.setPrimeraPosicion(this.arregloNodos[aux].getNodoSiguiente());
                    } else {
                        while (this.arregloNodos[aux].getNodoSiguiente() != eliminar) {
                            aux++;
                        }
                        this.arregloNodos[aux].setNodoSiguiente(this.arregloNodos[eliminar].getNodoSiguiente());
                    }
                }
            }
        }
    }

    public int buscarElemento(T dato) {
        if (!this.esVacia()) {
            int eliminar;
            int aux = this.primeraPosicion;
            while (this.arregloNodos[aux].getDatos() != dato) {
                aux++;
            }
            eliminar = aux;

            return eliminar;
        }
        return -1;
    }

    public int getPrimeraPosicion() {
        return primeraPosicion;
    }

    /**
     * @param primeraPosicion the primeraPosicion to set
     */
    public void setPrimeraPosicion(int primeraPosicion) {
        this.primeraPosicion = primeraPosicion;
    }

    /**
     * @return the ultimaPosicion
     */
    public int getUltimaPosicion() {
        return ultimaPosicion;
    }

    /**
     * @param ultimaPosicion the ultimaPosicion to set
     */
    public void setUltimaPosicion(int ultimaPosicion) {
        this.ultimaPosicion = ultimaPosicion;
    }

    /**
     * @return the arregloNodos
     */
    public NodoListaArreglo[] getArregloNodos() {
        return arregloNodos;
    }

    /**
     * @param arregloNodos the arregloNodos to set
     */
    public void setArregloNodos(NodoListaArreglo[] arregloNodos) {
        this.arregloNodos = arregloNodos;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
