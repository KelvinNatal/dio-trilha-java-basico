package com.dio.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.err.println(listCarros.contains(new Carro("Ford")));
        System.err.println(listCarros.get(2));
        System.out.println(listCarros.indexOf(new Carro("Fiat")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
    }

}
