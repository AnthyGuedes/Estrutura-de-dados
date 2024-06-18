package pkg;

public class Main {
    public static void main(String[] args) {
        try {
            Conta minhaConta = new ContaCorrente(1000, 500);

            System.out.println("Saldo inicial: R$" + minhaConta.getSaldo());

            minhaConta.depositar(200);
            System.out.println("Saldo após depósito: R$" + minhaConta.getSaldo());

            minhaConta.sacar(300);
            System.out.println("Saldo após saque: R$" + minhaConta.getSaldo());

            
            minhaConta.sacar(1500); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}