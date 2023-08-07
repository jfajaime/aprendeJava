/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
escribe un programa en que dado un número del 1 a 7 escriba el correspondiente 
* nombre del día de la semana.
 */
public class EscribeElDiaDeLaSemana {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7 para saber el dia de la semana que corresponde");
        int num=sc.nextInt();
        String dia="";
        if (num<=7 && num>=1) {
            switch(num){
                case 1:dia ="lunes";break;
                case 2:dia="martes";break;
                case 3:dia="miercoles";break;
                case 4:dia="jueves";break;
                case 5:dia="viernes";break;
                case 6:dia="sabado";break;
                case 7:dia="domingo";break;
                default:
                    System.out.println("nada!!! hice un if antes");
               }System.out.println("el numero seleccionado es> "+num+" corresponde a > "+dia);
          }else{System.out.println("Numero seleccionado fuera de rango!!!");} 
        
    }

}
