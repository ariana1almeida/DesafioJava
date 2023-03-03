package org.example;

/*
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência
ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
 */
public class ExercicioCinco {
    public static void main(String[] args) {
        String textoParaInverter="Quero fazer parte do time Target";
        int tamanho=textoParaInverter.length();
        char[] arrayTemporario=new char[tamanho];
        char[] charArray=new char[tamanho];

        for (int i = 0; i < tamanho; i++) {
            arrayTemporario[i] = textoParaInverter.charAt(i);
        }

        for (int j = 0; j < tamanho; j++) {
            charArray[j] = arrayTemporario[tamanho - 1 - j];
        }

        String textoInvertido = new String(charArray);
        System.out.println(textoInvertido);
    }
}
