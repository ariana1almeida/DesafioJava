package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;


/*
4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação
que cada estado teve dentro do valor total mensal da distribuidora.
 */
public class ExercicioQuatro {
    public static void main(String[] args) {
        Map<String, BigDecimal> estados = new HashMap();
        estados.putAll(
                Map.of(
                        "saoPaulo", BigDecimal.valueOf(67836.43),
                        "rioDeJaneiro", BigDecimal.valueOf(36678.66),
                        "minasGerais", BigDecimal.valueOf(29229.88),
                        "espiritoSanto", BigDecimal.valueOf(27165.48),
                        "outrosEstados", BigDecimal.valueOf(19849.53)));
        BigDecimal totalDistribuidora =
                estados
                        .values()
                        .stream()
                        .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(totalDistribuidora);
        estados.keySet().forEach(estado -> {
            estados.get(estado);
            BigDecimal valor = estados.get(estado);
            valor = valor.multiply(BigDecimal.valueOf(100));
            valor = valor.divide(totalDistribuidora, 2, RoundingMode.HALF_EVEN);
            System.out.println(estado + ": " + valor + "%");
        });


    }
}
