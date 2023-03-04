package br.com.dio.exercicios.array;

import java.util.Random;

public class Exer3_NumerosAleatorios {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[] numerosAleatórios = new int[20];

        for(int i = 0; i < numerosAleatórios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatórios[i] = numero;
        }

        System.out.println("Numeros aleatórios: ");
        for (int numero : numerosAleatórios) {
            System.out.print(numero+ " ");
        }

        System.out.println("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatórios) {
            System.out.print((numero+1) + " ");
        }
    }
}
