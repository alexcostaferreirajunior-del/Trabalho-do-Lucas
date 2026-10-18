package trabalho1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.println("\nDigite 1 para adicionar jogo, 2 para ver o catalogo, 3 para fazer uma compra ou 0 para sair:");
            num = scan.nextInt();

            switch (num) {
                case 1 -> {
                    System.out.println("Quantos jogos deseja cadastrar: ");
                    int quantidade = scan.nextInt();
                    for (int i = 0; i < quantidade; i++) {
                        Jogos.adicionarJogos(scan);
                    }
                }
                case 2 -> Jogos.exibirCatalogo();
                case 3 -> {
                    System.out.println("Digite o nome do usuario: ");
                    String nome = scan.next();
                    System.out.println("Digite o saldo do usuario: ");
                    double saldo = scan.nextDouble();
                    Usuario usuario = new Usuario(nome, saldo);

                    System.out.println("Digite o nome do jogo que deseja comprar: ");
                    String nomeJogo = scan.next();

                    Jogos jogoEscolhido = null;
                    for (Jogos jogo : Jogos.getCatalogo()) {
                        if (jogo.getnome().equalsIgnoreCase(nomeJogo)) {
                            jogoEscolhido = jogo;
                            break;
                        }
                    }

                    if (jogoEscolhido == null) {
                        System.out.println("Jogo nao encontrado.");
                        break;
                    }

                    Compra compra = new Compra(usuario, jogoEscolhido);
                    if (compra.realizarCompra()) {
                        System.out.println("Compra realizada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente ou valor invalido.");
                    }
                }
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (num != 0);

        scan.close();
    }
} 