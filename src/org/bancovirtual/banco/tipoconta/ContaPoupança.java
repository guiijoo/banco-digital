package org.bancovirtual.banco.tipoconta;

import org.bancovirtual.banco.cliente.Cliente;
import org.bancovirtual.banco.tipoconta.conta.Conta;

public class ContaPoupança extends Conta { // Declara a classe ContaPoupança que herda da classe Conta.

    public ContaPoupança(Cliente cliente) { // Construtor da classe ContaPoupança, recebe um objeto Cliente como parâmetro.
        super(cliente); // Chama o construtor da classe pai (Conta) passando o objeto Cliente como argumento.
    }

    public void ExibirDados() { // Método para exibir os dados da conta poupança.
        System.out.println("=== Conta Poupança ==="); // Imprime uma linha indicando que se trata de uma conta poupança.
        ImpimirExtrato(); // Chama o método ImprimirExtrato() (provavelmente herdado da classe Conta) para exibir o extrato da conta.
    }
}
