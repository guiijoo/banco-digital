package org.bancovirtual.banco.cliente;

public class Cliente {

    private String nome; // Atributo que armazena o nome do cliente.

    // Construtor da classe Cliente, recebe o nome do cliente como parâmetro.
    public Cliente(String nome) {
        this.nome = nome; // Atribui o valor do parâmetro "nome" ao atributo "nome" da classe.
    }

    // Método para obter o nome do cliente.
    public String getNome() {
        return nome; // Retorna o valor do atributo "nome".
    }
}
