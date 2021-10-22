package com.example.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntervaloParesUnitTest {

    @Test
    void informarNumeroInicialENumeroFinalIguais() {
        try {
            // arrange
            IntervaloPares intervaloPares = new IntervaloPares(10, 10);

            // act
            int[] intervalo = intervaloPares.calcularIntervalo();

        } catch (Exception e) {
            // assert
            assertEquals(IntervaloPares.IMPOSSIVEL_CALCULAR_INTERVALO, e.getMessage());
        }
    }

    @Test
    void validarIntervaloCrescenteComSucesso() throws Exception {
        // arrange
        IntervaloPares intervaloPares = new IntervaloPares(1, 5);

        // act
        int[] intervalo = intervaloPares.calcularIntervalo();
    
        // assert
        assertEquals(intervalo[0], 2);
        assertEquals(intervalo[1], 4);
    }

    @Test
    void validarIntervaloDerescenteComSucesso() throws Exception {
        // arrange
        IntervaloPares intervaloPares = new IntervaloPares(5, 1);

        // act
        int[] intervalo = intervaloPares.calcularIntervalo();
        
        // assert
        assertEquals(intervalo[0], 4);
        assertEquals(intervalo[1], 2);
    }

}