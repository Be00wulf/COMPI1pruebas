/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaanalizador;

/**
 *
 * @author majo
 */
import java.io.*; import java.util.*;


public class AnalizadorLexico {
    public int linea = 1;
	private char vistazo = ' ';
	private Hashtable palabras = new Hashtable();
        
	void reservar(Palabra t) { palabras.put(t.lexema, t); }
	public AnalizadorLexico() {
		reservar( new Palabra(Etiqueta.TRUE, "true") );
		reservar( new Palabra(Etiqueta.FALSE, "false") );
	}
	public Token explorar() throws IOException {
		for( ; ; vistazo = (char)System.in.read() ) {
			if( vistazo == ' ' || vistazo == '\t' ) continue;
			else if( vistazo == '\n' ) linea = linea + 1;
			else break;
		}
	
		if( Character.isDigit(vistazo) ) {
			int v = 0;
			do {
				v = 10*v + Character.digit(vistazo, 10);
				vistazo = (char)System.in.read();
			} while( Character.isDigit(vistazo) );
			return new Num(v);
		}
		
		if( Character.isLetter(vistazo) ) {
			StringBuffer b = new StringBuffer();
			do {
				b.append(vistazo);
                                
//peek no ha sido declarada
//char peek = (char)System.in.read();
//habria que cambiar peek por vistazo 
//peek se rompe con un numero, vistazo con un char entrante y ya, los espacios los ignora

                            vistazo = (char)System.in.read();
			} while( Character.isLetterOrDigit(vistazo) );
			String s = b.toString();
			Palabra w = (Palabra)palabras.get(s);
			if (w != null ) return w;
			w = new Palabra(Etiqueta.ID, s);
			palabras.put(s, w);
			return w;
		}
		
		Token t = new Token(vistazo);
		vistazo = ' ';
		return t;
	}

}
