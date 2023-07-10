/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaanalizador;

/**
 *
 * @author majo
 */
public class Num extends Token{
    public final int valor;
    public Num(int v) { super(Etiqueta.NUM); valor = v; }
}
