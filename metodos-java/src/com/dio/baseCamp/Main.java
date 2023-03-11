package com.dio.baseCamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Resolvido com Scanner -------------------
        /*Scanner scan = new Scanner(System.in);

        double numero1, numero2;

        Calculadora calculadora = new Calculadora();

        System.out.println("Digite o primeiro número: ");
        numero1 = scan.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = scan.nextDouble();

        calculadora.soma(numero1, numero2);
        calculadora.subtracao(numero1, numero2);
        calculadora.multiplicacao(numero1, numero2);
        calculadora.divisao(numero1, numero2);*/    

        System.out.println("Exercicio Calculadora ");
        Calculadora.soma(10, 5);
        Calculadora.subtracao(3, 40);
        Calculadora.multiplicacao(8, 7);
        Calculadora.divisao(20, 10);

        System.out.println("----------------------------");

        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(0);
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(13);

        System.out.println("----------------------------");

        System.out.println("Exercicio Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);



    }
}
