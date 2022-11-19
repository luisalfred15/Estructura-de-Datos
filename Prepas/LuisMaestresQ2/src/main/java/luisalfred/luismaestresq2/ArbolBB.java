/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luisalfred.luismaestresq2;

/**
 *
 * @author luisa
 */
public class ArbolBB {

    private NodoABB nodoRaiz;
    private int cantidadNodos;
    private String impresionPreorden;
    private String impresionInorden;
    private String impresionPosorden;
    private String impresionArreglo;

    public ArbolBB() {
        this.nodoRaiz = null;
        this.cantidadNodos = 0;
        this.impresionPreorden = "";
        this.impresionInorden = "";
        this.impresionPosorden = "";
    }

    public boolean esVacio() {
        return this.getNodoRaiz() == null;
    }

    public void vaciar() {
        this.setNodoRaiz(null);
    }

    public boolean compararRecorridoPreorden(NodoABB nodoRaiz, int[] arreglo, int i) {
        boolean coincidePreorden;
        if (nodoRaiz.getClave() != arreglo[i]) {
            coincidePreorden = false;
        } else {
            coincidePreorden = true;
            if (i < arreglo.length - 1) {
                i++;
            }
        }
        this.setImpresionPreorden(this.getImpresionPreorden() + nodoRaiz.getClave() + ", ");
        if (nodoRaiz.getNodoHijoIzq() != null) {
            compararRecorridoPreorden(nodoRaiz.getNodoHijoIzq(), arreglo, i);
        }
        if (nodoRaiz.getNodoHijoDer() != null) {
            compararRecorridoPreorden(nodoRaiz.getNodoHijoDer(), arreglo, i);
        }
        return coincidePreorden;
    }

    public boolean compararRecorridoInorden(NodoABB nodoRaiz, int[] arreglo, int i) {
        if (nodoRaiz.getNodoHijoIzq() != null) {
            compararRecorridoInorden(nodoRaiz.getNodoHijoIzq(), arreglo, i);
        }
        boolean coincideInorden;
        if (nodoRaiz.getClave() != arreglo[i]) {
            coincideInorden = false;
            return coincideInorden;
        } else {
            coincideInorden = true;
            if (i < arreglo.length - 1) {
                i++;
            }
        }
        this.setImpresionInorden(this.getImpresionInorden() + nodoRaiz.getClave() + ", ");
        if (nodoRaiz.getNodoHijoDer() != null) {
            compararRecorridoInorden(nodoRaiz.getNodoHijoDer(), arreglo, i);
        }
        return coincideInorden;
    }

    public boolean compararRecorridoPosorden(NodoABB nodoRaiz, int[] arreglo, int i) {
        if (nodoRaiz.getNodoHijoIzq() != null) {
            compararRecorridoPosorden(nodoRaiz.getNodoHijoIzq(), arreglo, i);
        }
        if (nodoRaiz.getNodoHijoDer() != null) {
            compararRecorridoPosorden(nodoRaiz.getNodoHijoDer(), arreglo, i);
        }
        boolean coincidePosorden;
        if (nodoRaiz.getClave() != arreglo[i]) {
            coincidePosorden = false;
            return coincidePosorden;
        } else {
            coincidePosorden = true;
            if (i < arreglo.length - 1) {
                i++;
            }
        }
        this.setImpresionPosorden(this.getImpresionPosorden() + nodoRaiz.getClave() + ", ");
        return coincidePosorden;
    }

    public void insertarDato(int clave) {
        NodoABB nodoNuevo = new NodoABB(clave);
        if (this.esVacio()) {
            this.setNodoRaiz(nodoNuevo);
        } else {
            NodoABB nodoPadre = this.buscarPadre(this.getNodoRaiz(), clave);
            if (nodoPadre == null) {
                System.out.println("El valor ya existe en el arbol");
            } else if (nodoPadre.getClave() > nodoNuevo.getClave()) {
                nodoPadre.setNodoHijoIzq(nodoNuevo);
            } else {
                nodoPadre.setNodoHijoDer(nodoNuevo);
            }
        }
        this.setCantidadNodos(this.getCantidadNodos() + 1);
    }

    public NodoABB buscarPadre(NodoABB nodoRaiz, int clave) {
        NodoABB nodoEncontrado = null;
        if (clave < nodoRaiz.getClave()) {
            if (nodoEncontrado != null) {
                return nodoEncontrado;
            } else if (nodoRaiz.getNodoHijoIzq() != null) {
                nodoEncontrado = this.buscarPadre(nodoRaiz.getNodoHijoIzq(), clave);
            } else {
                return nodoRaiz;
            }
        } else if (clave > nodoRaiz.getClave()) {
            if (nodoEncontrado != null) {
                return nodoEncontrado;
            } else if (nodoRaiz.getNodoHijoDer() != null) {
                nodoEncontrado = this.buscarPadre(nodoRaiz.getNodoHijoDer(), clave);
            } else {
                return nodoRaiz;
            }
        }
        return nodoEncontrado;
    }
        /**
         * @return the nodoRaiz
         */
    public NodoABB getNodoRaiz() {
        return nodoRaiz;
    }

    /**
     * @param nodoRaiz the nodoRaiz to set
     */
    public void setNodoRaiz(NodoABB nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }

    /**
     * @return the cantidadNodos
     */
    public int getCantidadNodos() {
        return cantidadNodos;
    }

    /**
     * @param cantidadNodos the cantidadNodos to set
     */
    public void setCantidadNodos(int cantidadNodos) {
        this.cantidadNodos = cantidadNodos;
    }

    /**
     * @return the impresionPreorden
     */
    public String getImpresionPreorden() {
        return impresionPreorden;
    }

    /**
     * @param impresionPreorden the impresionPreorden to set
     */
    public void setImpresionPreorden(String impresionPreorden) {
        this.impresionPreorden = impresionPreorden;
    }

    /**
     * @return the impresionInorden
     */
    public String getImpresionInorden() {
        return impresionInorden;
    }

    /**
     * @param impresionInorden the impresionInorden to set
     */
    public void setImpresionInorden(String impresionInorden) {
        this.impresionInorden = impresionInorden;
    }

    /**
     * @return the impresionPosorden
     */
    public String getImpresionPosorden() {
        return impresionPosorden;
    }

    /**
     * @param impresionPosorden the impresionPosorden to set
     */
    public void setImpresionPosorden(String impresionPosorden) {
        this.impresionPosorden = impresionPosorden;
    }

    /**
     * @return the impresionArreglo
     */
    public String getImpresionArreglo() {
        return impresionArreglo;
    }

    /**
     * @param impresionArreglo the impresionArreglo to set
     */
    public void setImpresionArreglo(String impresionArreglo) {
        this.impresionArreglo = impresionArreglo;
    }

}
