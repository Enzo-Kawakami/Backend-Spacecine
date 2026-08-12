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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getDtnasc() {
        return dtnasc;
    }

    public void setDtnasc(LocalDate dtnasc) {
        this.dtnasc = dtnasc;
    }

    public String getCep() {
        return cep;
    }

    public void setCpf(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCep(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSocialN() {
        return SocialN;
    }

    public void setSocialN(String socialN) {
        SocialN = socialN;
    }

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

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", genero=" + genero +
                ", SocialN='" + SocialN + '\'' +
                ", dtnasc=" + dtnasc +
                ", email='" + email + '\'' +
                ", fone='" + fone + '\'' +
                ", cep='" + cep + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
