/*
generacion del 
Sym.java
LexerCup.java
Sintax.java
 */
package anzSL;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author majo
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        
        
        ///home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico
        String ruta1 = "home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico/src/codigo/Lexer.flex";     //analizador lexico
        String ruta2 = "home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico/src/codigo/LexerCup.flex";  //leer lexer sintactico donde esta la estructura del lenguaje
        String[] rutaS = {"-parser", "Sintax", "home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico/src/codigo/Sintax.cup"};    //para la sintaxis
        generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        //asignacion de las nuevas rutas
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
          
        
        //home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico
        Path rutaSym = Paths.get("home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico/src/codigo/sym.java");
        if (Files.exists(rutaSym)) {        //si el archivo ya existe en el paquete, que lo elimine, para genenerar el nuevo documento que se esta creando
            Files.delete(rutaSym);
        }       
        
        
        
        //home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico
        Files.move(
                Paths.get("home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico/sym.java"), 
                Paths.get("home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico/src/codigo/sym.java")
        );
        
        
        Path rutaSin = Paths.get("home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico/src/codigo/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                
                //home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico
                Paths.get("home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico/Sintax.java"), 
                Paths.get("home/majo/Desktop/RESPALDO/FUNCIONAL ANALISIS LEXICO S 17 6 23/AnalizadorSintactico/AnalizadorLexico/src/codigo/Sintax.java")
        );
    }
}
 