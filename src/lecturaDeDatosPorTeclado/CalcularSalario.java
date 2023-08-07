/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecturaDeDatosPorTeclado;

import java.util.Scanner;

/**
Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
 */
public class CalcularSalario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCULO DE SALARIO SEMANAL");
        System.out.println("--------------------------");
        System.out.print("Ingrese la cantidad de horas trabajadas en la semana >");
        int horasTrabajadas=sc.nextInt();
        System.out.println("Su salario semanal es> $"+horasTrabajadas*12+" pesos.-");
    }
}
