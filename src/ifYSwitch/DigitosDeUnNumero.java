/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Ejercicio 19
Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */
public class DigitosDeUnNumero {
    public static void main(String[] args) {
        System.out.print("ingresa un numero > ");
        Scanner sc=new Scanner(System.in);
        int cifra=0;
        int num=sc.nextInt();
        if (num<10) {
            cifra=1;            
        }
        if (num>=10 && num<100) {
            cifra=2;
        }
        if (num>=100 && num<1000) {
            cifra=3;            
        }
        if (num>=1000 && num<10000) {
            cifra=4;
        }
        if (num>=10000) {
            cifra=5;
        }
        System.out.println("La cantidad de cifras que tiene el numero ingresado es > "+cifra);
    }
    }


