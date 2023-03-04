package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class Exer3_MaiorMedia {
        public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Minha Resolução --------------------------------
        int numero, soma = 0;
        int maiorNumero = 0;
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i+1) + "° número: ");
            numero = scan.nextInt();

            soma += numero;

            if(numero > maiorNumero) maiorNumero = numero;
        }

        System.err.println("A Média dos números é: " + soma/5);
        System.err.println("O maior número é: " + maiorNumero);

        //Resolução do curso -------------------------------
        /*int numero;
        int soma = 0;
        int maior = 0;

        int count = 0;

        do {
          System.out.println("Número: ");
          numero = scan.nextInt();
          count += 1;
          soma += numero;

          if(numero > maior){
              maior = numero;
          }

        }while(count < 5);

        System.out.println("A Média dos números é: " + soma / 5);
        System.out.println("O maior número é: " + maior);*/
        
    }
}
