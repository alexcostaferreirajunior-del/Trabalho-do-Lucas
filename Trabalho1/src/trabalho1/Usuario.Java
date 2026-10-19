package app;

import java.util.Scanner;

public class App {

    public static void cadastrarUsuario(Scanner scanner, Usuario usuario) {
        System.out.println("=========================================");
        System.out.println("        STEAM / GAME STORE - REGISTO     ");
        System.out.println("=========================================");
        System.out.println("Registe-se para criar a sua conta e entrar no site!\n");

        System.out.print("Nome de Utilizador: ");
        String nome = scanner.nextLine();
        usuario.setNome(nome);

        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        usuario.setEmail(email);

        System.out.print("Palavra-passe (Senha): ");
        String senha = scanner.nextLine();
        usuario.setSenha(senha);

        System.out.print("Insira o primeiro jogo para a sua biblioteca: ");
        String jogo = scanner.nextLine();
        usuario.adicionarJogo(jogo);

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
            for (String jogo : usuario.getBibliotecaJogos()) {
                System.out.println(" - " + jogo);
            }
        }
        System.out.println("=======================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        cadastrarUsuario(scanner, usuario);

        int opcao = 0;

        do {
            System.out.println("\n=== MENU PRINCIPAL DO SITE ===");
            System.out.println("1. Ver a minha Biblioteca de Jogos");
            System.out.println("2. Sair do site");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Opção inválida! Por favor, introduza um número.");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    exibirBibliotecaUsuario(usuario);
                    break;
                case 2:
                    System.out.println("A encerrar sessão... Até à próxima!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 2);

        scanner.close();
    }
}
