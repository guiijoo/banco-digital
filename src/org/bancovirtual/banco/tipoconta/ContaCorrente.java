package org.bancovirtual.banco.tipoconta;

import org.bancovirtual.banco.cliente.Cliente;
import org.bancovirtual.banco.tipoconta.conta.Conta;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) 
    {
        super(cliente);
    }
    
    public void ExibirDados()
    {
        System.out.println("=== Conta Corrente ===");
        ImpimirExtrato();
    }
}
