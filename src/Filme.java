import Enuns.GeneroFilme;

import java.time.LocalDate;

public class Filme {

    public int  id;
    public String titulo;
    public GeneroFilme generofilme;
    public double duracao;
    public String idioma;
    public String sinopse;
    public LocalDate dtestreia;

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
