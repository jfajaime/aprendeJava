/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
 */
public class PromedioMateriasConIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Programa para calcular promedio");
        System.out.println("*******************************");
        System.out.println("Ingrese la nota de tres examenes para promediar");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        double n3=sc.nextDouble();
        double media=(n1+n2+n3)/3;
        System.out.println("El promedio es de > "+media); 
        if (media<5) {
            System.out.println("INSUFICIENTE");            
        }
        if (media>=5&&media<6) {
            System.out.println("SUFICIENTE");            
        }
        if (media>=6&&media<7) {
            System.out.println("BIEN");
        }
        if (media>=7&&media<9) {
            System.out.println("NOTABLE");
        }
        if (media>=9) {
            System.out.println("SOBRESALIENTE");
        }
       
    }
    
}
