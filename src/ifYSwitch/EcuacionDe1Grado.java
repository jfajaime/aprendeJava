/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
0).
Ejemplo 1:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 2
Ahora introduzca el valor de b: 1
x = -0.5
Ejemplo 2:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 0
Ahora introduzca el valor de b: 7
Esa ecuación no tiene solución real.

 */
public class EcuacionDe1Grado {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Este Programa resuelve ecuaciones de tipo ax+b=0");
        System.out.println("************************************************");
        System.out.print("Ingrese el valos de a> ");
        int a = sc.nextInt();
        System.out.print("Ingrese el valor de b> ");
        int b = sc.nextInt();
        if (a == 0) {
            System.out.println("Esa ecuacion No tiene solucion Real!!!");
        } else {
            System.out.println("x=" + (-b / a));//formula secreeeeeta
        }
    }
}
