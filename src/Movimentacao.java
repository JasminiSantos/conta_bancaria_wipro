public class Movimentacao {
    private Double valor;
    private String tipo;

    public Movimentacao(Double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "           VALOR = R$" + valor + " ******* TIPO = " + tipo;
    }
}
