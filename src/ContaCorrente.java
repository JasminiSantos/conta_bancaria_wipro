public class ContaCorrente extends Conta {

    public ContaCorrente(Integer numero, Double saldo) {
        super(numero, saldo);
    }


    @Override
    public double realizarSaque(Double saque) {
        if (getSaldo() - saque >= 0){
            return super.realizarSaque(saque);
        }else {
            System.err.println("Saldo Indisponível!");
        }
        return 0;
    }
}
