/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Ejercicio 16
Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
puntos. Las preguntas contestadas con falso no suman puntos. A continuación
se listan las preguntas del test.
• Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente
fiel.
• Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su
vida o en su mente, aunque seguramente será algo sin importancia. No
bajes la guardia.
• Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar
viviendo un romance con otra persona. Te aconsejamos que indagues un
poco más y averigües que es lo que está pasando por su cabeza.
 */
public class CuetionarioParaCornudo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR QUE TAN CARNERO SOS");
        System.out.println("*************CUESTIONARIO*******************");
        System.out.println("Responde verdadero (v) o falso (f)");
        int puntos=0;
        String r;
        
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo\n" +
"aparente.");
        r=sc.next();
        if (r.equals("v")) {
            puntos+=3;
        }        
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        r=sc.next();
        if (r.equals("v")) {
            puntos+=3;
        } 
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        r=sc.next();
        if (r.equals("v")) {
            puntos+=3;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se\n" +
"arregla el pelo y se asea con más frecuencia (si es mujer)");
        r=sc.next();
        if (r.equals("v")) {
            puntos+=3;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        r=sc.next();
        if (r.equals("v")) {
            puntos+=3;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú\n" +
"delante");
        r=sc.next();
        if (r.equals("v")) {
            puntos+=3;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        r=sc.next();
        if (r.equals("v")) {
            puntos+=3;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho\n" +
"más trabajo");
        r=sc.next();
        if (r.equals("v")) {
            puntos+=3;
        }
        System.out.println("9. Has notado que últimamente se perfuma más");
        r=sc.next();
        if (r.equals("v")) {
            puntos+=3;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo\n");
        r=sc.next();
        if (r.equals("v")) {
            puntos+=3;
        }
        if (puntos<=10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente\n" +
"fiel.");
        }if(puntos>=11 && puntos<=22){
            System.out.println("Quizás exista el peligro de otra persona en su\n" +
"vida o en su mente, aunque seguramente será algo sin importancia. No\n" +
"bajes la guardia.");
        if(puntos>=22){
        System.out.println("Tu pareja tiene todos los ingredientes para estar\n" +
"viviendo un romance con otra persona. Te aconsejamos que indagues un\n" +
"poco más y averigües que es lo que está pasando por su cabeza.");
        }
        }                    
    }
}
