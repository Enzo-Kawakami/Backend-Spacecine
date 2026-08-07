public class Sessao {

    public String filme;
    public int numSala;
    public int dia;
    public String tipo;
    public double hora;
    public String local;

    public Sessao(String filme, int numSala, int dia, String tipo, double hora, String local) {
        this.filme = filme;
        this.numSala = numSala;
        this.dia = dia;
        this.tipo = tipo;
        this.hora = hora;
        this.local = local;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "filme='" + filme + '\'' +
                ", numSala=" + numSala +
                ", dia=" + dia +
                ", tipo='" + tipo + '\'' +
                ", hora=" + hora +
                ", local='" + local + '\'' +
                '}';
    }
}
