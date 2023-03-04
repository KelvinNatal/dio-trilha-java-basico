package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class Exer5_Tabuada {
    public static void main(String[] args) {

        //Minha Resolução ----------------------------------------
        Scanner scan = new Scanner(System.in);

        int numeroTabuada;

        System.out.println("Digite qual tabuada deseja ver: ");
        numeroTabuada = scan.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(" " + numeroTabuada + " X " + i + " = " + numeroTabuada * i);
        }

    }
}
