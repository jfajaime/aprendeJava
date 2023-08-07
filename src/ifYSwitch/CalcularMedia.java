/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Realiza un programa que calcule la media de tres notas.
 */
public class CalcularMedia {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Programa para calcular promedio");
        System.out.println("*******************************");
        System.out.println("Ingrese la nota de tres examenes para promediar");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        double n3=sc.nextDouble();
        System.out.println("El promedio es de> "+(n1+n2+n3)/3);        
    }

}
