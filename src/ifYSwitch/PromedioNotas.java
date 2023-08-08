/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
jercicio 21
Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior.
Ejemplo 1:
Nota del primer control: 7
Nota del segundo control: 10
Tu nota de Programación es 8.5
Ejemplo 2:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
Tu nota de Programación es 5
Ejemplo 3:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
Tu nota de Programación es 4.5
 */
public class PromedioNotas {
    public static void main(String[] args) {
        System.out.println("Ingrese las notas del trimestre de programacion");
        Scanner sc=new Scanner(System.in);
        double promedio=0;
        System.out.println("Ingrese la primera nota");
        double nota1=sc.nextDouble();
        System.out.println("Ingrese la segunda nota");
        double nota2=sc.nextDouble();
        promedio=(nota1+nota2)/2;
        if (promedio>=5) {
            System.out.println("Esta aprobado con un promedio de > "+promedio);
        }if (promedio<5) {
            System.out.println("Cual es el resultado de la recuperacion (apto/no apto)");
            String recuperatorio=sc.next();
            if (recuperatorio.equals("apto")) {
                System.out.println("Tu nota es de 5");            
        }else{System.out.println(promedio);}
        }

    }

}
