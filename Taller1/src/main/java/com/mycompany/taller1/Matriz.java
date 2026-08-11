/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura de la piramide (n): ");
        int n = scanner.nextInt();

        System.out.print("Desea centrar las piramides? (1: S1 / 0: No): ");
        int centrar = scanner.nextInt();

        System.out.println("\n PIRAMIDE NORMAL ");
        for (int i = 1; i <= n; i++) {
     
            if (centrar == 1) {
                for (int espacios = 0; espacios < n - i; espacios++) {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n PIRAMIDE INVERTIDA");
        for (int i = n; i >= 1; i--) {
            if (centrar == 1) {
                for (int espacios = 0; espacios < n - i; espacios++) {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

