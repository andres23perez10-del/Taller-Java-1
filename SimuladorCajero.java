/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class SimuladorCajero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 500000.0;
        int retirosRealizados = 0;
        final int LIMITE_RETIROS = 3;
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n MENU CAJERO AUTOMATICO");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consignar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("Error: Por favor ingrese un numero válido.");
                scanner.next();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\nSu saldo actual es: $" + saldo);
                    break;

                case 2:
                    if (retirosRealizados >= LIMITE_RETIROS) {
                        System.out.println("\nError: Ha alcanzado el límite maximo diario de " + LIMITE_RETIROS + " retiros.");
                    } else {
                        System.out.print("Ingrese el monto a retirar: $");
                        double montoRetiro = scanner.nextDouble();

                        if (montoRetiro <= 0) {
                            System.out.println("Error: El monto a retirar debe ser mayor a 0.");
                        } else if (montoRetiro > saldo) {
                            System.out.println("Error: Saldo insuficiente. Su saldo actual es: $" + saldo);
                        } else {
                            saldo -= montoRetiro;
                            retirosRealizados++;
                            System.out.println("Retiro exitoso. Retiros realizados hoy: " + retirosRealizados + "/" + LIMITE_RETIROS);
                            System.out.println("Nuevo saldo: $" + saldo);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el monto a consignar: $");
                    double montoConsignacion = scanner.nextDouble();

                    if (montoConsignacion <= 0) {
                        System.out.println("Error: El monto a consignar debe ser mayor a 0.");
                    } else {
                        saldo += montoConsignacion;
                        System.out.println("Consignacion exitosa. Nuevo saldo: $" + saldo);
                    }
                    break;

                case 4:
                    System.out.println("\nGracias por usar el cajero automático. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion no válida. Intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }
}

