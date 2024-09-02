package org.bancovirtual;

import org.bancovirtual.banco.cliente.Cliente;
import org.bancovirtual.banco.tipoconta.ContaCorrente;
import org.bancovirtual.banco.tipoconta.ContaPoupança;

public class Main {
    public static void main(String[] args) {
        // Instancia um novo objeto Cliente chamado "guilhermeCliente" com o nome
        // "Guilherme".
        Cliente guilhermeCliente = new Cliente("Guilherme");

        // Instancia um novo objeto ContaCorrente associado ao cliente
        // "guilhermeCliente".
        ContaCorrente contaCorrente = new ContaCorrente(guilhermeCliente);

        // Realiza um depósito de R$ 500.07 na conta corrente de "guilhermeCliente".
        contaCorrente.Depositar(500.07);

        // Exibe os dados da conta corrente de "guilhermeCliente" (saldo, nome, etc.).
        contaCorrente.ExibirDados();

        // Instancia um novo objeto Cliente chamado "carlosCliente" com o nome "Carlos".
        Cliente carlosCliente = new Cliente("Carlos");

        // Instancia um novo objeto ContaPoupança associado ao cliente "carlosCliente".
        ContaPoupança contaPoupança = new ContaPoupança(carlosCliente);

        // Realiza um depósito de R$ 507.00 na conta poupança de "carlosCliente".
        contaPoupança.Depositar(507.00);

        // Exibe os dados da conta poupança de "carlosCliente" (saldo, nome, etc.).
        contaPoupança.ExibirDados();

        // Realiza uma transferência de R$ 100.00 da conta corrente de
        // "guilhermeCliente" para a conta poupança de "carlosCliente".
        contaCorrente.Transferir(contaPoupança, 100.00);

        // Exibe os dados atualizados da conta corrente de "guilhermeCliente" após a
        // transferência.
        contaCorrente.ExibirDados();

        // Exibe os dados atualizados da conta poupança de "carlosCliente" após a
        // transferência.
        contaPoupança.ExibirDados();
    }
}