package trabalho1;

import java.util.ArrayList;
import java.util.List;
public class Jogos {

    private ArrayList<String> nomes;
    private ArrayList<Double> valores;
    private ArrayList<String> generos;
private ArrayList<String> 
    public Jogos(ArrayList<String> nome, ArrayList<Double> valor, ArrayList<String> genero) {
        this.nomes = nome;
        this.valores = valor;
        this.generos = genero;
    }

    public void exibirDetalhes() {
       
        System.out.println(this.nomes);
        System.out.println(this.generos);
        System.out.println("R$: " + this.valores);
    }
         
}
