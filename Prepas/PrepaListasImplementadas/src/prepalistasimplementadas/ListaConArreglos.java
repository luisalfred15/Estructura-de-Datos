/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepalistasimplementadas;

/**
 *
 * @author luisa
 */
public class ListaConArreglos<T> {

    private int primeraPosicion;
    private int ultimaPosicion;
    private Nodo[] arregloNodos;
    private int cantidad; // Es la cantidad de elementos presentes en la lista 

    public ListaConArreglos(int maximo) { // maximo se refiere a la cantidad maxima de 
        // elementos que puede almacenar la lista
        this.primeraPosicion = -1; // Podria implementarse de otra forma
        this.arregloNodos = new Nodo[maximo];
        this.cantidad = 0; // Porque al inicio no hay elementos
    }

    /**
     * @return the primeraPosicion
     */
    public boolean esVacia() {
        return this.primeraPosicion == -1;
    }

    public void vaciar() {
        this.primeraPosicion = -1;
        this.arregloNodos = new Nodo[this.arregloNodos.length];
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
            Nodo nuevoNodo = new Nodo(dato); // Crea el nuevo nodo
            int espacioVacio = this.buscarEspacioVacio(); // Busca un espacio vacio en la lista
            this.arregloNodos[espacioVacio] = nuevoNodo; // Añade en el espacio vacio el nodo

            if (this.esVacia()) { // Si la lista es vacia
                this.primeraPosicion = espacioVacio; // La primera posicion de la lista sera el espacio hallado
                this.ultimaPosicion = espacioVacio; // Asi como la ultima posicion
            } else { // Si no esta vacia la lista
                this.arregloNodos[espacioVacio].setSiguiente(this.primeraPosicion); // El nodo agregado apuntara a la primera posicion
                this.primeraPosicion = espacioVacio; // El espacio hallado (el nodo nuevo) pasa a ser la primera posicion, 
                //ya que se pretende agregar al inicio
            }
            this.cantidad++;

        }
    }

    public void agregarAlFinal(T dato) {

        if (!this.estaLlena()) {
            Nodo nuevoNodo = new Nodo(dato); // Crea el nuevo nodo
            int espacioVacio = this.buscarEspacioVacio(); // Busca un espacio vacio en la lista
            this.arregloNodos[espacioVacio] = nuevoNodo; // Añade en el espacio vacio el nodo

            if (this.esVacia()) { // Si la lista es vacia
                this.primeraPosicion = espacioVacio; // La primera posicion de la lista sera el espacio hallado
                this.ultimaPosicion = espacioVacio; // Asi como la ultima posicion
            } else { // Si no esta vacia la lista
                this.arregloNodos[espacioVacio - 1].setSiguiente(espacioVacio); // El nodo agregado apuntara a la ultima posicion
                this.ultimaPosicion = espacioVacio; // El espacio hallado (el nodo nuevo) pasa a ser la primera posicion, 
                //ya que se pretende agregar al inicio

            }
            this.cantidad++;
        }
    }

    public String imprimirLista() {
        String impresion = "";
        int aux = this.primeraPosicion;
        while (aux != -1) {
            impresion += this.arregloNodos[aux].getDatos() + ", "; // Al ser TDD genericos, se pueden concatenar
            aux = this.arregloNodos[aux].getSiguiente();
        }
        
        return impresion + "//";
    }
    
    public void insertarPalabra(T dato) { // Ojo: este metodo SOLO aplica si la lista esta ordenada
        if (!this.estaLlena()) { // Asi no agregara mas elementos una vez este llena
            if (this.esVacia()) {
                this.agregarAlInicio(dato);
            } else {
                if (String.valueOf(dato).compareToIgnoreCase(String.valueOf(this.arregloNodos[this.primeraPosicion].getDatos())) <= 0) {
                    // Compara valores de String. Si el valor del primer String es menor o igal al segundo, retorna un numero negativo o 0 y se ejecuta
                    // la linea de abajo
                    this.agregarAlInicio(dato);
                } else if (String.valueOf(dato).compareToIgnoreCase(String.valueOf(this.arregloNodos[this.ultimaPosicion].getDatos())) >= 0){
                    this.agregarAlFinal(dato);
                } else { // Insertara en medio de la lista
                    int anteriorPosicion = this.primeraPosicion; // Se asume que el elemento se agregara, por lo menos, despues del primer elemento
                    int actualPosicion = this.arregloNodos[this.primeraPosicion].getSiguiente(); // Posicion del siguiente elemento al primero
                    while (String.valueOf(dato).compareToIgnoreCase(String.valueOf(this.arregloNodos[actualPosicion])) > 0) {
                        // Si el valor del primer String es mayor que el del segundo, se ejecuta el while
                        anteriorPosicion = actualPosicion; // Al pasar al siguiente nodo, deja la posicion actual; pasa a ser la anterior
                        actualPosicion = this.arregloNodos[actualPosicion].getSiguiente(); // Ahora la posicion actual es la siguiente al nodo donde estaba
                    }
                    Nodo nuevoNodo = new Nodo(dato); // Crea un nuevo nodo para guardar el dato
                    int posicionVacia = this.buscarEspacioVacio(); // Busca la posicion vacia donde colocarlo
                    this.arregloNodos[posicionVacia] = nuevoNodo; // Añade el nodo nuevo al arreglo
                    this.arregloNodos[anteriorPosicion].setSiguiente(posicionVacia); // Añade la posicion del anterior nodo al nuevo
                    this.arregloNodos[posicionVacia].setDatos(dato); // Añade los datos al nuevo nodo
                    this.arregloNodos[posicionVacia].setSiguiente(actualPosicion); // Añade la posicion siguiente al nodo
                    cantidad++;
                }
            }
        }
    }
    
    public void insertarEntero(T dato) { // Ojo: este metodo SOLO aplica si la lista esta ordenada
        if (!this.estaLlena()) { // Asi no agregara mas elementos una vez este llena
            if (this.esVacia()) {
                this.agregarAlInicio(dato);
            } else {
                int num1 = Integer.parseInt((String) dato);
                int num2 = Integer.parseInt((String) this.arregloNodos[this.primeraPosicion].getDatos());
                if (num1 <= num2) {
                    // Compara valores de String. Si el valor del primer String es menor o igal al segundo, retorna un numero negativo o 0 y se ejecuta
                    // la linea de abajo
                    this.agregarAlInicio(dato);
                } else if (String.valueOf(dato).compareToIgnoreCase(String.valueOf(this.arregloNodos[this.ultimaPosicion].getDatos())) >= 0){
                    this.agregarAlFinal(dato);
                } else { // Insertara en medio de la lista
                    int anteriorPosicion = this.primeraPosicion; // Se asume que el elemento se agregara, por lo menos, despues del primer elemento
                    int actualPosicion = this.arregloNodos[this.primeraPosicion].getSiguiente(); // Posicion del siguiente elemento al primero
                    while (String.valueOf(dato).compareToIgnoreCase(String.valueOf(this.arregloNodos[actualPosicion])) > 0) {
                        // Si el valor del primer String es mayor que el del segundo, se ejecuta el while
                        anteriorPosicion = actualPosicion; // Al pasar al siguiente nodo, deja la posicion actual; pasa a ser la anterior
                        actualPosicion = this.arregloNodos[actualPosicion].getSiguiente(); // Ahora la posicion actual es la siguiente al nodo donde estaba
                    }
                    Nodo nuevoNodo = new Nodo(dato); // Crea un nuevo nodo para guardar el dato
                    int posicionVacia = this.buscarEspacioVacio(); // Busca la posicion vacia donde colocarlo
                    this.arregloNodos[posicionVacia] = nuevoNodo; // Añade el nodo nuevo al arreglo
                    this.arregloNodos[anteriorPosicion].setSiguiente(posicionVacia); // Añade la posicion del anterior nodo al nuevo
                    this.arregloNodos[posicionVacia].setDatos(dato); // Añade los datos al nuevo nodo
                    this.arregloNodos[posicionVacia].setSiguiente(actualPosicion); // Añade la posicion siguiente al nodo
                    cantidad++;
                }
            }
        }
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
    public Nodo[] getArregloNodos() {
        return arregloNodos;
    }

    /**
     * @param arregloNodos the arregloNodos to set
     */
    public void setArregloNodos(Nodo[] arregloNodos) {
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

//    public boolean esVacia(int cantidad) {
//        boolean varEsVacia = false;
//        if (this.cantidad == 0) {
//            return varEsVacia = true;
//        }
//        return varEsVacia;
//    }
//    public void vaciar() {
//        for (int i = 0; i < ultimaPosicion + 1; i++) {
//            this.arregloNodos[i].setDatos(null);
//        }
//    }
//    public int buscarEspacioVacio() {
//        int posicionVacia = -1;
//        for (int i = 0; i < this.arregloNodos.length; i++) {
//            if (this.arregloNodos[i].getDatos() == null) {
//                posicionVacia = i;
//            }
//        }
//        return posicionVacia;
//    }
//    public void agregarAlInicio(T dato) {
//
//        if (!this.estaLlena()) {
//            Nodo aux1 = this.arregloNodos[0];
//            this.arregloNodos[0].setDatos(dato); 
//            for (int i = 0; i < this.ultimaPosicion; i++) {
//                Nodo aux2 = this.arregloNodos[i + 1];
//                this.arregloNodos[i + 1] = aux1;
//                aux1 = aux2; 
//            }
//        } else {
//
//        }
//    public String imprimirLista() {
//        String impresion = "";
//        if (!this.esVacia()) {
//            for (int i = 0; i <= this.ultimaPosicion; i++) {
//                if (i < this.ultimaPosicion) {
//                    impresion += this.arregloNodos[i].getDatos() + ", ";
//                } else {
//                    impresion += this.arregloNodos[i].getDatos();
//                }
//            }
//        }
//
//        return impresion;
//    }

// Recuerda que esta clase es para *inicializar* una nueva lista, es decir
// para crearla desde cero
