package org.bancovirtual.banco.tipoconta.conta;

import org.bancovirtual.banco.cliente.Cliente;

public class Conta implements InterfaceConta { // Define a classe Conta que implementa a interface InterfaceConta.

    private static final int AGENCIA_PADRAO = 1; // Define a agência padrão como 1 (constante).
    private static int SEQUENCIAL = 1; // Define um número sequencial inicial para as contas.

    protected int agencia; // Atributo que armazena a agência da conta.
    protected int numero; // Atributo que armazena o número da conta.
    protected double saldo; // Atributo que armazena o saldo da conta.
    protected Cliente cliente; // Atributo que armazena o objeto Cliente associado à conta.

    public Conta(Cliente cliente) { // Construtor da classe Conta, recebe um objeto Cliente como parâmetro.
        this.agencia = AGENCIA_PADRAO; // Define a agência da conta como a agência padrão.
        this.numero = SEQUENCIAL++; // Define o número da conta com base no sequencial e incrementa o sequencial.
        this.cliente = cliente; // Define o objeto Cliente da conta.
        this.saldo = 0.0; // Inicializa o saldo da conta como 0.
    }

    public void Sacar(Double valor) { // Método para realizar um saque na conta.
        if (saldo > valor) { // Verifica se há saldo suficiente para o saque.
            saldo -= valor; // Se houver, subtrai o valor do saldo.
            System.out.println("Saque realizado com sucesso!"); // Imprime mensagem de sucesso.
        } else {
            throw new UnsupportedOperationException("Unimplemented method 'Sacar'"); // Se não houver saldo, lança uma
                                                                                     // exceção (a mensagem parece
                                                                                     // inadequada aqui).
        }
    }

    public void Depositar(Double valor) { // Método para realizar um depósito na conta.
        saldo += valor; // Adiciona o valor ao saldo.
        System.out.println("Depósito realizado com sucesso!"); // Imprime mensagem de sucesso.
    }

    public void Transferir(InterfaceConta cliente, Double valor) { // Método para transferir dinheiro para outra conta.
        this.Sacar(valor); // Realiza um saque na conta atual.
        cliente.Depositar(valor); // Realiza um depósito na conta destino.
        System.out.println("Transferência realizada com sucesso!"); // Imprime mensagem de sucesso.
    }

    public void ImpimirExtrato() { // Método para imprimir o extrato da conta.
        System.out.println("--------------------------------------------------");
        System.out.println("Extrato da Conta: ");
        System.out.println("Cliente: " + cliente.getNome()); // Imprime o nome do cliente.
        System.out.println("Agência: " + agencia); // Imprime a agência da conta.
        System.out.println("Número: " + numero); // Imprime o número da conta.
        System.out.println("Saldo: " + saldo); // Imprime o saldo da conta.
        System.out.println("--------------------------------------------------");
    }

}
