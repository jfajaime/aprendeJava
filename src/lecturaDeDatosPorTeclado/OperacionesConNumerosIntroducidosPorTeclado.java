/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecturaDeDatosPorTeclado;

import java.util.Scanner;

/**
Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.

 */
public class OperacionesConNumerosIntroducidosPorTeclado {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Vamos a restar, Sumar, Multiplicar y dividir");
        System.out.println("Ingrese dos numeros separados por un espacio");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("la resta de "+num1+"-"+num2+" es >"+(num1-num2)+"\n"
        + "la suma de "+num1+"+"+num2+" es >"+(num1+num2)+"\n"
                + "la multiplicacion de "+num1+"x"+num2+" es >"+num1*num2+"\n"
        + "la division de "+num1+"/"+num2+" es >"+num1/num2);
        
        System.out.println("-------------del libro-----------------");
        
        double x;//declara como double las variables
        double y;
        String linea;//linea seria una variable auxiliar para recibir los numeros 
        //ingresados´por teclado y trabajar con ellos en este caso parsearlos

        System.out.print("Por favor, introduzca el primer número: ");
        linea = sc.next();
        x = Double.parseDouble(linea);//parseo de los String
        System.out.print("Introduzca el segundo número: ");
        linea = sc.next();
        y = Double.parseDouble(linea);//parseo de los String

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x * y = " + (x * y));
    
    }

}
