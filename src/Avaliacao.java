public class Avaliacao {

    public String usuario;
    public double nota;
    public String avaliacao;
    public int dt;

    public Avaliacao(String usuario, double nota, String avaliacao, int dt) {
        this.usuario = usuario;
        this.nota = nota;
        this.avaliacao = avaliacao;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "usuario='" + usuario + '\'' +
                ", nota=" + nota +
                ", avaliacao='" + avaliacao + '\'' +
                ", dt=" + dt +
                '}';
    }
}
