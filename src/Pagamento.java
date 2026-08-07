public class Pagamento {

    public String TipoIngressso;
    public double precoIngresso;
    public double desconto;
    public int idcode;
    public double cancelamento;
    public String dadosCartao;


    public Pagamento(String tipoIngressso, double precoIngresso, double desconto, int idcode, double cancelamento, String dadosCartao) {
        TipoIngressso = tipoIngressso;
        this.precoIngresso = precoIngresso;
        this.desconto = desconto;
        this.idcode = idcode;
        this.cancelamento = cancelamento;
        this.dadosCartao = dadosCartao;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "TipoIngressso='" + TipoIngressso + '\'' +
                ", precoIngresso=" + precoIngresso +
                ", desconto=" + desconto +
                ", idcode=" + idcode +
                ", cancelamento=" + cancelamento +
                ", dadosCartao='" + dadosCartao + '\'' +
                '}';
    }
}
