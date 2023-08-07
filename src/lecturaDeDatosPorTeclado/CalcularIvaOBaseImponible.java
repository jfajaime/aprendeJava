/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecturaDeDatosPorTeclado;

import java.util.Scanner;

/**
Escribe un programa que calcule el total de una factura a partir de la base
imponible. O sea producto sin Iva, el Iva del producto y el total
 */
public class CalcularIvaOBaseImponible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ticket con IVA incluido");
        System.out.println("***********************");
        System.out.println("Ingrese el precio del articulo para calcular su iva y total final");
        double articulo=sc.nextDouble();
        System.out.printf(" \nCosto de articulo  %8.2f $\n", articulo);
        System.out.printf("IVA (21%%)          %8.2f $\n", (articulo*0.21));
        System.out.printf("---------------------------\n");
        System.out.printf("TOTAL              %8.2f $\n", (articulo*1.21));
        
    }

}
