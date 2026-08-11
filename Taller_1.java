/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller_1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Taller_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer lado (a): ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el segundo lado (b): ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el tercer lado (c): ");
        double c = scanner.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {

            if (a == b && b == c) {
                System.out.println("El triangulo es Equilatero (todos los lados iguales).");
            } else if (a == b || a == c || b == c) {
                System.out.println("El triangulo es Isosceles (dos lados iguales).");
            } else {
                System.out.println("El triangulo es Escaleno (todos los lados diferentes).");
            }
        } else {

            System.out.println("Error: Los valores ingresados no forman un triangulo válido.");
        }

        scanner.close();
    }
}

