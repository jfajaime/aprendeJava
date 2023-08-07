/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Ejercicio 17
Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.

 */
public class UltimaCifra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ingrese un numero > ");
        int num =sc.nextInt();
        num=num%10;//el mod10 me deja el ultimo digito o cifa de un numero
        System.out.println("La ultima cifra es > "+num);
    }

}
