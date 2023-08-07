/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package variables;

/**
Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */
public class OperacionesMatematicas {
    public static void main(String[] args) {
        int x=144;
        int y=999;
        int suma=x+y;
        int resta=x-y;
        int multi=x*y;
        float div=((float )x/(float)y);
        System.out.println("el resultado de la suma es >"+suma+ "\n de la resta >"
                +resta+"\n de la multiplicacion >"+multi+"\nde la division >"+div);
        System.out.println("-------------otra manera de palntear-------------------");  
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("x + y = " + (x + y));
            System.out.println("x - y = " + (x - y));
            System.out.println("x / y = " + ((float)x / (float)y));
            System.out.println("x * y = " + (x * y));
    }
}
