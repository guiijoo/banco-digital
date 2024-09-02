package org.bancovirtual.banco.tipoconta;

import org.bancovirtual.banco.cliente.Cliente;
import org.bancovirtual.banco.tipoconta.conta.Conta;

public class ContaPoupança extends Conta{
    
    public ContaPoupança(Cliente cliente)
    {
        super(cliente);
    }

    public void ExibirDados()
    {
        System.out.println("=== Conta Poupança ===");
        ImpimirExtrato();
    }
}
