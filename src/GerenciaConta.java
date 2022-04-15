import java.util.Arrays;

public class GerenciaConta{
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(254, 800.00);
        ContaEspecial contaEspecial = new ContaEspecial(654, 1000.00);


        contaCorrente.realizarDeposito(158.00);
        contaCorrente.realizarSaque(1000.00);
        contaCorrente.extratoCompleto();
//        contaCorrente.removerConta(contaCorrente);
//        contaCorrente.obterDadosConta();
//        contaCorrente.extratoCompleto();
//
//        contaEspecial.realizarDeposito(200.00);
//        contaEspecial.realizarSaque(1400.00);
//        contaEspecial.removerConta(contaEspecial);
//        contaEspecial.obterDadosConta();
//        contaEspecial.extratoCompleto();
    }
}
