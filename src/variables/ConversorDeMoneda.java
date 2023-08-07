/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package variables;

/**
 Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.
 */
public class ConversorDeMoneda {
    public static void main(String[] args) {
        double pesos=150000;
        int dolar=(int)(pesos/527);
        System.out.println(dolar+" dolares son "+pesos+" pesos");
        
        double euros = 6.00;
        int pesetas = (int) (euros * 166.386);    
        System.out.print(euros + " euros son " + pesetas + " pesetas.\n");
        
        
        System.out.println("+-----------------------------------------+");
//        Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
//          convertir deberá estar almacenada en una variable.

        dolar=527;
        pesos= (double)(dolar*284);
        System.out.println(pesos+" pesos son "+dolar+" dolares");
        
         int peseta = 10000;
         double euro = peseta / 166.386;
    
        System.out.println(peseta + " pesetas son " + euro + " euros.");
        // Para mostrar dos decimales se puede usar "printf"
        // en lugar de "print" o "println"
        System.out.printf("%d pesos son %.2f dolares.\n", peseta, euro);
    }

}
