
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Diego López
 */
public class Mavenproject1 {

    public static void main(String[] args) {
  



        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de metros
        System.out.print("Ingrese la cantidad de metros: ");
        double metros = scanner.nextDouble();

        // Realizar las conversiones
        double kilometros = metros * 0.001;
        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        // Imprimir los resultados
        System.out.println("\nConversiones:");
        System.out.println("Kilómetros: " + kilometros);
        System.out.println("Centímetros: " + centimetros);
        System.out.println("Milímetros: " + milimetros);

        // Cerrar scanner
        scanner.close();
    }
}
    

