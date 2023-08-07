/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
* 
Ejemplo 1:
Por favor, introduzca el número de horas trabajadas durante la semana: 36
El sueldo semanal que le corresponde es de 432 euros
Ejemplo 2:
Por favor, introduzca el número de horas trabajadas durante la semana: 40
El sueldo semanal que le corresponde es de 480 euros
Ejemplo 3:
Por favor, introduzca el número de horas trabajadas durante la semana: 55
El sueldo semanal que le corresponde es de 720 euros
 */
public class SalarioConHorasExtras {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCULO DE SALARIO SEMANAL");
        System.out.println("--------------------------");
        System.out.print("Ingrese la cantidad de horas trabajadas en la semana >");
        int horasTrabajadas=sc.nextInt();
        int normal=480;
        if (horasTrabajadas<=40) {
            normal=horasTrabajadas*12;                   
        }else{
            normal=(40*12)+((horasTrabajadas-40)*16);//es un dolor de urea pensar esta operacion
        }
    System.out.println("Su salario semanal es> $"+normal+" pesos.-"); 
    }
}
