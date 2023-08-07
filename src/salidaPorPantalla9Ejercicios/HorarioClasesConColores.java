/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salidaPorPantalla9Ejercicios;
//modifica el programa anterior añadiendo colores. 
//Puedes mostrar cada dia de la semana de un color diferente.

public class HorarioClasesConColores {
    public static void main(String[] args) {
     System.out.printf("\033[31m%-10s \033[32m%5s \033[33m%5s \033[34m%5s \033[35m%5s \033[37m%5s \033[36m%5s \033[34;49m%5s"
                ,"MATERIA/DIA", "L", "M", "M", "J", "V", "S", "D\n");
        System.out.printf("\033[34m%-11s %5s %5s %5s %5s %5s %5s %4s\n"
                ,"MATEMATICA", "x", "-", "-", "-", "-", "-", "-");
        System.out.printf("\033[35m%-11s %5s %5s %5s %5s %5s %5s %4s\n"
                ,"LENGUAS", "-", "-", "-", "-", "-", "-", "x");
        System.out.printf("\033[36m%-11s %5s %5s %5s %5s %5s %5s %4s\n"
                ,"ED. FISICA", "-", "-", "x", "-", "-", "-", "-");
        System.out.printf("\033[39;49m%-11s %5s %5s %5s %5s %5s %5s %5s\n"
                ,"GEOGRAFIA", "x", "x", "x", "x", "x", "x", "x\n");  
        
        System.out.println("--------------");
            String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";

    System.out.println(naranja + "\n Lunes\tMartes\tMiérc.\tJueves\tViernes");
    System.out.println(" ======\t=======\t======\t======\t=======");
    System.out.println(verde + " PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
    System.out.println(verde + " PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
    System.out.println(celeste + " ED" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
    System.out.println(naranja + " FOL" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
    System.out.println(naranja + " FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
    System.out.println(naranja + " FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
    }

}
