package org.example.exerciciotres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa,
na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser
ignorados no cálculo da média;
*/
public class ExercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner("exemplo_tres.json");
        while (sc.hasNextLine()) {
            List<ObjetoVenda> diaDaVenda = new ArrayList<>();
            sc.nextLine();
        }
    }
}
