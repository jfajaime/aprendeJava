/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecturaDeDatosPorTeclado;

import java.util.Scanner;

/**
Escribe un programa que calcule el área de un rectángulo.
Escribe un programa que calcule el área de un triángulo.
 */
public class CalculoDeAreaRectanguloYTriangulo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String rojo="\033[31m";
        String verde = "\033[32m";
        System.out.println("AREA DE UN RECTANGULO");
        System.out.println("---------------------");
        System.out.println("Ingrese la longitud de la base en centimetros"+rojo);
        double base=sc.nextDouble();
        System.out.println("Ingrese la longitud de la altura");
        double altura=sc.nextDouble();
        System.out.println("El area del rectangulo es >"+verde+(base*altura)+" cm2");
        System.out.println(" ");
        
        System.out.println("AREA DE UN TRIANGULO");
        System.out.println("--------------------");
        System.out.println("Ingrese la longitud de la base del triangulo");
        double b=sc.nextDouble();
        System.out.println("Ingrese la longitud de la altura");
        double a=sc.nextDouble();
        System.out.println("El area del triangulo es>"+rojo+(b*a)/2+" cm2");
    }
}
