package org.bancovirtual.banco;

import java.util.List;

import org.bancovirtual.banco.tipoconta.conta.Conta;

public class Banco {

    private String nome; // Atributo que armazena o nome do banco.
    private List<Conta> contas; // Atributo que armazena uma lista de contas associadas ao banco.

    // Método para obter o nome do banco.
    public String getNome() {
        return nome; // Retorna o valor do atributo "nome".
    }

    // Método para definir o nome do banco.
    public void setNome(String nome) {
        this.nome = nome; // Define o valor do atributo "nome" com o valor recebido como parâmetro.
    }

    // Método para obter a lista de contas do banco.
    public List<Conta> getContas() {
        return contas; // Retorna a lista de contas armazenada no atributo "contas".
    }

    // Método para definir a lista de contas do banco.
    public void setContas(List<Conta> contas) {
        this.contas = contas; // Define a lista de contas do banco com a lista recebida como parâmetro.
    }
}
