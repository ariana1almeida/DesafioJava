package org.example;

import java.util.ArrayList;
import java.util.List;

/*
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre
* será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
* escreva um programa na linguagem que desejar onde, informado um número, ele calcule a
* sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence
* ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser
* previamente definido no código;
* */

public class ExercicioDois {
    public static void main(String[] args) {
        System.out.println(fibonacci(33));
    }

    public static boolean fibonacci(Integer numeroASerEncontrado){

        int n = 10, primeiroNumero = 0, segundoNumero = 1;
        List<Integer> fibonacci = new ArrayList<>(List.of(primeiroNumero, segundoNumero));

        for (int i=1; i<= n; i++) {

            int proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;

            fibonacci.add(proximoNumero);

        }
        fibonacci.forEach(System.out::println);
        return fibonacci.contains(numeroASerEncontrado);
    }
}
