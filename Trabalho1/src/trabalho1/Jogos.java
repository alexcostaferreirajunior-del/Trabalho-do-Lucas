package trabalho1;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogos {

    private String nomes;
    private double valores;
    private String generos;
    private double avaliacao;
    
// Lista estática para armazenar os jogos cadastrados
    private static final ArrayList<Jogos> listJogos = new ArrayList<>();
    // Construtor da classe Jogos
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


    // Método para adicionar jogos ao catálogo 
    public static void adicionarJogos(Scanner cadastroJG) {
        System.out.println("Digite o nome do jogo: ");
        String nome = cadastroJG.next();
        System.out.println("Digite o valor do jogo");
        double valor = cadastroJG.nextDouble();
        System.out.println("Digite os generos do jogo sem espaçamentos separandocada genero por virgula: ");
        String genero = cadastroJG.next();
        System.out.println("Digite a nota do jogo");
        double avaliacao = cadastroJG.nextDouble();
     
     // Não deixa o usuário cadastar um nota invalida, ou seja, uma nota que não esteja entre 0 e 10.
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
// Método para exibir o catálogo de jogos cadastrados alem de informar ao usuário caso não haja nenhum jogo cadastrado
    public static void exibirCatalogo() {
        if (listJogos.isEmpty()) {
            System.out.println("Nenhum jogo cadastrado.");
            return;
        }

        for (Jogos jogo : listJogos) {
            jogo.exibirDetalhes();
        }
    }

    public static ArrayList<Jogos> getCatalogo() {
        return listJogos;
    }

// imprime os detalhes do jogo, incluindo nome, valor, nota e gênero
    public void exibirDetalhes() {
        System.out.println("\n------------------------------\n");
        System.out.println("Nome: " + this.nomes);

        System.out.println("Valor R$: " + this.valores);
        System.out.println("Nota: " + this.avaliacao + " de 10");

        System.out.println(this.generos);
        System.out.println("\n-------------------------------------\n");

    }

}
