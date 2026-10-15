package trabalho1;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogos {

    private String nomes;
    private double valores;
    private String generos;
    private double avaliacao;
    private static final ArrayList<Jogos> listJogos = new ArrayList<>();
      public Jogos(String nome, double valor, String genero, double avaliacao) {
        this.nomes = nome;
        this.valores = valor;
        this.generos = genero;
        this.avaliacao = avaliacao;
    }

    public void setnome(String nome) {this.nomes = nome;}

    public String getnome() {return this.nomes;}

    public void setValor(double valor) {this.valores = valor;}

    public double getvalor() {return this.valores;}

    public void setAvaliacao(double avaliacao) {this.avaliacao = avaliacao;}

    public double  getAvaliacao() {return this.avaliacao;}

    public void setgenero(String genero) {  this.generos = genero; }

    public String getGenero() { return this.generos;}

    public static void adicionarJogos(Scanner cadastroJG) {
        System.out.println("Digite o nome do jogo: ");
        String nome = cadastroJG.next();
        System.out.println("Digite o valor do jogo");
        double valor = cadastroJG.nextDouble();
        System.out.println("Digite os generos do jogo sem espaçamentos separandocada genero por virgula: ");
        String genero = cadastroJG.next();

        System.out.println("Digite a nota do jogo");
        double avaliacao = cadastroJG.nextDouble();
       if(avaliacao < 0 || avaliacao > 10){
            System.out.println("Nota invalida. A nota deve estar entre 0 e 10.");
            System.out.println("Digite a nota do jogo novamente: ");
            avaliacao = cadastroJG.nextDouble();
            
        }else{
        Jogos novoJogo = new Jogos(nome, valor, genero, avaliacao);
        listJogos.add(novoJogo);
        
      
        System.out.println("O jogo " + novoJogo.getnome() + " esta registrado com sucesso");
    }
}

    public static void exibirCatalogo() {
        if (listJogos.isEmpty()) {
            System.out.println("Nenhum jogo cadastrado.");
            return;
        }

        for (Jogos jogo : listJogos) {
            jogo.exibirDetalhes();
        }
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------------\n");
        System.out.println("Nome: " + this.nomes);

        System.out.println("Valor R$: " + this.valores);
        System.out.println("Nota: " + this.avaliacao + " de 10");

        System.out.println(this.generos);
        System.out.println("\n-------------------------------------\n");

    }

}
