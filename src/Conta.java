import java.util.ArrayList;


public abstract class Conta {
    private Integer numero;
    private Double saldo;
    private boolean contaAtivada = true;
    ArrayList <Double> extrato = new ArrayList<Double>();

    public Conta(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void obterDadosConta(){
        if (numero == null && saldo == null){
            System.out.println("Essa conta foi excluída!");
        }else {

        }
    }

    public void extratoCompleto(){
        double valores;
        System.out.println("============================================================");
        System.out.println("=======================EXTRATO==============================");
        System.out.println("============================================================");
        System.out.println("Número da conta: " + numero + "\nSeu saldo é de: " + saldo);
        System.out.println("============================================================");
        System.out.println("============================================================");
        for (int i = 0; i <= extrato.size(); i++){
            extrato.addAll(realizarDeposito());
        }
    }



    public abstract double realizarDeposito(Double deposito);

    public abstract boolean realizarSaque(Double saque);

    public Conta removerConta(Conta conta){
        conta.numero = null;
        conta.saldo = null;
        System.err.println("Conta excluída");
        return conta;
    }
}
