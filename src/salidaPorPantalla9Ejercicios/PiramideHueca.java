/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salidaPorPantalla9Ejercicios;
//Igual que el programa anterior, pero esta vez la pirámide estará hueca (se debe
//ver únicamente el contorno hecho con asteriscos).
public class PiramideHueca {
    public static void main(String[] args) {
        System.out.printf("\033[32m%10s\n \033[33m%10s\n \033[34m%11s\n "
                + "\033[35m%12s\n \033[36m%13s\n", "*", "* *", "*   *", "*     *", "*********");
        
        
            System.out.println("\033[34m"); // pintamos en azul
    
    System.out.println("    *");
    System.out.println("   * *");
    System.out.println("  *   *");
    System.out.println(" *     *");
    System.out.println("*********");
    
    System.out.println("\033[37m"); // volvemos al blanco
    }

}
