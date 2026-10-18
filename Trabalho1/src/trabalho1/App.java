package trabalho1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// Loop para permitir que o usuário adicione jogos, veja o catálogo ou saia do programa
        int num; 
        do {
            System.out.println("\nDigite 1 para adicionar jogo, 2 para ver o catalogo ou 0 para sair:");
            num = scan.nextInt();
// Switch case para lidar com a escolha do usuário
            switch (num) { 
                case 1 -> {
                    System.out.println("Quantos jogos deseja cadastrar: ");
                    int quantidade = scan.nextInt();
                    for (int i = 0; i < quantidade; i++) {
                        Jogos.adicionarJogos(scan);
                    }
                }
                case 2 -> Jogos.exibirCatalogo();
                case 3 -> System.out.println("Digite a quantidade: ");
                int quanto = scan.nextInt(); 
                for(int i = 0; i = quanto; i++) {
                    Compra.RealizarCompra(args); 
                } System.out.println("Digite 1 para adicionar jogo,Digite 2 para ver o Catalogo,Digite 3 para fazer uma compra,Digite 0 para sair "); num = scan.nextInt();

                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (num != 0);

        scan.close();
    }
}
