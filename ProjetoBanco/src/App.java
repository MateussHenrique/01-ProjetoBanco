public class App {
    // Método classe principal e testes
    public static void main(String[] args) {

        CaixaEletronico caixa = new CaixaEletronico(true, 1000);
        caixa.abrirMenu();
        caixa.depositar(500);
        caixa.sacar(200);
        caixa.transferir(300, "12345-6");
        System.out.println("Saldo atual: R$" + caixa.consultarSaldo());

        CaixaEletronico caixa1 = new CaixaEletronico(true, 2000);
        caixa1.abrirMenu();
        caixa1.depositar(1000);
        caixa1.sacar(1000);
        caixa1.transferir(0, "12345-6");
        System.out.println("Saldo atual: R$" + caixa.consultarSaldo());

        CaixaEletronico caixa2 = new CaixaEletronico(true, 2000);
        caixa2.abrirMenu();
        caixa2.depositar(1000);
        caixa2.sacar(0);
        caixa2.transferir(500, "12345-6");
        System.out.println("Saldo atual: R$" + caixa.consultarSaldo());

        CaixaEletronico caixa3 = new CaixaEletronico(true, 2000);
        caixa3.abrirMenu();
        caixa3.depositar(3000);
        caixa3.sacar(1000);
        caixa3.transferir(200, "12345-6");
        System.out.println("Saldo atual: R$" + caixa.consultarSaldo());
    }
}
