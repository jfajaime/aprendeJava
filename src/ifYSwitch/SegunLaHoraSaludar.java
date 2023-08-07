/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifYSwitch;

import java.util.Scanner;

/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos
 * de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta
 * las horas, los minutos no se deben introducir por teclado
 */
public class SegunLaHoraSaludar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Me indica que hora es? >");
        int hora = sc.nextInt();
        if (hora >= 6 && hora <= 12) {
            System.out.println("buenos dias");
        }
        if (hora >= 13 && hora <= 20) {
            System.out.println("buenas tardes");
        }
        if (((hora>=21) && (hora<24))||((hora<=5) && (hora>=0))) {
        System.out.println("buenas noches");
        }           
        if ((hora>=24) || (hora<0)){
            System.out.println("la hora igresada no es correcta");
        }
    }
//        System.out.println("---------------del libro----------------");
        
//        if ((hora >= 6) && (hora <= 12)) {
//            System.out.println("Buenos días");
//        }
//
//        if ((hora >= 13) && (hora <= 20)) {
//            System.out.println("Buenas tardes");
//        }
//
//        if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
//            System.out.println("Buenas noches");
//        }
//
//        if ((hora >= 24) || (hora < 0)) {
//            System.out.println("La hora introducida no es correcta.");
//        }
//}
}