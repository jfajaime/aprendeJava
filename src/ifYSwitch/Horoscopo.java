/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.
 */
public class Horoscopo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Programa para averiguar signo del sodiaco a"
                + "partir de su fecha de nacimiento");
        System.out.println("Ingrese el mes en que nacio (1-12)");
        int mes=sc.nextInt();
        System.out.println("Ingrese el numero de dia (1-31)");
        int dia=sc.nextInt();
        String horoscopo="";
        switch(mes){
            case 1:
                if (dia<21) {
                    horoscopo="Capricornio";                    
                }else{
                    horoscopo="Acuario";
                }break;
            case 2:
                if (dia<20) {
                    horoscopo="Acuario";
                }else{
                    horoscopo="Picis";
                }break;
            case 3:
                if (dia<21) {
                    horoscopo="Picis";
                }else{
                    horoscopo="Aries";
                }break;
            case 4:
                if (dia<21) {
                    horoscopo="Aries";
                }else{
                    horoscopo="Tauro";
                }break;
            case 5:
                if (dia<20) {
                    horoscopo="Tauro";
                }else{
                horoscopo="Geminis";
                }break;
            case 6:
                if (dia<22) {
                    horoscopo="Geminis";                    
                }else {
                horoscopo="Cancer";            
                }break;
            case 7:
                if (dia<22) {
                    horoscopo="Cancer";
                }else {
                    horoscopo="leo";
                }break;
            case 8:
                if (dia<24) {
                    horoscopo="Leo";
                }else {
                    horoscopo="Virgo";
                }break;
            case 9:
                if (dia<23) {
                    horoscopo="Virgo";
                }else {
                horoscopo="Libra";
                }break;
            case 10:
                if (dia<23) {
                    horoscopo="Libra";
                }else {
                    horoscopo="Escorpio";
                }break;
            case 11:
                if (dia<23) {
                    horoscopo="Escorpio";
                }else{
                horoscopo="Sagitario";
                }break;
            case 12:
                if (dia<21) {
                    horoscopo="Sagitario";
                }else{
                    horoscopo="Capricornio";
                }break;
                default:
        }
        System.out.println("Su horoscopo es > "+horoscopo);
    }

}
