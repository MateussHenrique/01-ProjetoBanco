public class App {
    // Método classe principal e testes
    public static void main(String[] args) {

        CaixaEletronico conta0 = new CaixaEletronico(true, 0);
        CaixaEletronico caixa0 = new CaixaEletronico(true, conta0);

        caixa0.abrirMenu();
        caixa0.depositar(500);
        caixa0.sacar(200);
        caixa0.transferir(300, caixa0);
        System.out.println("Saldo atual: R$" + caixa0.consultarSaldo() + "\n");

        CaixaEletronico conta1 = new CaixaEletronico(true, 0);
        CaixaEletronico caixa1 = new CaixaEletronico(true, conta1);

        caixa1.abrirMenu();
        caixa1.depositar(1000);
        caixa1.sacar(1000);
        caixa1.transferir(0, caixa1);
        System.out.println("Saldo atual: R$" + caixa1.consultarSaldo() + "\n");
    }
}
