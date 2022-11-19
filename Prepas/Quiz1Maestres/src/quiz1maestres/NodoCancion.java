/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1maestres;

/**
 *
 * @author luisa
 */
public class NodoCancion {
    
    private NodoCancion nodoSiguiente;
    private int numeroCancion;
    private String nombreCancion;
    private String artistaCancion;
    private int reproduccionesCancion;
    private int anioCancion;
    private String idiomaCancion;
    
    public NodoCancion (int numeroCancion, String nombreCancion, String artistaCancion, int reproduccionesCancion, int anioCancion, String idiomaCancion) {
        this.numeroCancion = numeroCancion;
        this.nombreCancion = nombreCancion;
        this.artistaCancion = artistaCancion;
        this.reproduccionesCancion = reproduccionesCancion;
        this.anioCancion = anioCancion;
        this.idiomaCancion = idiomaCancion;
        this.nodoSiguiente = null;
    }

    /**
     * @return the nodoSiguiente
     */
    public NodoCancion getNodoSiguiente() {
        return nodoSiguiente;
    }

    /**
     * @param nodoSiguiente the nodoSiguiente to set
     */
    public void setNodoSiguiente(NodoCancion nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    /**
     * @return the numeroCancion
     */
    public int getNumeroCancion() {
        return numeroCancion;
    }

    /**
     * @param numeroCancion the numeroCancion to set
     */
    public void setNumeroCancion(int numeroCancion) {
        this.numeroCancion = numeroCancion;
    }

    /**
     * @return the nombreCancion
     */
    public String getNombreCancion() {
        return nombreCancion;
    }

    /**
     * @param nombreCancion the nombreCancion to set
     */
    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    /**
     * @return the artistaCancion
     */
    public String getArtistaCancion() {
        return artistaCancion;
    }

    /**
     * @param artistaCancion the artistaCancion to set
     */
    public void setArtistaCancion(String artistaCancion) {
        this.artistaCancion = artistaCancion;
    }

    /**
     * @return the reproduccionesCancion
     */
    public int getReproduccionesCancion() {
        return reproduccionesCancion;
    }

    /**
     * @param reproduccionesCancion the reproduccionesCancion to set
     */
    public void setReproduccionesCancion(int reproduccionesCancion) {
        this.reproduccionesCancion = reproduccionesCancion;
    }

    /**
     * @return the anioCancion
     */
    public int getAnioCancion() {
        return anioCancion;
    }

    /**
     * @param anioCancion the anioCancion to set
     */
    public void setAnioCancion(int anioCancion) {
        this.anioCancion = anioCancion;
    }

    /**
     * @return the idiomaCancion
     */
    public String getIdiomaCancion() {
        return idiomaCancion;
    }

    /**
     * @param idiomaCancion the idiomaCancion to set
     */
    public void setIdiomaCancion(String idiomaCancion) {
        this.idiomaCancion = idiomaCancion;
    }


    
}
