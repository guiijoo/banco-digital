package org.bancovirtual.banco.tipoconta.conta;

import org.bancovirtual.banco.cliente.Cliente;

public class Conta implements InterfaceConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int agencia, int numero, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
    }


    @Override
    public void Sacar(Double valor) {
        if (saldo > valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        throw new UnsupportedOperationException("Unimplemented method 'Sacar'");
    }

    @Override
    public void Depositar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Depositar'");
    }

    @Override
    public void Transferir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Transferir'");
    }

    @Override
    public void ImpimirExtrato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ImpimirExtrato'");
    }
    
}
