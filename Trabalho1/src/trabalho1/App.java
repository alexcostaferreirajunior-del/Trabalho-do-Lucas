package trabalho1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 1 se quiser adicionar um jogo ou digite 2 se quiser ver o catalogo ");

        int num = scan.nextInt();

        if (num == 2) {
            Jogos j1 = new Jogos("m", 909, "29", "281");
            j1.exibirDetalhes();
        } else if (num == 1) {

            System.out.println("Quantos jogos deseja cadastrar: ");
            int quantidade = scan.nextInt();
            ArrayList<Jogos> novoJogo = new ArrayList<>();
            for (int i = 0; i < quantidade; i++) {

            }

        } else {
            System.out.println("Acho que você precisa voltar para o primario não você realmente precisa");

        }
    }
}
