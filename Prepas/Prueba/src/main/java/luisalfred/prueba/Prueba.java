/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package luisalfred.prueba;

/**
 *
 * @author luisa
 */
public class Prueba {

    public static void main(String[] args) {
        
        int cols = 3;
        int filas = 4;
        int vertices = cols * filas;
        String impresion = "";

        int[] vertBorde = determinarNodosBorde(vertices, cols, filas);

        for (int i = 0; i < vertBorde.length; i++) {
            impresion += vertBorde[i] + ", ";
        }

        System.out.println(impresion);

    }

    public static int[] determinarNodosBorde(int vertices, int cols, int filas) {
        int aux = 0;
        int[] verticesBorde = new int[vertices - (filas - 2) * (cols - 2)];
        for (int i = 0; i < vertices; i++) {
            if (i < cols) {
                verticesBorde[aux] = i;
                aux++;
            } else if (i > (filas - 1) * cols) {
                verticesBorde[aux] = i;
                aux++;
            } else if (i >= cols) {
                for (int j = 0; j < filas; j++) {
                    if (i == cols * j) {
                        verticesBorde[aux] = i;
                        aux++;
                    } else if (i == ((j + 1) * cols) - 1) {
                        verticesBorde[aux] = i;
                        aux++;
                    }
                }
            }
        }
        return verticesBorde;

    }
}
