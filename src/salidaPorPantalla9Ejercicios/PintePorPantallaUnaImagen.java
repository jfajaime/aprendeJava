/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salidaPorPantalla9Ejercicios;

/**
 Ejercicio 9
Escribe un programa que pinte por pantalla alguna escena - el campo, la
habitación de una casa, un aula, etc. - o algún objeto animado o inanimado
- un coche, un gato, una taza de café, etc. Ten en cuenta que puedes utilizar
caracteres como *, +, <, #, @, etc. o incluso caracteres Unicode. ¡Échale
imaginación!
 */
public class PintePorPantallaUnaImagen {
    public static void main(String[] args) {
    System.out.println("\n                       █████");
    System.out.println("    APRENDE JAVA            ██");
    System.out.println("   CON EJERCICIOS           ██");
    System.out.println("  JAIME FERNANDO ADRIAN     ██");
    System.out.println("                     ██    ██  ");
    System.out.println("                         ██");
    System.out.println("                     ████████");
    System.out.println("░░░░░░░░░░░░░██████░░░░░░░░");
    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    
        System.out.println("\033[31m                  ████████");
    System.out.println("                            ██");
    System.out.println("    APRENDE JAVA            ██");
    System.out.println("   CON EJERCICIOS           ██\033[33m");
    System.out.println("  JAIME FERNANDO ADRIAN \033[34m    ██");
    System.out.println("                  ██      ██  ");
    System.out.println("                     █████");
    System.out.println("                     ████████");
    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    System.out.println("\033[37m"); // volvemos al blanco
    }
}
