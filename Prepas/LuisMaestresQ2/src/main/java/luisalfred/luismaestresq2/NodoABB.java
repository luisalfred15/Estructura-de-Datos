/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luisalfred.luismaestresq2;

/**
 *
 * @author luisa
 */
public class NodoABB {
    private int clave;
    private NodoABB nodoHijoIzq;
    private NodoABB nodoHijoDer;

    public NodoABB(int clave) {
        this.clave = clave;
        this.nodoHijoIzq = null;
        this.nodoHijoDer = null;
    }

    /**
     * @return the clave
     */
    public int getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(int clave) {
        this.clave = clave;
    }

    /**
     * @return the nodoHijoIzq
     */
    public NodoABB getNodoHijoIzq() {
        return nodoHijoIzq;
    }

    /**
     * @param nodoHijoIzq the nodoHijoIzq to set
     */
    public void setNodoHijoIzq(NodoABB nodoHijoIzq) {
        this.nodoHijoIzq = nodoHijoIzq;
    }

    /**
     * @return the nodoHijoDer
     */
    public NodoABB getNodoHijoDer() {
        return nodoHijoDer;
    }

    /**
     * @param nodoHijoDer the nodoHijoDer to set
     */
    public void setNodoHijoDer(NodoABB nodoHijoDer) {
        this.nodoHijoDer = nodoHijoDer;
    }

    
}
