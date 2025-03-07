//Mairon OmaR Licona Duarte
//201810010200
/*Crear un arreglo multidimensional que guarde más datos personales tus compañeros de clase (nombre,
apellido, carrera, lugarTrabajo), tomando como referencia de la información colocada en el foro
Conociendonos. Llenar 5 registros Ejemplo:

Daniel Medina   Electronica TEST

Monica Jiz  Computacion IMSA
*/

package com.mycompany.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] nombre = new String[5][4];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombre[i][0] = scanner.nextLine();
            System.out.print("Apellido: ");
            nombre[i][1] = scanner.nextLine();
            System.out.print("Carrera: ");
            nombre[i][2] = scanner.nextLine();
            System.out.print("Lugar de Trabajo: ");
            nombre[i][3] = scanner.nextLine();
        }
        
        System.out.println("Lista de datos:");
        for (String[] compañero : nombre) {
            System.out.println("Nombre: " + compañero[0] + ", Apellido: " + compañero[1] + ", Carrera: " + compañero[2] + ", Lugar de Trabajo: " + compañero[3]);
        }
        
        scanner.close();
    }
}

