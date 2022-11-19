/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luisalfred.primitivas2;

/**
 *
 * @author luisa
 */
public class NodoArbol {
    
    private Object datos;
    private NodoArbol nodoHijoIzq;
    private NodoArbol nodoHijoDer;
    private NodoArbol nodoPadre;
    private NodoArbol nodoHermanoDer;
    private NodoArbol nodoHermanoIzq;
    
    public NodoArbol(Object datos) {
        this.datos = datos;
        this.nodoHijoDer = null;
        this.nodoHijoIzq = null;
        this.nodoPadre = null;
        this.nodoHermanoDer = null;
        this.nodoHermanoIzq = null;
    }

    /**
     * @return the datos
     */
    public Object getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(Object datos) {
        this.datos = datos;
    }

    /**
     * @return the nodoPadre
     */
    public NodoArbol getNodoPadre() {
        return nodoPadre;
    }

    /**
     * @param nodoPadre the nodoPadre to set
     */
    public void setNodoPadre(NodoArbol nodoPadre) {
        this.nodoPadre = nodoPadre;
    }

    /**
     * @return the nodoHijoIzq
     */
    public NodoArbol getNodoHijoIzq() {
        return nodoHijoIzq;
    }

    /**
     * @param nodoHijoIzq the nodoHijoIzq to set
     */
    public void setNodoHijoIzq(NodoArbol nodoHijoIzq) {
        this.nodoHijoIzq = nodoHijoIzq;
    }

    /**
     * @return the nodoHijoDer
     */
    public NodoArbol getNodoHijoDer() {
        return nodoHijoDer;
    }

    /**
     * @param nodoHijoDer the nodoHijoDer to set
     */
    public void setNodoHijoDer(NodoArbol nodoHijoDer) {
        this.nodoHijoDer = nodoHijoDer;
    }

    /**
     * @return the nodoHermanoDer
     */
    public NodoArbol getNodoHermanoDer() {
        return nodoHermanoDer;
    }

    /**
     * @param nodoHermanoDer the nodoHermanoDer to set
     */
    public void setNodoHermanoDer(NodoArbol nodoHermanoDer) {
        this.nodoHermanoDer = nodoHermanoDer;
    }

    /**
     * @return the nodoHermanoIzq
     */
    public NodoArbol getNodoHermanoIzq() {
        return nodoHermanoIzq;
    }

    /**
     * @param nodoHermanoIzq the nodoHermanoIzq to set
     */
    public void setNodoHermanoIzq(NodoArbol nodoHermanoIzq) {
        this.nodoHermanoIzq = nodoHermanoIzq;
    }
    
    
}
