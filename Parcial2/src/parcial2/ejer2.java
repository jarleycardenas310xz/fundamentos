/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ejer2 {
    public static void main(String[] args) {
       
    
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la longitud de los vectores: ");
        int longitud = input.nextInt();

        int[] vector1 = new int[longitud];
        int[] vector2 = new int[longitud];

        System.out.println("Ingresa los elementos del primer vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = input.nextInt();
        }

        System.out.println("Ingresa los elementos del segundo vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = input.nextInt();
        }

        int productoEscalar = 0;
        for (int i = 0; i < longitud; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        System.out.println("Producto escalar de los vectores: " + productoEscalar);

        input.close(); 
    }
}


    
    

