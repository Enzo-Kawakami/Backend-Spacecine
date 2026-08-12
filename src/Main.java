void main() {

    Filme filme =  new Filme();
    filme.setTitulo("Carros 2");
    IO.println(filme.getTitulo());

    filme.setSinopse("Dois carros fodões e espiões");
    IO.println(filme.getSinopse());

    filme.setDuracao(1);
    IO.println(filme.getDuracao() + "hrs");

    filme.setDtestreia(LocalDate.of(2026,4,9));
    IO.println(filme.getDtestreia());



}