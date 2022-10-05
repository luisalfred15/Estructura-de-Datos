/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepaig2;

/**
 *
 * @author luisa
 */
public class Contador {
    private int numero;

    public Contador(int numero) {
        this.numero = numero;
    }
    
    public Contador() {
        this.numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void sumar(int num) {
        numero += num;
    }
    
    public void resta(int num) {
        numero -= num;
    }
    
    public void producto(int num) {
        numero *= num;
    }
}
