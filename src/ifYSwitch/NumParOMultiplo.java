/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Ejercicio 14
Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.
 */
public class NumParOMultiplo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero y el programa le dira si es par "
                + "o multiplo de 5");
        int num=sc.nextInt();
        if (num%2==0) {
            System.out.println("El numero ingresado es PAR!!!");            
        }else{
            System.out.println("No es par!!!");
        }
        if (num%5==0) {
            System.out.println("El numero ingresado es multiplo de 5!!!");
        }else{
            System.out.println("NO es multiplo de 5!!!");
        }
    }

}
