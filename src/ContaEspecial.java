public class ContaEspecial extends Conta{



    public ContaEspecial(Integer numero, Double saldo) {
        super(numero, saldo);
    }

    @Override
    public double realizarDeposito(Double deposito) {
        Movimentacao movimentacao = new Movimentacao(deposito, "Deposito");
        adiconarValoresExtrato(movimentacao);
        System.out.println("Saldo anterior: " + saldo);
        saldo += deposito;
        System.out.println("Depósito: " + deposito);
        System.out.println("Saldo atual: " + saldo);
        return getSaldo() + deposito;
    }

    private final double valorLimite = 500.00;

    @Override
    public void realizarSaque(Double saque) {
        Movimentacao movimentacao = new Movimentacao(saque, "Saque");
        if ((getSaldo() + valorLimite) >= saque){
            saldo += valorLimite;
            saldo -= saque;
            adiconarValoresExtrato(movimentacao);
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.err.println("Saldo e limite insuficiente!");
        }
    }
}
