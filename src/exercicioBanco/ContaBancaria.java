package exercicioBanco;

abstract class ContaBancaria {
    protected double saldo;
    protected String titular;
    protected String agencia;
    protected String conta;

    public ContaBancaria(String titular, String agencia, String conta, double saldoInicial) {
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
    }

    public abstract void sacar(double valor) throws SaldoInsuficienteException;

    public void exibirSaldo() {
        System.out.println("Saldo atual de " + titular + " (Agência: " + agencia + ", Conta: " + conta + "): R$ " + saldo);
    }
}

