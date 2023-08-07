/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salidaPorPantalla9Ejercicios;
//Escribe un programa que pinte por pantalla una pirámide rellena a base de
//asteriscos. La base de la pirámide debe estar formada por 9 asteriscos.
public class PiramidePintada {
    public static void main(String[] args) {
        System.out.printf("\033[34m%10s\n \033[34m%10s\n \033[34m%11s\n "
                + "\033[34m%12s\n \033[34m%13s\n", "*", "***", "*****", "*******", "*********");
      
        
    System.out.println("    *");
    System.out.println("   ***");
    System.out.println("  *****");
    System.out.println(" *******");
    System.out.println("*********");
    }

}
