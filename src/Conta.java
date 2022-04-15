import java.util.ArrayList;
import java.util.Random;

public abstract class Conta {
    private Integer numero;
    protected Double saldo;
    private boolean contaAtivada = true;
    private String cartaoDeCredito;

    ArrayList <Movimentacao> extrato = new ArrayList<Movimentacao>();
    Random random = new Random();

    public String gerarNumero(){
        String prefixo = "2584769984";

        int finalCartao = random.nextInt(9999 - 1000) + 1000;

        String sufixo = String.valueOf(finalCartao);

        return cartaoDeCredito = prefixo.concat(sufixo);
    }

    public Conta(Integer numero, Double saldo) {
        cartaoDeCredito = gerarNumero();
        this.numero = numero;
        this.saldo = saldo;
        this.cartaoDeCredito = cartaoDeCredito;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public boolean obterDadosConta(){
        if (numero == null && saldo == null){
            return false;
        } else{
            return true;
        }
    }

    public void extratoCompleto(){
        if (obterDadosConta() == true) {
            System.out.println("============================================================");
            System.out.println("=======================EXTRATO==============================");
            System.out.println("============================================================");
            System.out.println("Número da conta: " + numero + "\nSeu saldo é de: " + saldo +
                    " \nNúmero do cartão: " + cartaoDeCredito);
            System.out.println("============================================================");
            System.out.println("=======================MOVIMENTAÇÕES========================");
            for (Movimentacao movimentacao : extrato) {
                System.out.println(movimentacao.toString());
            }
            System.out.println("============================================================");
            System.out.println("============================================================");
        } else {
            System.out.println("Operação não permitida!\nRealize a ativação da sua conta!");
        }
    }

    public void adiconarValoresExtrato(Movimentacao movimentacao){
        extrato.add(movimentacao);
    }

    public abstract double realizarDeposito(Double deposito);

    public abstract void realizarSaque(Double saque);

    public Conta removerConta(Conta conta){
        conta.numero = null;
        conta.saldo = null;
        System.err.println("Conta excluída");
        return conta;
    }
}
