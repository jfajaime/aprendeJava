/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Ejercicio 20
Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.
 */
public class Capicua {
    public static void main(String[] args) {
        System.out.print("Detector de capicuas ingresa un numero > ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cifra=0;
        int UltimaCifra=num%10;
        
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
        if (cifra==UltimaCifra) {
        System.out.println("El numero "+num+" Es Capicua");            
        }else {System.out.println("No, No es capicua");}
    }
    }


