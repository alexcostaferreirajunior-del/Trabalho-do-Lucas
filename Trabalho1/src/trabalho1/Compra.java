package trabalho1;

public class Compra{

    private final Usuario usuario;
    private final Jogos jogo;

    public Compra(Usuario usuario, Jogos jogo) {
        this.usuario = usuario;
        this.jogo = jogo;
    }

    public boolean realizarCompra() {
        double saldo = usuario.getSaldo();
        double valorJogo = jogo.getvalor();

        if (valorJogo < 0 || saldo < valorJogo) {
            return false;
        }

        usuario.setSaldo(saldo - valorJogo);
        return true;
    }
}