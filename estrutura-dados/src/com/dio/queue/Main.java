package com.dio.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.err.println(queueCarros);

        System.err.println(queueCarros.offer(new Carro("Renault")));
        System.err.println(queueCarros);

        System.err.println(queueCarros.peek());
        System.err.println(queueCarros);
    
        System.err.println(queueCarros.poll());
        System.err.println(queueCarros);

        System.err.println(queueCarros.isEmpty());

        System.err.println(queueCarros.size());
    }

}
