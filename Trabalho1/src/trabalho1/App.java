package trabalho1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        do {
            System.out.println("\nDigite 1 para adicionar jogo, 2 para ver o catalogo ou 0 para sair:");
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
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (num != 0);

        scan.close();
    }
}
