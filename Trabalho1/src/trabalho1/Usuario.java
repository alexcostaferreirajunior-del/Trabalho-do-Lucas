package trabalho1;

public class Usuario {

    public String usuario;
    private double saldo;
    public String jogo;

    public Usuario(String usuario, double saldo, String jogo) {
        this.usuario = usuario;
        this.saldo = saldo;
        this.jogo = jogo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}