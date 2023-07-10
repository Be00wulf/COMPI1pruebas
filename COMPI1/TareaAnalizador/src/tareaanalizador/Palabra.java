/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaanalizador;

/**
 *
 * @author majo
 */
public class Palabra extends Token {
    	public final String lexema;
	public Palabra(int t, String s) {
		super(t); lexema = new String(s);
	}
}
