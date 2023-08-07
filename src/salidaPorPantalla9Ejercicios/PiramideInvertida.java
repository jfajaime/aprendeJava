/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salidaPorPantalla9Ejercicios;
//gual que el programa anterior, pero esta vez la pirámide debe aparecer
//invertida, con el vértice hacia abajo.
public class PiramideInvertida {
    public static void main(String[] args) {
        System.out.printf("\033[32m%11s\n \033[33m%9s\n \033[34m%8s\n "
                + "\033[35m%7s\n \033[36m%6s\n", "*********", "*     *", "*   *", "* *", "*");
            System.out.println("\033[34m"); // pintamos en azul

    System.out.println("*********");
    System.out.println(" *     *");
    System.out.println("  *   *");
    System.out.println("   * *");
    System.out.println("    *");
    
    System.out.println("\033[37m"); // volvemos al blanco
    }

}
