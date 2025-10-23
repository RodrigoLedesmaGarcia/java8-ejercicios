package org.example.ejercicios.ejercicios.piramideAsteriscos;

import java.util.Scanner;

public class PiramideAsteriscos {
    public static void main(String... hola_mundo_desde_java) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hola ingresa la altura de tu piramide: ");
        int altura = 15; //scanner.nextInt();

        System.out.println(" ");
        piramide(altura);
        System.out.println(" ");


    }
    private static void piramide(int altura){

        for (int i = 1; i <= altura; i++){

            for (int k = 1; k <= altura-i; k++)
                System.out.print(" ");
            for(int j = 1; j <=i; j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

    private static void piramideInvertida(int altura) {

        for (int i = altura; i >= 1; i--) {

            for (int k = 1; k <= altura - i; k++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
