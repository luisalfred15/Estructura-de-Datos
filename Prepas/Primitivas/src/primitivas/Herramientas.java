/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class Herramientas {
    public void escribirTXT(ListaSimple clientes) {
        String clientesActuales = "";
        if (!clientes.esVacia()) {
            Nodo nodoAux = clientes.getNodoPrimero();
            for (int i = 0; i < clientes.getLongitud(); i++) {
                // Aqui depende de como se desee garduar la info en el archivo
                //clientesActuales += nodoAux.getNombre() + "," + nodoAux.getCedula() + "\n";
                nodoAux = nodoAux.getNodoSiguiente();
            }
        }
        try {
            PrintWriter pw = new PrintWriter("test\\clientes.txt"); // Depende de si es TXT o CSV
            pw.print(clientesActuales);
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la base de datos");
        }
    }
    
    public ListaSimple leerTXT() {
        ListaSimple clientes = new ListaSimple();
        String linea;
        String clientesTXT = "";
        String ruta = "test\\clientes.txt"; // Depende de si es TXT o CSV
        File archivo = new File(ruta);
        
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            } else {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                while ((linea = br.readLine()) != null) { 
                    if (!linea.isEmpty()) {
                        clientesTXT += "";
                    }
                }
                
                if (!"".equals(clientesTXT)) { 
                    String[] clientesSeparados = clientesTXT.split("\n");
                    // Aqui varia segun el formato del TXT
                    for (int i = 0; i < clientesSeparados.length; i++) {
                        String[] cliente = clientesSeparados[i].split(",");
                        //clientes.agregarAlFinal(cliente[0], Integer.parseInt(cliente[1]));
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer los clientes");
        }
        return clientes;
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
}
