public class ContaEspecial extends Conta{
    public ContaEspecial(Integer numero, Double saldo) {
        super(numero, saldo);
    }

    @Override
    public double realizarDeposito(Double deposito) {
        return 0;
    }

    private final double valorLimite = 500.00;

    @Override
    public boolean realizarSaque(Double saque) {
        if (getSaldo() + valorLimite <= saque){
            return true;
        }
            System.err.println("Saldo e limite insuficientes!");
            return false;
    }
}
