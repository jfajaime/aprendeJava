/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package variables;

/**
Escribe un programa que declare variables de tipo char y de tipo String. Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println) ¿es posible?

 */
public class MostrarVariableCharYStringEnUnSout {
    public static void main(String[] args) {
        String verde = "\033[32m";
        String naranja = "\033[33m";
        
        char letra='a';
        String cadena="palabra";
        
        System.out.printf(verde+letra+"\033[39;49m es el char "+naranja+cadena+"\033[39;49m es la cadena\n");
        System.out.println("------------------Ejemplo---------------------------");
         char primeraLetra = 'a';
        char ultimaLetra = 'z';
        String palabra = "abecedario";
    
    System.out.println(primeraLetra + "" + ultimaLetra + palabra);
    }

}
