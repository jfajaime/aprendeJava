/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
 */
public class DiaYMateriaConSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el dia para saber que materia cursara: ");
        String dia=sc.next();
        dia=dia.toLowerCase();//convierte en minusculas todas las letras
        String materia;
        switch(dia){
            case "lunes":
                materia="matematicas";
                System.out.println("la materia del dia "+dia+" es> "+materia);
                break;
            case "martes":
                materia="lengua";
                System.out.println("la materia del dia "+dia+" es> "+materia);
                break;
            case "miercoles":
                materia="geografia";
                System.out.println("la materia del dia "+dia+" es> "+materia);
                break;
            case "jueves":
                materia="plastica";
                System.out.println("la materia del dia "+dia+" es> "+materia);
                break;
            case "viernes":
                materia="civica";
                System.out.println("la materia del dia "+dia+" es> "+materia);
                break;
            case "sabado":
                materia="salir de joda";
                System.out.println("la materia del dia "+dia+" es> "+materia);
                break;
            case "domingo":
                materia="descansar";
                System.out.println("la materia del dia "+dia+" es> "+materia);
                break;
                default:
                    System.out.println("dia de la semana mal escrito o no definido");
          }
            
    }

}
