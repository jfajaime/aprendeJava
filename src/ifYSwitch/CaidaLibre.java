/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s2
 */
public class CaidaLibre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Programa para calcular Caida Libre");
        System.out.println("**********************************");
        System.out.print("Ingrese la altura para determinar el tiempo >");
        double h=sc.nextDouble();
        System.out.printf("el tiempo que demora en caer es> %.2f segundos\n",(Math.sqrt(2*h))/9.81);
       
    }

}
