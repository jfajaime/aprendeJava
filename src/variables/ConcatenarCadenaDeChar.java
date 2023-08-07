/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package variables;

/**
Escribe un programa que declare 5 variables de tipo char. A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. Por último, muestra la cadena de caracteres
por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?

 */
public class ConcatenarCadenaDeChar {
    public static void main(String[] args) {
        char a='a';
        char e='e';
        char i='i';
        char o='o';
        char u='u';
        String cadena=""+a+e+i+o+u;
        System.out.println("la cadena es >"+cadena);
    }

}
