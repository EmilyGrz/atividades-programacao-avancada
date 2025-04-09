package exercicioBanco;

class ContaPoupanca extends ContaBancaria {
    private static double rendimentoMensal;

    public ContaPoupanca(String titular, String agencia, String conta, double saldoInicial, double rendimentoMensal) {
        super(titular, agencia, conta, saldoInicial);
        ContaPoupanca.rendimentoMensal = rendimentoMensal;
    }

    @Override
public void sacar(double valor) throws SaldoInsuficienteException {
    if (saldo >= valor) {
        saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
    } else {
        throw new SaldoInsuficienteException("Saldo insuficiente para saque de R$ " + valor);
    }
}


    public void aplicarRendimento() {
        double rendimento = saldo * (rendimentoMensal / 100);
        saldo += rendimento;
        System.out.println("Rendimento de R$ " + rendimento + " aplicado. Novo saldo: R$ " + saldo);
    }
}
