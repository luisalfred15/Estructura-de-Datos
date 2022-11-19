/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepaarchivostexto;

/**
 *
 * @author luisa
 */
public class PrepaArchivosTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Herramientas herr = new Herramientas();
        ListaSimple clientes = new ListaSimple();
        clientes.agregarAlFinal("Luis", 29827545);
        clientes.agregarAlFinal("Graciela", 6504507);
        clientes.agregarAlFinal("Raul", 9869622);
        clientes.agregarAlFinal("Cristina", 24991972);
        clientes.agregarAlFinal("Manuel", 29666613);
        
        herr.escribirTXT(clientes);
        
        ListaSimple clientes2 = herr.leerTXT();
        
    }
    
}

// ********** Escribir ************
// 1. Verificar que la EDD no este vacia (verificar con if esta vacia)
// 2. Siempre a usar try-catch
// 3. Guardar la info en una variable String (con coma, \n, etc.), ver si ya esos signos
// estan incorporados
// CSV: siempre usar , para separar
// 4. Importar PrintWriter y escoger el nombre y tipo para el archivo de texto
// Usar PrintWriter pw = new PrintWriter("direccion")
// 5. Usar print() de PW para guardar la info. Si se quiere agregar info al TXT
// usar append()
// 6. Cerrar PW con close()
// 7. Se guardara en Test Packages o en test

// ******* Leer ***********
// 1. Si se usaran mas de una EDD, crear clase que tenga como atributos las EDD
// 2. Inicializar *vacias* las EDD
// 3. Crear String que almacene la info para luego separarlo
// 4. Importar File para que cree el TXT con la ruta dada
// 5. Usar try-catch
// 6. Validar que el archivo exista
// 7. Usar FileReader con el archivo y BufferedReader con el fr
// 8. Leer archivo linea por linea y guardar en el String la linea
// 9. Validar que el String sea distinto de ""
// 10. Separar con split() para separar (retorna arreglo)
// 11. Cerrar br

// Ojo con el CSV: puede tener errores en Excel, pero se puede arreglar
// Cuidado: usar contains(",") para evitar los titulos
// Cuidado: con pilas y colas, el orden importa