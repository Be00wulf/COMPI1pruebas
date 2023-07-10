/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaanalizador;
import java.io.IOException;
import tareaanalizador.AnalizadorLexico;
/**  
 *
 * @author majo
 */
public class TareaAnalizador {

    /**
     * @param args the command line arg120uments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        AnalizadorLexico al = new AnalizadorLexico();
        al.explorar();
    }
    
}
