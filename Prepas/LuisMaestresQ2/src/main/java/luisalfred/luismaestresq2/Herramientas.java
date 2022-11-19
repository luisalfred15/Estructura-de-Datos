/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luisalfred.luismaestresq2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class Herramientas {

    
    public ArbolBB leerTXTdeArbol(String ruta) {
        ArbolBB arbol = new ArbolBB();
        String linea;
        String arbolTXT = "";
        File archivo = new File(ruta);
        
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            } else {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                while ((linea = br.readLine()) != null) { 
                    if (!linea.isEmpty()) {
                        arbolTXT += linea + "\n";
                    }
                }
                
                if (!"".equals(arbolTXT)) { 
                    String[] arregloArbol = arbolTXT.split("\n");
                    for (int i = 0; i < arregloArbol.length; i++) {
                        arbol.insertarDato(Integer.parseInt(arregloArbol[i]));
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer los clientes");
        }
        return arbol;
    }
    
    public int[] leerTXTdeArreglo(String ruta) {
        String linea;
        String arregloTXT = "";
        File archivo = new File(ruta);
        
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            } else {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                while ((linea = br.readLine()) != null) { 
                    if (!linea.isEmpty()) {
                        arregloTXT += linea + "\n";
                    }
                }
                
                if (!"".equals(arregloTXT)) { 
                    String[] enterosSeparados = arregloTXT.split("\n");
                    int[] arreglo = new int[enterosSeparados.length];
                    for (int i = 0; i < arreglo.length; i++) {
                        arreglo[i] = Integer.parseInt(enterosSeparados[i]);
                    }
                    br.close();
                    JOptionPane.showMessageDialog(null, "Lectura exitosa");
                    return arreglo;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
        }
        return null;
    }
    
    public static int validarEntero(String numString) {
        int num;
        try {
            num = Integer.parseInt(numString);
            return num;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, ingrese un dato valido");
        }
        
        return 0;
    }
    
    public static String imprimirArreglo(int[] arreglo) {
        String impresion = "";
        for (int i = 0; i < arreglo.length; i++) {
            impresion += arreglo[i] + ", ";
        }
        return impresion;
    }
}
