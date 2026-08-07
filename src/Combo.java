public class Combo {
    public String itens;
    public String tamanho;
    public double preco;
    public String brinde;

    public Combo(String itens, String tamanho, double preco, String brinde) {
        this.itens = itens;
        this.tamanho = tamanho;
        this.preco = preco;
        this.brinde = brinde;
    }

    @Override
    public String toString() {
        return "Combo{" +
                "itens='" + itens + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", preco=" + preco +
                ", brinde='" + brinde + '\'' +
                '}';
    }
}
