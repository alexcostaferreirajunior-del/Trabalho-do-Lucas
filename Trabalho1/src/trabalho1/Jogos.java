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


    public static void adicionarJogos(Scanner cadastroJG) {
        String nome;
        do {
            System.out.println("Digite o nome do jogo: ");
            nome = cadastroJG.nextLine().trim();
            if (nome.isEmpty()) {
                System.out.println("Nome invalido. Digite um nome valido.");
            } else if (jogoJaCadastrado(nome)) {
                System.out.println("Este jogo ja foi cadastrado.");
            }
        } while (nome.isEmpty() || jogoJaCadastrado(nome));

        double valor;
        do {
            valor = lerDouble(cadastroJG, "Digite o valor do jogo: ");
            if (valor <= 0) {
                System.out.println("Valor invalido. O valor deve ser maior que zero.");
            }
        } while (valor <= 0);

        String genero;
        do {
            System.out.println("Digite os generos do jogo separando cada genero por virgula: ");
            genero = cadastroJG.nextLine();
            if (genero == null || genero.trim().isEmpty()) {
                System.out.println("Genero invalido. Informe pelo menos um genero.");
            }
        } while (genero == null || genero.trim().isEmpty());

        double avaliacao;
        do {
            avaliacao = lerDouble(cadastroJG, "Digite a nota do jogo: ");
            if (avaliacao < 0 || avaliacao > 10) {
                System.out.println("Nota invalida. A nota deve estar entre 0 e 10.");
            }
        } while (avaliacao < 0 || avaliacao > 10);

        Jogos novoJogo = new Jogos(nome.trim(), valor, genero.trim(), avaliacao);
        listJogos.add(novoJogo);

        System.out.println("O jogo " + novoJogo.getnome() + " esta registrado com sucesso");
    }

    private static double lerDouble(Scanner scanner, String mensagem) {
        while (true) {
            System.out.println(mensagem);
            try {
                double valor = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));
                if (Double.isFinite(valor)) {
                    return valor;
                }
            } catch (NumberFormatException e) {
            }
            System.out.println("Entrada invalida. Digite um numero valido.");
        }
    }

    private static boolean jogoJaCadastrado(String nome) {
        for (Jogos jogo : listJogos) {
            if (jogo.getnome().equalsIgnoreCase(nome.trim())) {
                return true;
            }
        }
        return false;
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
