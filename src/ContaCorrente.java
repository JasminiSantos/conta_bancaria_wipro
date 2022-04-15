public class ContaCorrente extends Conta {

    public ContaCorrente(Integer numero, Double saldo) {
        super(numero, saldo);
    }

    @Override
    public double realizarDeposito(Double deposito) {
        Movimentacao movimentacao = new Movimentacao(deposito, "Deposito");
        if (deposito > 0) {
            adiconarValoresExtrato(movimentacao);
            System.out.println("Saldo anterior: " + saldo);
            saldo += deposito;
            System.out.println("Depósito: " + deposito);
            System.out.println("Saldo atual: " + saldo);
            return saldo;
        }else {
            System.err.println("Digite um valor válido(Positivo).");
        }
        return saldo;
    }

    @Override
    public void realizarSaque(Double saque) {
        Movimentacao movimentacao = new Movimentacao(saque, "Saque");
        if (saque > 0){
            if (getSaldo() - saque >= 0){
                saldo -= saque;
                adiconarValoresExtrato(movimentacao);
                System.out.println("Saldo atual: " + saldo);
            } else {
                System.err.println("Saldo insuficiente!");
            }
        } else{
            System.err.println("Digite um valor válido(Positivo).");
        }
    }
}

