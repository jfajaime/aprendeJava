/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Ejercicio 11
Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.
 */
public class TiempoQueFalta {
    public static void main(String[] args) {
        System.out.println("Programa que determina segun la hora, los segundos que faltan para media noche");
        System.out.println("-----------------------------------------------------------");
        Scanner sc=new Scanner(System.in);
        int hora,min,seg;
        System.out.print("Ingrese la hora > ");
        hora=sc.nextInt();
        System.out.print("Ingrese los minutos > ");
        min=sc.nextInt();
        min+=hora*60;
        seg=min*60;
        System.out.println("los segundos que faltan para media noche son >"+(86400-seg));   
        System.out.println("**********************del libro**************************************");
        System.out.print("A continuación deberá introducir una hora del día, ");
    System.out.println("primero introducirá la hora y luego los minutos.");
    
    System.out.print("hora: ");
    int horas = sc.nextInt();
    
    System.out.print("minuto: ");
    int minuto = sc.nextInt();

    int segundosTranscurridos = (horas * 3600) + (minuto * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
            
    //System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " + segundosHastaMedianoche + " segundos.");
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.", horas, minuto, segundosHastaMedianoche);
    }
}
