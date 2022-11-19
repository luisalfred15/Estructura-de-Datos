/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepaarchivostexto;

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
            NodoCliente nodoAux = clientes.getNodoPrimero();
            for (int i = 0; i < clientes.getLongitud(); i++) {
                clientesActuales += nodoAux.getNombre() + "," + nodoAux.getCedula() + "\n";
                nodoAux = nodoAux.getNodoSiguiente();
            }
        }
        try {
            PrintWriter pw = new PrintWriter("test\\clientes.txt"); // Aqui guardaras la info, aunque no exista
            pw.print(clientesActuales);
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la base de datos");
        }
    }
    
    public ListaSimple leerTXT() {
        ListaSimple clientes = new ListaSimple(); // Se inicializa la EDD
        String linea;
        String clientesTXT = "";
        String ruta = "test\\clientes.txt";
        File archivo = new File(ruta);
        
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            } else {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                while ((linea = br.readLine()) != null) { // Verifica que no haya llegado al final
                    if (!linea.isEmpty()) { // Verifica que la linea no este vacia
                        clientesTXT += "";
                    }
                }
                
                if (!"".equals(clientesTXT)) { // Verifica que el TXT no este vacio
                    String[] clientesSeparados = clientesTXT.split("\n"); // Aqui separa en funcion de los saltos
                                                                          // de linea. Queda ["Pepito,19", "Manguito,30", ...]
                    for (int i = 0; i < clientesSeparados.length; i++) {
                        String[] cliente = clientesSeparados[i].split(","); // Aqui separa en funcion de comas (separador)
                                                                            // para cada cliente: ["Pepito", "19"]
                        clientes.agregarAlFinal(cliente[0], Integer.parseInt(cliente[1]));
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

}
