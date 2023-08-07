/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
jercicio 13
Escribe un programa que ordene tres números enteros introducidos por teclado.
 */
public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int aux;
        System.out.println("PROGRAMA PARA ORDENAR NUMEROS");//sin cambiar el orden de las variable solo su contenido
        System.out.println("Ingrese tres numeros separados por un espacio");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //orden de los dos primeros numeros
        if (a>b) {
            aux=a;
            a=b;
            b=aux;
        }//ordena los dos ultimos
        if (b>c) {
            aux=b;
            b=c;
            c=aux;            
        }//se vuelve a ordenar los primeros
        if (a>b) {
            aux=a;
            a=b;
            b=aux;
        }
        System.out.println("Ordenado de mayor a menor a> "+a+" b > "+b+" c > "+c);
    }
}
