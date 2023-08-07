/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecturaDeDatosPorTeclado;

import java.util.Scanner;

/**
Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
 */
public class IngresarNumYMostratResultado {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("por favor ingrese dos numeros separados por un espacio");
        int x=s.nextInt();
        int y=s.nextInt();
        int resultado = x*y;
        System.out.println("el resultado de "+x+"*"+y+"="+" es >"+resultado);
        
        System.out.println("--------------------resuelto del libro------------------------");
        
            String linea;//ingresa o pide los numeros como texto/String y los parsea

            System.out.println("Este programa multiplica dos números enteros.");
            System.out.print("Por favor, introduzca el primer número: ");
            linea = s.next();
            x = Integer.parseInt(linea);
            System.out.print("Introduzca el segundo número: ");
            linea = s.next();
            y = Integer.parseInt(linea);

            System.out.println(x + " * " + y + " = " + (x * y));
    }

}
