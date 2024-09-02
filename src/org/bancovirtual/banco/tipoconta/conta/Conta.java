package org.bancovirtual.banco.tipoconta.conta;

import org.bancovirtual.banco.cliente.Cliente;

public class Conta implements InterfaceConta {

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void Sacar(Double valor) {
        if (saldo > valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }else{
            throw new UnsupportedOperationException("Unimplemented method 'Sacar'");
        }
    }

    public void Depositar(Double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void Transferir(InterfaceConta cliente, Double valor) {
            this.Sacar(valor);
            cliente.Depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
    }

    public void ImpimirExtrato() {
        System.out.println("--------------------------------------------------");
        System.out.println("Extrato da Conta: ");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("--------------------------------------------------");
    }
    
}
