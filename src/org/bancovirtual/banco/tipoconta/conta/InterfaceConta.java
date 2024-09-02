package org.bancovirtual.banco.tipoconta.conta;

public interface InterfaceConta {
    void Sacar(Double valor);
    void Depositar(Double valor);
    void Transferir(InterfaceConta cliente, Double valor);
    void ImpimirExtrato();
}
