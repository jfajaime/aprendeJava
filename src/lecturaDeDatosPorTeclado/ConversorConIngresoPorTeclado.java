/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecturaDeDatosPorTeclado;

import java.util.Scanner;

/**
Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.

 */
public class ConversorConIngresoPorTeclado {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Conversor de Moneda \n-----------------------");
        System.out.println("Ingrese la cantidad de dolares que desea convertir a pesos");
        int d=s.nextInt();
        double p=d*527;
        System.out.println(d+" dolares son "+p+" pesos");
        System.out.printf("%.2f pesos son %d dolares.\n", p, d);//%.2f solo deja agregar dos decimales al double
        

        
//        Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
//convertir debe ser introducida por teclado.
        System.out.print("Ingrese la cantidad de pesos que desea convertir a dolares >");        
        int peso=s.nextInt();
        double dolar=peso/527;
        
        System.out.printf("%d pesos son %.2f dolares.\n", peso, dolar);
        
    }

}
