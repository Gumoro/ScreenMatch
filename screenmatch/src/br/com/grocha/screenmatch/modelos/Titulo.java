package br.com.grocha.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {

        return nome;
    }

    public int getAnoDeLancamento() {

        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {

        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){

        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Avaliação: " + somaDasAvaliacoes);
        System.out.println("Duração do filme em minutos: " +duracaoEmMinutos);
    }


    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;

    }

    public double pegaMedia(){
        return  somaDasAvaliacoes/totalDeAvaliacoes;
    }
}
