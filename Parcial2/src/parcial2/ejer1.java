/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Ingresa la longitud de los vectores: ");
        int longitud = input.nextInt();

        
        int[] vector1 = new int[longitud];
        int[] vector2 = new int[longitud];
        int[] resultado = new int[longitud];

        
        System.out.println("datos del primer vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("datos " + (i + 1) + ": ");
            vector1[i] = input.nextInt();
        }

        
        System.out.println("datos del segundo vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("datos " + (i + 1) + ": ");
            vector2[i] = input.nextInt();
        }

        for (int i = 0; i < longitud; i++) {
            resultado[i] = vector1[i] + vector2[i];
        }

        System.out.println("Resultado de la suma de los dos vectores iniciales:");
        for (int i = 0; i < longitud; i++) {
            System.out.print(resultado[i] + " ");
        }

        input.close(); 
    }
}
