package trabalho1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Usuario usuario = new Usuario("", 0, "", "", "");
            Usuario.cadastrarUsuario(scan, usuario);

            double saldoInicial;
            do {
                saldoInicial = lerDouble(scan, "Digite o saldo inicial do usuario: ");
                if (saldoInicial < 0) {
                    System.out.println("Saldo invalido. O saldo inicial nao pode ser negativo.");
                }
            } while (saldoInicial < 0);
            usuario.setSaldo(saldoInicial);

            int num;
            do {
                num = lerInteiro(scan, "\nDigite 1 para adicionar jogo, 2 para ver o catalogo, 3 para fazer uma compra, 4 para ver sua biblioteca ou 0 para sair: ");

                switch (num){
                    case 1 -> {
                        int quantidade;
                        do {
                            quantidade = lerInteiro(scan, "Quantos jogos deseja cadastrar: ");
                            if (quantidade < 0) {
                                System.out.println("Quantidade invalida. Informe zero ou um numero positivo.");
                            }
                        } while (quantidade < 0);

                        for (int i = 0; i < quantidade; i++) {
                            Jogos.adicionarJogos(scan);
                        }
                    }
                    case 2 ->
                        Jogos.exibirCatalogo();
                    case 3 -> {
                        if (Jogos.getCatalogo().isEmpty()) {
                            System.out.println("Nenhum jogo cadastrado para comprar.");
                            break;
                        }

                        for (int i = 0; i < Jogos.getCatalogo().size(); i++) {
                            System.out.println(i + " - " + Jogos.getCatalogo().get(i).getnome());
                        }

                        int indice = lerInteiro(scan, "Escolha o index do jogo para comprar: ");
                        if (indice < 0 || indice >= Jogos.getCatalogo().size()) {
                            System.out.println("Indice invalido.");
                            break;
                        }

                        Compra compra = new Compra(usuario, Jogos.getCatalogo().get(indice));
                        compra.realizarCompra();
                    }
                    case 4 ->
                        Usuario.exibirBibliotecaUsuario(usuario);
                    case 0 ->
                        System.out.println("Encerrando o programa.");
                    default ->
                        System.out.println("Opcao invalida. Tente novamente.");

                }

            } while (num != 0);
        }
    }

    private static int lerInteiro(Scanner scan, String mensagem) {
        while (true) {
            System.out.println(mensagem);
            try {
                return Integer.parseInt(scan.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite um numero inteiro.");
            }
        }
    }

    private static double lerDouble(Scanner scan, String mensagem) {
        while (true) {
            System.out.println(mensagem);
            try {
                double valor = Double.parseDouble(scan.nextLine().trim().replace(',', '.'));
                if (Double.isFinite(valor)) {
                    return valor;
                }
            } catch (NumberFormatException e) {
            }
            System.out.println("Entrada invalida. Digite um numero valido.");
        }
    }
}
