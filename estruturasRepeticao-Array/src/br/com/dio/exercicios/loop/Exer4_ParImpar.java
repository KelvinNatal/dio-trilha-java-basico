package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class Exer4_ParImpar {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    
    //Minha Resolução --------------------------------

    int numero;
    int quantidade;
    int quantImpar = 0;
    int quantPar = 0;

    System.out.println("Informe quantos números irá digitar: ");
    quantidade = scan.nextInt();

        for(int i = 0; i < quantidade; i++) {

            System.out.println("Digite o número: ");        
            numero = scan.nextInt();    

            if(numero % 2 != 0) quantImpar++;
            else quantPar++;

        }

        System.out.println("Quantidade de números pares: " + quantPar);
        System.out.println("Quantidade de números impares: " + quantImpar);
    
    }
}
