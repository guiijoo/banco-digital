package org.bancovirtual.banco.tipoconta;

import org.bancovirtual.banco.cliente.Cliente;
import org.bancovirtual.banco.tipoconta.conta.Conta;

public class ContaCorrente extends Conta { // Declara a classe ContaCorrente que herda da classe Conta.

    public ContaCorrente(Cliente cliente) { // Construtor da classe ContaCorrente, recebe um objeto Cliente como
                                            // parâmetro.
        super(cliente); // Chama o construtor da classe pai (Conta) passando o objeto Cliente como
                        // argumento.
    }

    public void ExibirDados() { // Método para exibir os dados da conta corrente.
        System.out.println("=== Conta Corrente ==="); // Imprime uma linha indicando que se trata de uma conta
                                                        // corrente.
        ImpimirExtrato(); // Chama o método ImprimirExtrato() (provavelmente herdado da classe Conta) para
                          // exibir o extrato da conta.
    }
}
