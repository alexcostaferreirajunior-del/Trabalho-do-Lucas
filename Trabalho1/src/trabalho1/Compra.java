package trabalho1;

public class Compra {
    private final Usuario usuario;
    private final Jogos jogo;

    public Compra(Usuario usuario, Jogos jogo) {
        this.usuario = usuario;
        this.jogo = jogo;
    }

    public void realizarCompra() {
        if (usuario == null || jogo == null) {
            System.out.println("Usuario ou jogo invalido.");
            return;
        }

        double saldo = usuario.getSaldo();
        double valorJogo = jogo.getvalor();

        if (!Double.isFinite(saldo) || saldo < 0
                || !Double.isFinite(valorJogo) || valorJogo <= 0
                || saldo < valorJogo) {
            System.out.println("Saldo insuficiente ou valor invalido.");
            return;
        }

        usuario.setSaldo(saldo - valorJogo);
        System.out.println("Compra realizada com sucesso!");
        System.out.println("Saldo restante: R$ " + usuario.getSaldo());
    }
}