/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ValidarContrasena {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la contraseña a evaluar: ");
        String contrasena = scanner.nextLine();

        boolean tieneLargoMinimo = contrasena.length() >= 8;
        boolean tieneMayuscula = false;
        boolean tieneDigito = false;
        boolean tieneEspecial = false;

        String especialesPermitidos = "!@#$%^&*";

        int i = 0;
        while (i < contrasena.length()) {
            char c = contrasena.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } 
            if (Character.isDigit(c)) {
                tieneDigito = true;
            } 
            if (especialesPermitidos.contains(String.valueOf(c))) {
                tieneEspecial = true;
            }

            i++;
        }

        System.out.println("\nRESULTADO DE LA VALIDACION");
        System.out.println("Al menos 8 caracteres: " + (tieneLargoMinimo ? "[CUMPLIDO]" : "[NO CUMPLIDO]"));
        System.out.println("Al menos una mayuscula: " + (tieneMayuscula ? "[CUMPLIDO]" : "[NO CUMPLIDO]"));
        System.out.println("Al menos un digito: " + (tieneDigito ? "[CUMPLIDO]" : "[NO CUMPLIDO]"));
        System.out.println("Al menos un caracter especial (!@#$%^&*): " + (tieneEspecial ? "[CUMPLIDO]" : "[NO CUMPLIDO]"));

        if (tieneLargoMinimo && tieneMayuscula && tieneDigito && tieneEspecial) {
            System.out.println("\nEstado: Contraseña válida y segura.");
        } else {
            System.out.println("\nEstado: Contraseña no válida.");
        }

        scanner.close();
    }
}

