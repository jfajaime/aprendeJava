/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Ejercicio 15
Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha.
 */
public class PiramideQueApunta {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Programa que pinta una piramide con el caracter que ingrese");
        System.out.println("ingrese el caracter de relleno");
        String a=sc.next();
        System.out.println("Hacia donde quiere que apunte su piramide");
        System.out.println("1- Hacia arriba");
        System.out.println("2- Hacia abajo");
        System.out.println("3- Hacia izquierda");
        System.out.println("4- Hacia derecha");
        int p=sc.nextInt();
        
        switch (p){
            case 1:
                System.out.println("  "+a);
                System.out.println(" "+a+a+a);
                System.out.println(a+a+a+a+a);
        break;
            case 2:
                System.out.println(a+a+a+a+a);
                System.out.println(" "+a+a+a);
                System.out.println("  "+a);
        break;
             case 3:
                 System.out.println("    "+a);
                 System.out.println("  "+a+" "+a);
                 System.out.println(""+a+" "+a+" "+a);
                 System.out.println("  "+a+" "+a);
                 System.out.println("    "+a);
                 break;
              case 4:
                  System.out.println(a);
                  System.out.println(a+a);
                  System.out.println(a+a+a);
                  System.out.println(a+a);
                  System.out.println(a);
                  break;
                  default:
                      System.out.println("Ingrese una opcion valida!!!");
        }        
    }
}
