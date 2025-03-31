public interface Caixa {
    
    //Métodos Abstratos
    public void sacar(double valor);
    public void depositar(double valor);
    public void transferir(double valor, String contaDestino);
    public double consultarSaldo();
}
