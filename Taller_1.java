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

        // Lectura de los lados
        System.out.print("Ingrese el primer lado (a): ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el segundo lado (b): ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el tercer lado (c): ");
        double c = scanner.nextDouble();

        // 1. Validación de la desigualdad triangular
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            // 2. Clasificación
            if (a == b && b == c) {
                System.out.println("El triángulo es Equilátero (todos los lados iguales).");
            } else if (a == b || a == c || b == c) {
                System.out.println("El triángulo es Isósceles (dos lados iguales).");
            } else {
                System.out.println("El triángulo es Escaleno (todos los lados diferentes).");
            }
        } else {
            // 3. Mensaje de error
            System.out.println("Error: Los valores ingresados no forman un triángulo válido.");
        }

        scanner.close();
    }
}

