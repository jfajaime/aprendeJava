/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifYSwitch;

import java.util.Scanner;

/**
 * Ejercicio 22 Realiza un programa que, dado un día de la semana (de
 * lunes a viernes) y una hora (horas y minutos), calcule cuántos
 * minutos faltan para el fin de semana. Se considerará que el fin de
 * semana comienza el viernes a las 15:00h. Se da por hecho que el
 * usuario introducirá un día y hora correctos, anterior al viernes a
 * las 15:00h.
 */
public class E22calculoParaElFinDeSemana {

    public static void main(String[] args) {

        System.out.println("ingrese dia de la (lunes a viernes) semana para calcular cuanto falta para el finde!!!");
        Scanner sc=new Scanner(System.in);
        String dia=sc.next();
        System.out.println(" Ingrese la hora para el calculo!!!");
        double hora=sc.nextDouble();

    }
}
