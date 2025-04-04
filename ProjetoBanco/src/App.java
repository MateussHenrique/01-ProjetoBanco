public class App {
    // Método classe principal e testes
    public static void main(String[] args) {

        ContaBanco conta0 = new ContaBanco("Mateus", 1000, true);
        ContaBanco conta1 = new ContaBanco("Henrique", 800, true);
        CaixaEletronico caixa0 = new CaixaEletronico(true, conta0);
        CaixaEletronico caixa1 = new CaixaEletronico(true, conta1);

        caixa0.abrirMenu();
        caixa0.depositar(600);
        caixa0.sacar(200);
        caixa0.transferir(300, caixa0);
        System.out.println("Saldo atual: R$" + caixa0.consultarSaldo() + "\n");

        caixa1.abrirMenu();
        caixa1.depositar(1000);
        caixa1.sacar(350);
        caixa1.transferir(50, caixa0);
        System.out.println("Saldo atual: R$" + caixa1.consultarSaldo() + "\n");
    }
}
