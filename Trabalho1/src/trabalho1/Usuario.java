package trabalho1;

import java.util.Scanner;

public class Usuario {
    private String nome;
    private double saldo;
    private String email;
    private String senha;
    private String bibliotecaJogos;

    public Usuario(String nome, double saldo , String email, String senha, String bibliotecaJogos) {
        this.nome = nome;
        this.saldo = saldo;
        this.email = email;
        this.senha = senha;
        this.bibliotecaJogos = bibliotecaJogos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void adicionarJogo(String jogo) {
        if (jogo == null || jogo.trim().isEmpty() || possuiJogo(jogo)) {
            return;
        }

        String nomeJogo = jogo.trim();
        if (bibliotecaJogos == null || bibliotecaJogos.isEmpty()) {
            bibliotecaJogos = nomeJogo;
        } else {
            bibliotecaJogos += ", " + nomeJogo;
        }
    }

    public boolean possuiJogo(String jogo) {
        if (jogo == null || jogo.trim().isEmpty() || bibliotecaJogos == null || bibliotecaJogos.isEmpty()) {
            return false;
        }

        for (String jogoNaBiblioteca : bibliotecaJogos.split(",\\s*")) {
            if (jogoNaBiblioteca.equalsIgnoreCase(jogo.trim())) {
                return true;
            }
        }
        return false;
    }

    public String getBibliotecaJogos() {
        return bibliotecaJogos == null ? "" : bibliotecaJogos;
    }

    public static void cadastrarUsuario(Scanner scanner, Usuario usuario) {
        System.out.println("=========================================");
        System.out.println("        STEAM / GAME STORE - REGISTO     ");
        System.out.println("=========================================");
        System.out.println("Registe-se para criar a sua conta e entrar no site!\n");

        System.out.print("Nome de Utilizador: ");
        usuario.setNome(scanner.nextLine());

        System.out.print("E-mail: ");
        usuario.setEmail(scanner.nextLine());

        System.out.print("Palavra-passe (Senha): ");
        usuario.setSenha(scanner.nextLine());

        System.out.print("Insira o primeiro jogo para a sua biblioteca: ");
        usuario.adicionarJogo(scanner.nextLine());

        System.out.println("\n[SUCESSO] Conta criada com sucesso para " + usuario.getEmail() + "!");
        System.out.println("Bem-vindo(a) à Game Store, " + usuario.getNome() + "!\n");
    }

    public static void exibirBibliotecaUsuario(Usuario usuario) {
        System.out.println("\n===== MINHA BIBLIOTECA DE JOGOS =====");
        System.out.println("Utilizador: " + usuario.getNome() + " (" + usuario.getEmail() + ")");

        if (usuario.getBibliotecaJogos().isEmpty()) {
            System.out.println("Você ainda não possui jogos na sua conta.");
        } else {
            System.out.println("Jogos na sua biblioteca:");
            for (String jogo : usuario.getBibliotecaJogos().split(",\\s*")) {
                System.out.println(" - " + jogo);
            }
        }
        System.out.println("=======================================");
    }
}
