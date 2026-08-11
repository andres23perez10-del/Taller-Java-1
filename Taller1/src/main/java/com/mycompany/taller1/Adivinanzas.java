/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

/**
 *
 * @author User
 */
import java.util.Random;
import java.util.Scanner;
public class Adivinanzas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Genera un número aleatorio entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        int maxIntentos = 7;
        int intentosUsados = 0;
        boolean acerto = false;

        System.out.println(" JUEGO DE ADIVINANZA DE NUMEROS");
        System.out.println("He pensado un numero entre 1 y 100. Tienes " + maxIntentos + " intentos.");

        while (intentosUsados < maxIntentos && !acerto) {
            intentosUsados++;
            System.out.print("\nIntento " + intentosUsados + "/" + maxIntentos + ". Ingrese un numero: ");
            int intento = scanner.nextInt();

            if (intento == numeroSecreto) {
                acerto = true;
                System.out.println("Correcto Has adivinado el numero en " + intentosUsados + " intento(s).");
            } else if (intento > numeroSecreto) {
                System.out.println("Muy alto.");
            } else {
      
                int diferencia = Math.abs(numeroSecreto - intento);
                if (diferencia <= 10) {
                    System.out.println("Muy caliente (estas a 10 o menos de distancia).");
                } else {
                    System.out.println("Muy frio (estas a mas de 10 de distancia).");
                }
            }
        }

        if (!acerto) {
            System.out.println("\nSe han agotado tus intentos. El numero secreto era: " + numeroSecreto);
        }

        scanner.close();
    }
}

