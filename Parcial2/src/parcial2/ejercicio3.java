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
public class ejercicio3 {
 public static void main(String[] args) {
        


    
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que ingrese las dimensiones de las matrices
        System.out.print("Ingresa el número de filas de la matriz A: ");
        int filasA = input.nextInt();
        System.out.print("Ingresa el número de columnas de la matriz A: ");
        int columnasA = input.nextInt();
        System.out.print("Ingresa el número de filas de la matriz B: ");
        int filasB = input.nextInt();
        System.out.print("Ingresa el número de columnas de la matriz B: ");
        int columnasB = input.nextInt();

        // Verificar si las matrices son multiplicables
        if (columnasA != filasB) {
            System.out.println("No se pueden multiplicar las matrices. El número de columnas de la matriz A debe ser igual al número de filas de la matriz B.");
            return;
        }

        // Declarar las matrices de entrada y la matriz de resultado
        int[][] matrizA = new int[filasA][columnasA];
        int[][] matrizB = new int[filasB][columnasB];
        int[][] resultado = new int[filasA][columnasB];

       

        
     

