/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salidaPorPantalla9Ejercicios;

public class HorarioDeClases {
//    La casilla %s dentro de una plantilla que se le pasa a un System.out.printf() se debe
//      rellenar con una cadena de caracteres, es decir, con una secuencia de letras, espacios
//      y signos de puntuación.
    public static void main(String[] args) {
        System.out.println("|--------------------------------------------------------------------");
        System.out.printf("%5s %5s %5s %5s %5s %5s %5s %5s"
                ,"HORA/DIA", "L", "M", "M", "J", "V", "S", "D\n");
        System.out.printf("%-8s %5s %5s %5s %5s %5s %5s %4s\n"
                ,"1er", "x", "-", "-", "-", "-", "-", "-");
        System.out.printf("%-8s %5s %5s %5s %5s %5s %5s %4s\n"
                ,"2er", "-", "-", "-", "-", "-", "-", "x");
        System.out.printf("%-8s %5s %5s %5s %5s %5s %5s %4s\n"
                ,"3er", "-", "-", "x", "-", "-", "-", "-");
        System.out.printf("%-8s %5s %5s %5s %5s %5s %5s %5s\n"
                ,"4er", "x", "x", "x", "x", "x", "x", "x\n");
    }

}
