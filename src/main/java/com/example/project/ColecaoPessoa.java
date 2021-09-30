package com.example.project;

import com.example.project.models.Pessoa;

import java.util.ArrayList;

public class ColecaoPessoa {

    public static final String INDICE_FORA_DOS_LIMITES = "A coleção antingiu o tamanho máximo de pessoas.";
    public static final String OPERACAO_NAO_SUPORTADA = "A coleção não antingiu o tamanho máximo de pessoas ";
    private final int tamanho;
    private final ArrayList<Pessoa> colecao;


    public ColecaoPessoa(int tamanho) {
        this.tamanho = tamanho;
        this.colecao = new ArrayList<>();
    }

    public void AdicionarPessoa(String nome, int idade) {
        if (colecao.size() == tamanho) {
            throw new IndexOutOfBoundsException("A coleção antingiu o tamanho máximo de pessoas.");
        }

        this.colecao.add(new Pessoa(nome, idade));
    }

    public Pessoa[] getColecao() {
        if (this.colecao.size() < tamanho) {
            throw new UnsupportedOperationException(OPERACAO_NAO_SUPORTADA);
        }

        return this.colecao.toArray(new Pessoa[0]);
    }

}
