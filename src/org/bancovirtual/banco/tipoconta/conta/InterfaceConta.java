package org.bancovirtual.banco.tipoconta.conta;

public interface InterfaceConta {
    void Sacar(Double valor);
    void Depositar();
    void Transferir();
    void ImpimirExtrato();
}
