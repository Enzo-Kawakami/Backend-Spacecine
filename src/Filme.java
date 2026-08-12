import Enuns.GeneroFilme;

import java.time.LocalDate;

public class Filme {

    private int  id;
    private String titulo;
    private GeneroFilme generofilme;
    private double duracao;
    private String idioma;
    private String sinopse;
    private LocalDate dtestreia;

  public String getTitulo(){
      return titulo;
  }

  public void setTitulo(String titulo){
      this.titulo = titulo;
  }

  public double getDuracao(){
      return duracao;
  }
  public void setDuracao(double duracao) {
      if (duracao < 0) {
          IO.println("A duração não pode ser negativa");
      } else {
          this.duracao = duracao;
      }
  }

  public LocalDate getDtestreia(){
      return dtestreia;
  }

  public void setDtestreia(LocalDate dtestreia){
      this.dtestreia = dtestreia;
  }

  public String getSinopse(){
      return sinopse;
  }

  public void setSinopse(String sinopse){
      this.sinopse = sinopse;
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GeneroFilme getGenerofilme() {
        return generofilme;
    }

    public void setGenerofilme(GeneroFilme generofilme) {
        this.generofilme = generofilme;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }


    public Filme() {
    }

    public Filme(int id, String titulo, GeneroFilme generofilme, double duracao, String idioma, String sinopse, LocalDate dtestreia) {
        this.id = id;
        this.titulo = titulo;
        this.generofilme = generofilme;
        this.duracao = duracao;
        this.idioma = idioma;
        this.sinopse = sinopse;
        this.dtestreia = dtestreia;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", generofilme=" + generofilme +
                ", duracao=" + duracao +
                ", idioma='" + idioma + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", dtestreia=" + dtestreia +
                '}';
    }
}
