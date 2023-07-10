/*
MARIA JOSE BAQUIAX RODRIGUEZ 201831422
 */
package compi1;

import java.util.Scanner;

/**
 *
 * @author majo
 */

public class Compi1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String teclado;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("BIENVENIDO,  INTRODUCE TU MENSAJE: (escribe coma (,) para saltos de linea )");
        teclado = entrada.nextLine();
        
        //mostrar mensaje
        //System.out.println("[ "+ teclado +" ] ");

        //mostrar mensaje separado por lineas por coma (,)
        System.out.println("");
        String[] separadoTodo = teclado.split(",");
          for (int postTS = 0; postTS < separadoTodo.length; postTS++) {
              System.out.println(separadoTodo[postTS]);
        }
        
        //rata
        System.out.println("⠀⠀⠀⠀⣿⣿⣿⣿⣷⣄⡀⠀⠀⢠⣤⣤⡤⠀⠀⠀⣠⣾⣿⣿⣿⣿⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⢻⣿⣿⣿⣿⠿⠿⣶⣤⣤⣤⣤⣤⣤⣶⠿⢿⣿⣿⣿⣿⡟⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠈⣿⣿⣿⠃⠀⠀⠘⣿⣿⣿⣿⣿⣿⠁⠀⠀⢹⣿⣿⣿⠁⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠘⢿⣿⣧⣀⣀⣼⣿⣿⣿⣿⣿⣿⣦⣀⣠⣾⣿⡿⠃⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⡉⠉⠛⠛⠛⠿⠿⠿⠿⠿⠛⠛⠋⢉⠁⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⣷⣶⠀⣶⣶⡆⠀⣶⠃⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⠛⠛⠃⠈⠁⠀⠀⠀⠀⠀⠀                       ,     .\n" +
"                       (\\,;,/)\n" +
"                        (o o)\\//,\n" +
"                         \\ /     \\,\n" +
"                         `+'(  (   \\    )\n" +
"                            //  \\   |_./\n" +
"                          '~' '~----'     ");
        
        
        
        
        
        
    }
    
}
