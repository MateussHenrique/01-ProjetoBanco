public class App {
    // Método classe principal e testes
    public static void main(String[] args) {

        CaixaEletronico caixa = new CaixaEletronico(true, 1000);
        caixa.abrirMenu();
        caixa.depositar(500);
        caixa.sacar(200);
        caixa.transferir(300, "12345-6");
        System.out.println("Saldo atual: R$" + caixa.consultarSaldo());

        
    }
}
