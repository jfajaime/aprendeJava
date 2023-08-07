/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

/**
En el siguiente programa puedes ver el uso de operadores lógicos combinado con
operadores relacionales (operadores de comparación). Intenta adivinar cuál será el
resultado mirando el código.
 */
public class OperadoresLogicosCombinados {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + !a);
        System.out.println("a || (6 > 10) = " + (a || (6 > 10)));
        System.out.println("((4 <= 4) || false) && (!a) = " + (((4 <= 4) || false) && (!a)));
    }

}
