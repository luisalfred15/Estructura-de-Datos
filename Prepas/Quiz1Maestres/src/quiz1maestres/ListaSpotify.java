/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1maestres;

/**
 *
 * @author luisa
 */
public class ListaSpotify {

    private int longitud;
    private NodoCancion nodoPrimero;

    public ListaSpotify() {

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

    public void agregarAlInicio(int numeroCancion, String nombreCancion, String autorCancion, int reproduccionesCancion, int anioCancion, String idiomaCancion) {
        NodoCancion nuevoNodo = new NodoCancion(numeroCancion, nombreCancion, autorCancion, reproduccionesCancion, anioCancion, idiomaCancion);
        if (this.esVacia()) {
            this.nodoPrimero = nuevoNodo;
        } else {
            nuevoNodo.setNodoSiguiente(this.nodoPrimero);
            this.nodoPrimero = nuevoNodo;
        }
        longitud++;
    }

    public NodoCancion obtenerNodoUltimo() {
        if (this.esVacia()) {
            return null;
        } else {
            NodoCancion nodoAux = this.getNodoPrimero();
            while (nodoAux.getNodoSiguiente() != null) {
                nodoAux = nodoAux.getNodoSiguiente();
            }
            NodoCancion nodoUltimo = nodoAux;
            return nodoUltimo;
        }
    }

    public void agregarAlFinal(int numeroCancion, String nombreCancion, String autorCancion, int reproduccionesCancion, int anioCancion, String idiomaCancion) {
        NodoCancion nuevoNodo = new NodoCancion(numeroCancion, nombreCancion, autorCancion, reproduccionesCancion, anioCancion, idiomaCancion);
        if (this.esVacia()) {
            this.nodoPrimero = nuevoNodo;
        } else {
            NodoCancion nodoUltimo = this.obtenerNodoUltimo();
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
                NodoCancion nodoUltimo = this.obtenerNodoUltimo();
                NodoCancion nodoAux = this.getNodoPrimero();
                while (nodoAux.getNodoSiguiente() != nodoUltimo) {
                    nodoAux = nodoAux.getNodoSiguiente();
                }
                nodoAux.setNodoSiguiente(null);
                longitud--;
            }
        }
    }
    
    public void agregarCanciones(String playlist) {
        String[] infoCanciones = playlist.split("\n");
        for (String infoCancion: infoCanciones) {
            String[] cancion = infoCancion.split(",");
            this.agregarAlFinal(Integer.parseInt(cancion[0]), cancion[1], cancion[2], Integer.parseInt(cancion[3]), Integer.parseInt(cancion[4]), cancion[5]);
        }
    }
    
    public String buscarCancion(String nombreCancion) {
        if (!this.esVacia()) {
            String infoCancion = "";
            NodoCancion nodoAux = this.getNodoPrimero();
            for (int i = 0; i < this.longitud; i++) {
                if (String.valueOf(nodoAux.getNombreCancion()).compareToIgnoreCase(nombreCancion) != 0) {
                    nodoAux = nodoAux.getNodoSiguiente();
                } else {
                    infoCancion += "Numero: " + nodoAux.getNumeroCancion() + "\n" + "Nombre: " + nodoAux.getNombreCancion() + "\n" + "Autor: " + nodoAux.getArtistaCancion() + "\n" + "Reproducciones: " + nodoAux.getReproduccionesCancion() + "\n" + "Año: " + nodoAux.getAnioCancion() + "\n" + "Idioma: " + nodoAux.getIdiomaCancion() + "\n";
                    return infoCancion;
                }
            }

            return "No se encontro la cancion deseada";
        }

        return "La lista esta vacia";
    }
    
    public String filtrarPorArtista(String artista) {
        if(!this.esVacia()) {
            String infoCancion = "";
            NodoCancion nodoAux = this.getNodoPrimero();
            for (int i = 0; i < this.longitud; i++) {
                if (String.valueOf(nodoAux.getArtistaCancion()).compareToIgnoreCase(artista) != 0) {
                    nodoAux = nodoAux.getNodoSiguiente();
                } else {
                    infoCancion += "Numero: " + nodoAux.getNumeroCancion() + "\n" + "Nombre: " + nodoAux.getNombreCancion() + "\n" + "Autor: " + nodoAux.getArtistaCancion() + "\n" + "Reproducciones: " + nodoAux.getReproduccionesCancion() + "\n" + "Año: " + nodoAux.getAnioCancion() + "\n" + "Idioma: " + nodoAux.getIdiomaCancion() + "\n";
                    
                }
                
            }
            return infoCancion;
        }
        
        return "La lista esta vacia";
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
    public NodoCancion getNodoPrimero() {
        return nodoPrimero;
    }

    /**
     * @param nodoPrimero the nodoPrimero to set
     */
    public void setNodoPrimero(NodoCancion nodoPrimero) {
        this.nodoPrimero = nodoPrimero;
    }

}
