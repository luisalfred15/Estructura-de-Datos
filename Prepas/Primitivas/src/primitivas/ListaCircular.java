/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivas;

/**
 *
 * @author luisa
 */
public class ListaCircular {
    
    private int longitud;
    private Nodo nodoPrimero;
    private Nodo nodoUltimo;
    
    public ListaCircular (int longitud) {
        this.longitud = 0;
        this.nodoPrimero = null;
        this.nodoUltimo = nodoPrimero;
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
