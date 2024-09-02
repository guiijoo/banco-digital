package org.bancovirtual.banco.tipoconta.conta;

public interface InterfaceConta { // Define uma interface chamada InterfaceConta. Uma interface define um
    // conjunto de métodos que uma classe deve implementar.

    void Sacar(Double valor); // Declaração do método Sacar, que recebe um valor Double como parâmetro e não
    // retorna nada (void).

    void Depositar(Double valor); // Declaração do método Depositar, que recebe um valor Double como parâmetro e
    // não retorna nada (void).

    void Transferir(InterfaceConta cliente, Double valor); // Declaração do método Transferir, que recebe um objeto
    // InterfaceConta (representando a conta de destino) e um
    // valor Double como parâmetros, e não retorna nada (void).

    void ImpimirExtrato(); // Declaração do método ImprimirExtrato, que não recebe parâmetros e não retorna
                           // nada
    // (void).
}
