    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    package lecturaDeDatosPorTeclado;

    import java.util.Scanner;

    /**

     */
    public class DatosPorTeclado {
        public static void main(String[] args) {
    //        Scanner sc=new Scanner(System.in);
    //       String nombre;
    //       System.out.print("Por favor, dime cómo te llamas: ");
    //       nombre = sc.next();
    //       System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");

            System.out.println("----------------------");
    //       String nombre1;
    //        System.out.print("Por favor, dime cómo te llamas: ");
    //        nombre1 = System.console().readLine();
    //        System.out.println("Hola " + nombre1 + ", ¡encantado de conocerte!");
            Scanner s = new Scanner(System.in);
            System.out.print("Introduce tres números (pueden contener decimales) separados por espacio");
            double x1 = s.nextDouble();
            double x2 = s.nextDouble();
            double x3 = s.nextDouble();
            double media = (x1 + x2 + x3) / 3;
            System.out.println("La media de esos tres números es " + media);
            System.out.println("---------------------------------------");

            Scanner ss = new Scanner(System.in);
            System.out.print("Introduce tu nombre y tu edad separados por un espacio: ");
            String nombre = s.next();
            int edad = s.nextInt();
            System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
             }

}
