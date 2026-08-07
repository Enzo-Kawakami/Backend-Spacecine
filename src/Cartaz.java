public class Cartaz {

    public String titulo;
    public int classificacao;
    public int dtestreia;
    public double duracao;
    public String genero;

    public Cartaz(String titulo, int classificacao, int dtestreia, double duracao, String genero) {
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.dtestreia = dtestreia;
        this.duracao = duracao;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cartaz{" +
                "titulo='" + titulo + '\'' +
                ", classificacao=" + classificacao +
                ", dtestreia=" + dtestreia +
                ", duracao=" + duracao +
                ", genero='" + genero + '\'' +
                '}';
    }
}
