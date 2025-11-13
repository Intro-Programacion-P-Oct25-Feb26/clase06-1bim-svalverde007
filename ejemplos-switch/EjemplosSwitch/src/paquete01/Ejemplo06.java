/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo06 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese su placa");
        String placa = entrada.nextLine();
        String inicial = placa.substring(0, 1);
                
        switch (inicial) {
            case "p" :
                System.out.printf("La placa %s pertenece a la provincia de Pichincha.", placa);
                break;

            case "g":
                System.out.printf("La placa %s pertenece a la provincia de Guayas.", placa);
                break;
            default:
                System.out.println("Acceso incorrecto");
                break;
        }

    }
}
