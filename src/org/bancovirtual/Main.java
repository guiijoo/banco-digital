package org.bancovirtual;

import org.bancovirtual.banco.cliente.Cliente;
import org.bancovirtual.banco.tipoconta.ContaCorrente;
import org.bancovirtual.banco.tipoconta.ContaPoupança;

public class Main {
    public static void main(String[] args) {
        Cliente guilhermeCliente = new Cliente("Guilherme");
        ContaCorrente contaCorrente = new ContaCorrente(guilhermeCliente);
        contaCorrente.Depositar(500.07);
        contaCorrente.ExibirDados();

        Cliente carlosCliente = new Cliente("Carlos");
        ContaPoupança contaPoupança = new ContaPoupança(carlosCliente);
        contaPoupança.Depositar(507.00);
        contaPoupança.ExibirDados();

        contaCorrente.Transferir(contaPoupança, 100.00);
        contaCorrente.ExibirDados();
        contaPoupança.ExibirDados();
    }
    
}
