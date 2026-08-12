public class Pagamento {

    private String TipoIngressso;
    private double precoIngresso;
    private double desconto;
    private int idcode;
    private double cancelamento;
    private String dadosCartao;

    public double getCancelamento() {
        return cancelamento;
    }

    public void setCancelamento(double cancelamento) {
        this.cancelamento = cancelamento;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public int getIdcode() {
        return idcode;
    }

    public void setIdcode(int idcode) {
        this.idcode = idcode;
    }

    public String getDadosCartao() {
        return dadosCartao;
    }

    public void setDadosCartao(String dadosCartao) {
        this.dadosCartao = dadosCartao;
    }

    public String getTipoIngressso() {
        return TipoIngressso;
    }

    public void setTipoIngressso(String tipoIngressso) {
        TipoIngressso = tipoIngressso;
    }

    public Pagamento() {
    }

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
