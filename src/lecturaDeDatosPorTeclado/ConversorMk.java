/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecturaDeDatosPorTeclado;

import java.util.Scanner;

/**
Realiza un conversor de Mb a Kb.
 */
public class ConversorMk {
    public static void main(String[] args) {
        String naranja = "\033[33m";
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese los MB que desea conertir >");
        double mb=sc.nextDouble();
        System.out.println(naranja+mb+" Mb son "+(mb*1024)+" Kb");
        System.out.println("----------------------------------------");
        System.out.print("Ingrese los KB que desea convertir a MB >");
        double kb=sc.nextDouble();
        System.out.println(naranja+kb+" Kb son "+(kb/1024)+" MB");
        
    }

}
