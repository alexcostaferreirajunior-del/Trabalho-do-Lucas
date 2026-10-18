package trabalho1;

public class Compra {
    private final Usuario usuario;
    private final Jogos jogo;

    public Compra(Usuario usuario, Jogos jogo) {
        this.usuario = usuario;
        this.jogo = jogo;
    }
//ele chama o metodo getSaldo da classe Usuario e o metodo getvalor da classe Jogos para verificar se o usuario tem saldo suficiente para comprar o jogo. Se o saldo for suficiente, ele subtrai o valor do jogo do saldo do usuario e retorna true, indicando que a compra foi realizada com sucesso. Caso contrario, ele retorna false, indicando que a compra nao foi realizada.
    public void  realizarCompra() {
        double saldo = usuario.getSaldo();
        double valorJogo = jogo.getvalor(); 
 
        if (valorJogo < 0 || saldo < valorJogo) {
            System.out.println("Saldo insuficiente ou valor invalido.");
        }else {
        usuario.setSaldo(saldo - valorJogo);
        System.out.println("Compra realizada com sucesso!"); 
    }
} 
}