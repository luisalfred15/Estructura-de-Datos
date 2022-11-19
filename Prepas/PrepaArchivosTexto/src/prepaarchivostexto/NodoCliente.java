/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepaarchivostexto;

/**
 *
 * @author luisa
 */
public class NodoCliente {

    private NodoCliente nodoSiguiente;
    private String nombre;
    private int cedula;

    public NodoCliente(String nombre, int cedula) {
        this.nodoSiguiente = null;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    /**
     * @return the nodoSiguiente
     */
    public NodoCliente getNodoSiguiente() {
        return nodoSiguiente;
    }

    /**
     * @param nodoSiguiente the nodoSiguiente to set
     */
    public void setNodoSiguiente(NodoCliente nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }


}
