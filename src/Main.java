public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Lucas");

        Conta conta_corrente = new ContaCorrente(cliente1);
        Conta conta_poupanca = new ContaPoupanca(cliente1);

        conta_corrente.depositar(1000);
        conta_poupanca.depositar(100);

        conta_corrente.imprimirExtrato();
        conta_poupanca.imprimirExtrato();

    }
}