package trabalho1;

public class Compra {

    public String usuario;
private double valor;
    public String jogo; 

public Usuario(String usuario, double valor, String jogo) {
    this.usuario = usuario;
    this.valor = valor;
    this.jogo = jogo;

}

public static void RealizarCompra(String[] args) {
    
private final Usuario Usuario;
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
}