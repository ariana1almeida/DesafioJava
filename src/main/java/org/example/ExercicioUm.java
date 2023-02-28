package org.example;

/*
 Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça
{
K = K + 1;
SOMA = SOMA + K;
}

imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?
*/
public class ExercicioUm {
    public static void main(String[] args) {
        final int INDICE=13;
        int soma=0;
        int k=0;

        do {
            k+=1;
            soma+=k;
        } while (k<INDICE);

        System.out.println(soma);
    }
}

