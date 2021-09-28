package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraUnitTests {

    @Test
    void somaSimples() {
        // arrange
        Calculadora calc = new Calculadora();

        // act
        double resultado = calc.somar(2, 3);

        // assert
        assertEquals(5, resultado, "2 + 3 deve ser igual a 5");
    }

    @Test
    void subtracaoSimples() {
        // arrange
        Calculadora calc = new Calculadora();

        // act
        double resultado = calc.subtrair(3, 2);

        // assert
        assertEquals(1, resultado, "3 - 2 deve ser igual a 1");
    }

    @Test
    void multiplicacaoSimples() {
        // arrange
        Calculadora calc = new Calculadora();

        // act
        double resultado = calc.multiplicar(2, 3);

        // assert
        assertEquals(6, resultado, "2 * 3 deve ser igual a 6");
    }

    @Test
    void divisaoSimples() {
        // arrange
        Calculadora calc = new Calculadora();

        // act
        double resultado = calc.dividir(10, 2);

        // assert
        assertEquals(5, resultado, "10 / 2 deve ser igual a 5");
    }

    @Test
    void divisaoPorZero() {
        // arrange
        Calculadora calc = new Calculadora();

        // act
        try {
            calc.dividir(1, 0);
        } catch (ArithmeticException e) {
            // assert
            assertEquals(Calculadora.DIVIDIR_POR_ZERO, e.getMessage());
        }
    }

}
