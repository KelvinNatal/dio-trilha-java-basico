package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class Exer2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Resolução do curso -----------------------------
        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

        // Minha Resolução --------------------------------
        /*boolean invalido = true;        

        while(invalido == true){
           System.out.println("Digite uma nota(entre 0 e 10): ");
           nota = scan.nextInt();

           if(nota >= 0 && nota <= 10) invalido = false;
           else System.out.println("Nota inválida, digite novamente.");
        }*/
    }
}
