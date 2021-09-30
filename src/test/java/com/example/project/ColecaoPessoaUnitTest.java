package com.example.project;

import com.example.project.models.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColecaoPessoaUnitTest {

    @Test
    void colecaoPessoaDevePermitirAdicionarApenas5Pessoas() {
        try {
            // arrange
            ColecaoPessoa colecaoPessoa = new ColecaoPessoa(5);

            // act
            colecaoPessoa.AdicionarPessoa("Luke Skywalker", 19);
            colecaoPessoa.AdicionarPessoa("Leia Organa", 19);
            colecaoPessoa.AdicionarPessoa("Han Solo", 32);
            colecaoPessoa.AdicionarPessoa("Obi-Wan Kenobi", 57);
            colecaoPessoa.AdicionarPessoa("Anakin Skywalker", 41);
            colecaoPessoa.AdicionarPessoa("Yoda", 896);

        } catch (IndexOutOfBoundsException e) {
            // assert
            assertEquals(ColecaoPessoa.INDICE_FORA_DOS_LIMITES, e.getMessage());
        }
    }

    @Test
    void colecaoPessoaNaoDevePermitirAdicionarMenosDoQue5Pessoas() {
        try {
            // arrange
            ColecaoPessoa colecaoPessoa = new ColecaoPessoa(5);

            // act
            colecaoPessoa.AdicionarPessoa("Luke Skywalker", 19);
            colecaoPessoa.AdicionarPessoa("Leia Organa", 19);
            colecaoPessoa.AdicionarPessoa("Han Solo", 32);
            colecaoPessoa.AdicionarPessoa("Obi-Wan Kenobi", 57);

            Pessoa[] colecaoImutavel = colecaoPessoa.getColecao();

        } catch (UnsupportedOperationException e) {
            // assert
            assertEquals(ColecaoPessoa.OPERACAO_NAO_SUPORTADA, e.getMessage());
        }
    }

    @Test
    void colecaoPessoaDevePermitirQueAsPessoasAdicionadasSejamObtidasCorretamente() {

        // arrange
        ColecaoPessoa colecaoPessoa = new ColecaoPessoa(5);

        // act
        colecaoPessoa.AdicionarPessoa("Luke Skywalker", 19);
        colecaoPessoa.AdicionarPessoa("Leia Organa", 19);
        colecaoPessoa.AdicionarPessoa("Han Solo", 32);
        colecaoPessoa.AdicionarPessoa("Obi-Wan Kenobi", 57);
        colecaoPessoa.AdicionarPessoa("Anakin Skywalker", 41);

        Pessoa[] colecaoImutavel = colecaoPessoa.getColecao();

        // assert
        assertEquals(colecaoImutavel[0].getNome(), "Luke Skywalker");
        assertEquals(colecaoImutavel[1].getNome(), "Leia Organa");
        assertEquals(colecaoImutavel[2].getNome(), "Han Solo");
        assertEquals(colecaoImutavel[3].getNome(), "Obi-Wan Kenobi");
        assertEquals(colecaoImutavel[4].getNome(), "Anakin Skywalker");

        assertEquals(colecaoImutavel[0].getIdade(), 19);
        assertEquals(colecaoImutavel[1].getIdade(), 19);
        assertEquals(colecaoImutavel[2].getIdade(), 32);
        assertEquals(colecaoImutavel[3].getIdade(), 57);
        assertEquals(colecaoImutavel[4].getIdade(), 41);

    }

}
