package pkg;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void sacar(double valor) throws IllegalArgumentException, SaldoInsuficienteException {
        System.out.println("|Valor de Saque|");
        if (valor <= 0) {
            throw new IllegalArgumentException("|valor do saque deve ser positivo|");
        }
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("saque de |R$" + valor + "| realizado. Saldo atual: R$" + saldo);
        } else {
            throw new SaldoInsuficienteException("|Saldo insuficiente para saque|");
        }
    }

    @Override
    public void depositar(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("|O valor do deposito deve ser positivo|");
        }
        saldo += valor;
        System.out.println("Depósito de |R$" + valor + "| realizado. Saldo atual: R$" + saldo);
    }
}