package com.example.project;

public class Calculadora {

    public static final String DIVIDIR_POR_ZERO = "Não é possível dividir por zero";

    public double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double dividir(double valor1, double valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException(DIVIDIR_POR_ZERO);
        }
        return valor1 / valor2;
    }

}
