
package CiscoGT;

import java.io.*;

import static CiscoGT.Tokens.*;

%%
%class LexerFlex
%type Tokens
%line
%column
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
        InfoAdicional  c= new InfoAdicional();
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {c.linea=yyline; lexeme=yytext(); return Comillas;}

/* Tipos de datos */
( byte | int | char | long | float | double ) {c.linea=yyline; lexeme=yytext(); return T_dato;}

/* Tipo de dato String */
( String ) {c.linea=yyline; lexeme=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {c.linea=yyline; lexeme=yytext(); return If;}

/* Palabra reservada Else */
( else ) {c.linea=yyline; lexeme=yytext(); return Else;}

/* Palabra reservada Do */
( do ) {c.linea=yyline; lexeme=yytext(); return Do;}

/* Palabra reservada While */
( while ) {c.linea=yyline; lexeme=yytext(); return While;}

/* Palabra reservada For */
( for ) {c.linea=yyline; lexeme=yytext(); return For;}

/* Operador Igual */
( "=" ) {c.linea=yyline; lexeme=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {c.linea=yyline; lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {c.linea=yyline; lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {c.linea=yyline; lexeme=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {c.linea=yyline; lexeme=yytext(); return Division;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {c.linea=yyline; lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {c.linea=yyline; lexeme=yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {c.linea=yyline; lexeme=yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {c.linea=yyline; lexeme=yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {c.linea=yyline; lexeme=yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {c.linea=yyline; lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {c.linea=yyline; lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {c.linea=yyline; lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {c.linea=yyline; lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {c.linea=yyline; lexeme=yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {c.linea=yyline; lexeme=yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {c.linea=yyline; lexeme=yytext(); return Main;}

/* Nombre del creador */
( "Carlos_Bautista" ) {c.linea=yyline; lexeme=yytext(); return Creador;}

/* Nombre de carrera */
( "Ingenieria en Sistemas" ) {c.linea=yyline; lexeme=yytext(); return Carrera;}

/* Nombre de instructor */
( "Juan Josè Rodriguez" ) {c.linea=yyline; lexeme=yytext(); return Ingeniero;}

/* Punto y coma */
( ";" ) {c.linea=yyline; lexeme=yytext(); return P_coma;}

/* Identificador */
{L}({L}|{D})* {c.linea=yyline; lexeme=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {c.linea=yyline; lexeme=yytext(); return Numero;}

/* Error de analisis */
 . {c.linea=yyline; lexeme=yytext(); return ERROR;}





