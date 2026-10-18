package trabalho1;

<<<<<<< HEAD
<<<<<<< HEAD
public class Usuario{

    public String usuario;
private double valor;
    public String jogo;

public Usuario(String usuario, double valor, String jogo) {
=======
private class usuário{
=======
public class Usuario {
>>>>>>> 11fddef10de07bda393f5e3d266dc39a9fb6d30d

    public String usuario;
    private double saldo;
    public String jogo;

<<<<<<< HEAD
public usuário(String usuario, double valor, String jogo) {
>>>>>>> 00c0fd5bc7f5bdba237b02f24df8f91be6f23a9f
    this.usuario = usuario;
    this.valor = valor;
    this.jogo = jogo;
=======
    public Usuario(String usuario, double saldo, String jogo) {
        this.usuario = usuario;
        this.saldo = saldo;
        this.jogo = jogo;
    }
>>>>>>> 11fddef10de07bda393f5e3d266dc39a9fb6d30d

    public double getSaldo() {
        return saldo;
    }

<<<<<<< HEAD

}

<<<<<<< HEAD
public static void RealizarCompra(String[] args) {
=======
public Double realizarCompra(){
>>>>>>> 00c0fd5bc7f5bdba237b02f24df8f91be6f23a9f
    
Usuario usuario;
=======
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
>>>>>>> 11fddef10de07bda393f5e3d266dc39a9fb6d30d

<<<<<<< HEAD
}
=======
>>>>>>> 00c0fd5bc7f5bdba237b02f24df8f91be6f23a9f
}