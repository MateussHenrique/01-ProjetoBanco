public interface Caixa {
    
    //Métodos Abstratos
    public void sacar(double valor);
    public void depositar(double valor);
    public double consultarSaldo();
    public void transferir(double valor, String contaDestino);
}
