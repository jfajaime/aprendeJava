/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecturaDeDatosPorTeclado;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
Escribe un programa que calcule el volumen de un cono según la fórmula 
* V =1/3.π.r2.h
 */
public class CalcularCono {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("VOLUMEN DE CONO");
        System.out.println("---------------");
        System.out.print("Ingrese la longitud de la radio en cm> ");
        double radio=sc.nextDouble();
        System.out.print("ingrese la longitud de la altura en cm> ");
        double altura=sc.nextDouble();
        double v=(1.0/3.0)*PI*radio*radio*altura;
        System.out.printf("el volumen del cono es %.2f", v);
        System.out.println(" cm3");
    }

}
