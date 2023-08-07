/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifYSwitch;

import java.util.Scanner;

/**
Ejercicio 12
Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
en las diferentes asignaturas del curso.

 */
public class Cuestionario {
    public static void main(String[] args) {
        
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String negro = "\033[30m";
        
        System.out.println("**************"+rojo+"CUESTIONARIO"+negro+"****************");
        System.out.println(verde+"Por cada respuesta correcta sumas un punto");
        System.out.println("Aquí hay una lista de 10 preguntas para que respondas con v o f:");
        Scanner sc=new Scanner(System.in);        
        String respuesta;
        int puntos=0;        
        
        System.out.println("1. ¿La POO es un paradigma de programación?");
        
        respuesta=sc.next();
        if (respuesta.equals("v")) {
            puntos++;
            System.out.println(verde+"correcto!!!"+negro);
        }else{System.out.println(rojo+"incorrecto!"+negro);}
        System.out.println("2. ¿La POO se basa en el concepto de objetos?");
        
        respuesta=sc.next();
        if (respuesta.equals("v")) {
            puntos++;
            System.out.println(verde+"correcto!!!"+negro);
        }else{System.out.println(verde+"incorrecto!"+negro);}
        System.out.println("3. ¿La POO se basa en el concepto de funciones?");
         
        respuesta=sc.next();
        if (respuesta.equals("f")) {
            puntos++;
            System.out.println(verde+"correcto!!!"+negro);
        }else{System.out.println(rojo+"incorrecto!"+negro);}
         System.out.println("4. ¿La POO se basa en el concepto de clases?");
         
        respuesta=sc.next();
         if (respuesta.equals("v")) {
            puntos++;
            System.out.println(verde+"correcto!!!"+negro);
        }else{System.out.println(rojo+"incorrecto!"+negro);}
         System.out.println("5. ¿La herencia es un mecanismo que permite que una"
                 + " clase adquiera las propiedades y comportamientos de otra clase?");
         
         respuesta=sc.next();
         if (respuesta.equals("v")) {
            puntos++;
            System.out.println(verde+"correcto!!!"+negro);
        }else{System.out.println(verde+"incorrecto!"+negro);}
         System.out.println("6. ¿La sobrecarga de métodos permite que una clase "
                 + "tenga varios métodos con el mismo nombre pero con diferentes parámetros?");
         
         respuesta=sc.next();
         if (respuesta.equals("v")) {
            puntos++;
            System.out.println(verde+"correcto!!!"+negro);
        }else{System.out.println(rojo+"incorrecto!"+negro);}
         System.out.println("7. ¿La sobrescritura de métodos permite que una subclase"
                 + " redefina un método de su superclase?");
         
         respuesta=sc.next();
         if (respuesta.equals("v")) {
            puntos++;
            System.out.println(verde+"correcto!!!"+negro);
        }else{System.out.println(rojo+"incorrecto!"+negro);}
         System.out.println("8. ¿El polimorfismo permite que un objeto pueda tomar varias formas?");
         
         respuesta=sc.next();
         if (respuesta.equals("v")) {
            puntos++;
            System.out.println(verde+"correcto!!!"+negro);
        }else{System.out.println(rojo+"incorrecto!"+negro);}
         System.out.println("9. ¿Una interfaz No es una colección de métodos abstractos?");
         
         respuesta=sc.next();
         if (respuesta.equals("f")) {
            puntos++;
            System.out.println(verde+"correcto!!!"+negro);
        }else{System.out.println(rojo+"incorrecto!"+negro);}
         System.out.println("10. ¿Una clase abstracta es una clase que puede ser "
                 + "instanciada directamente?");
         
         respuesta=sc.next();
         if (respuesta.equals("f")) {
            puntos++;
            System.out.println(verde+"correcto!!!"+negro);
        }else{System.out.println(rojo+"incorrecto!"+negro);}
         System.out.println("Tenes un total de > "+puntos+" en este cuestionario");

    }

}
