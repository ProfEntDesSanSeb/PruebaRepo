
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexm
 */
public class Ejercicio3Resuelto {
     public static void main(String[] args) {
        double a = 0, b = 0, c = 0, sol1 = 0, sol2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el coeficiente de x²");
        a = scan.nextDouble();
        System.out.println("Introduce el coeficiente de x");
        b = scan.nextDouble();
        System.out.println("Introduce el termino independiente");
        c = scan.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("La ecuación no tiene soluciones reales.");
        } else {
            sol1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            sol2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: " + sol1 + " y " + sol2);
        }
    }
}
    

