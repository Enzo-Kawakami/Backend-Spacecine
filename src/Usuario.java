import Enuns.Genero;

import java.time.LocalDate;

public class Usuario {


    public int id;
    public String nome;
    public String cpf;
    public Genero genero;
    public String SocialN;
    public LocalDate dtnasc;
    public String email;
    public String fone;
    public String cep;
    public String senha;

    public Usuario() {
    }

    public Usuario(int id, String nome, String cpf, Genero genero, String socialN, LocalDate dtnasc, String email, String fone, String cep, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        SocialN = socialN;
        this.dtnasc = dtnasc;
        this.email = email;
        this.fone = fone;
        this.cep = cep;
        this.senha = senha;
    }


}
