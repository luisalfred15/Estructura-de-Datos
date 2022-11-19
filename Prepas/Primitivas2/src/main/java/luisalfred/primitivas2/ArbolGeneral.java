/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luisalfred.primitivas2;

/**
 *
 * @author luisa
 */
public class ArbolGeneral {
    
    private NodoArbol nodoRaiz;
    
    public ArbolGeneral() {
        this.nodoRaiz = null;
    }
    
    public boolean esVacio() {
        return this.nodoRaiz == null;
    }
    
    public void vaciar() {
        this.nodoRaiz = null;
    }
    
    public void insertarNodo(NodoArbol nodoPadre, NodoArbol nodoNuevo) {
        if (esVacio()) {
            this.nodoRaiz = nodoNuevo;
        } else if (nodoPadre.getNodoHijoIzq() == null) {
            nodoNuevo.setNodoPadre(nodoPadre);
            nodoPadre.setNodoHijoIzq(nodoNuevo);
        } else {
            NodoArbol nodoAux = nodoPadre.getNodoHijoIzq();
            while (nodoAux.getNodoHermanoDer() != null) {
                nodoAux = nodoAux.getNodoHermanoDer();
            }
            nodoNuevo.setNodoPadre(nodoPadre);
            nodoAux.setNodoHermanoDer(nodoNuevo);
        }
    }
    
    public String imprimirEnInorden(String impresion, NodoArbol nodoRaiz) {
        if (nodoRaiz.getNodoHijoIzq() != null) {
            imprimirEnInorden(impresion, nodoRaiz.getNodoHijoIzq());
        }
        if (nodoRaiz.getNodoHijoIzq() == null) {
            impresion += nodoRaiz.getDatos() + ", ";
        }
        if (nodoRaiz.getNodoPadre() != null) {
            if (nodoRaiz.getNodoPadre().getNodoHijoIzq() == nodoRaiz) {
                impresion += nodoRaiz.getNodoPadre().getDatos() + ", ";
            }
        }
        if (nodoRaiz.getNodoHermanoDer() != null) {
            imprimirEnInorden(impresion, nodoRaiz.getNodoHermanoDer());
        }
        return impresion;
    }
    
    public String imprimirEnPosorden(String impresion, NodoArbol nodoRaiz) {
        if (nodoRaiz.getNodoHijoIzq() != null) {
            imprimirEnPosorden(impresion, nodoRaiz.getNodoHijoIzq());
        }
        impresion += nodoRaiz.getDatos() + ", ";
        if (nodoRaiz.getNodoHermanoDer() != null) {
            imprimirEnPosorden(impresion, nodoRaiz.getNodoHermanoDer());
        }
        return impresion;
    }
    
    public NodoArbol buscar(NodoArbol nodoRaiz, Object datos) {
        NodoArbol nodoEncontrado = null;
        if (this.esVacio()) {
            
        } else if (nodoRaiz.getDatos() == datos) {
            nodoEncontrado = nodoRaiz;
        } else if (nodoRaiz.getNodoHijoIzq() != null) {
            nodoEncontrado = buscar(nodoRaiz.getNodoHijoIzq(), datos);
            if (nodoEncontrado != null) {
                
            } else if (nodoRaiz.getNodoHermanoDer() != null) {
                nodoEncontrado = buscar(nodoRaiz.getNodoHermanoDer(), datos);
            }
        } else if (nodoRaiz.getNodoHijoIzq() == null) {
            if (nodoRaiz.getNodoHermanoDer() != null) {
                nodoEncontrado = buscar(nodoRaiz.getNodoHermanoDer(), datos);
            }
        }
        return nodoEncontrado;
    }

    /**
     * @return the nodoRaiz
     */
    public NodoArbol getNodoRaiz() {
        return nodoRaiz;
    }

    /**
     * @param nodoRaiz the nodoRaiz to set
     */
    public void setNodoRaiz(NodoArbol nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }
    
    
}
