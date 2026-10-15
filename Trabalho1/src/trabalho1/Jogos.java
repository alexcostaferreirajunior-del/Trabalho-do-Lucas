package trabalho1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Jogos {

    private String nomes;
    private double valores;
    private String generos;
    private String avaliacao;
    private static ArrayList<Jogos> listJogos = new ArrayList<>();

    public Jogos(String nome, double valor, String genero, String avaliacao) {
        this.nomes = nome;
        this.valores = valor;
        this.generos = genero;
        this.avaliacao = avaliacao;
    }

    public void setnome(String nome) {
        this.nomes = nome;

    }

    public String getnome() {
        return this.nomes;

    }

    public void setValor(double valor) {
        this.valores = valor;

    }

    public double getvalor() {
        return this.valores;

    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;

    }

    public String getAvaliacao() {
        return this.avaliacao;

    }

    public void setgenero(String genero) {
        this.generos = genero;

    }

    public String getGenero() {
        return this.generos;

    }

    public void adicionarJogos(Scanner cadastroJG, Jogos novoJogo) {
        listJogos.add(novoJogo);

        System.out.println("Digite o nome do jogo: ");
        this.nomes = cadastroJG.next();
        System.out.println("Digite o valor do jogo");
        this.valores = cadastroJG.nextDouble();
        System.out.println("Digite os generos do jogo: ");
        this.generos = cadastroJG.next();
        System.out.println("Digite a nota do jogo");
        this.avaliacao = cadastroJG.next();
        System.out.println("O jogo" + novoJogo.getnome() + "ESTA RESGISTRADO COM SUCESSO");

    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------------\n");
        System.out.println("Nome: " + this.nomes);

        System.out.println("Valor R$: " + this.valores);
        System.out.println("Nota: " + this.avaliacao + "de 10");

        System.out.println(this.generos);
        System.out.println("\n-------------------------------------\n");

    }

}
