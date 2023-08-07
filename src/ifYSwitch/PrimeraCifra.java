/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Ejercicio 18
Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.
 */
public class PrimeraCifra {
    public static void main(String[] args) {
        System.out.print("ingresa un numero > ");
        Scanner sc=new Scanner(System.in);
        int cifra=0;
        int num=sc.nextInt();
        if (num<10) {
            cifra=num;            
        }
        if (num>=10 && num<100) {
            cifra=num/10;
        }
        if (num>=100 && num<1000) {
            cifra=num/100;            
        }
        if (num>=1000 && num<10000) {
            cifra=num/1000;
        }
        if (num>10000) {
            cifra=num/10000;
        }
        System.out.println("La primera cifra del numero ingresado es > "+cifra);
    }

}
