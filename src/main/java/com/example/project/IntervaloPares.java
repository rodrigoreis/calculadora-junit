package com.example.project;

import java.util.Scanner;

public class IntervaloPares {
    
    public static final String IMPOSSIVEL_CALCULAR_INTERVALO = "Impossível calcular o intervalo.";
    private final int numeroInicial;
    private final int numeroFinal;

    public IntervaloPares(int numeroInicial, int numeroFinal) {
        this.numeroInicial = numeroInicial;
        this.numeroFinal = numeroFinal;
    }

    public int[] calcularIntervalo() throws Exception {

        ArrayList<int> colecao;

        if (this.numeroInicial < numeroF) {
            for (int i = this.numeroInicial; i <= this.numeroFinal; i++) {
                if (i % 2 == 0) {
                    colecao.add(i);
                }
            }
        } else if (this.numeroInicial > this.numeroFinal) {
            for (int i = this.numeroInicial; i >= this.numeroFinal; i--) {
                if (i % 2 == 0) {
                    colecao.add(i);
                }
            }
        } else {
            throw new Exception(IMPOSSIVEL_CALCULAR_INTERVALO);
        }

        return colecao.toArray(new int[0]);

    }
}