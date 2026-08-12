import java.sql.Blob;
import java.time.LocalDate;

public class Avaliacao {

   private int id;
    private String usuario;
    private double nota;
    private Blob avaliacao;
    private LocalDate dt;

    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public  Blob getAvaliacao(){
        return avaliacao;
    }

    public void setAvaliacao(Blob avaliacao){
        this.avaliacao = avaliacao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDt() {
        return dt;
    }

    public void setDt(LocalDate dt) {
        this.dt = dt;
    }



    public Avaliacao() {
    }

    public Avaliacao(String usuario, double nota, Blob avaliacao, LocalDate dt) {
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
