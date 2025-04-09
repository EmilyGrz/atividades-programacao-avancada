package exercicioBanco;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("João Silva", "1234", "56789-0", 1000, 5);
        ContaPoupanca cp = new ContaPoupanca("Maria Souza", "4321", "98765-0", 2000, 0.5);

        try {
            cc.depositar(500);
            cc.sacar(200);
            System.out.println("Imposto de Renda da Conta Corrente: R$ " + cc.calcularIR());

            cp.depositar(1000);
            cp.aplicarRendimento();
            cp.sacar(500);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}
