public class App {
    public static void main(String[] args) {

        //Método Interface e Classe Caixa eletrônica
        CaixaEletronico c = new CaixaEletronico(false, 0);
        c.setAcesso(false);
        c.setTransacao(0);;
        c.abrirMenu();

        ContaBanco p1 = new ContaBanco(0, false);
        p1.setnumConta(1234);
        p1.setDono("Mateus");
        p1.abrirConta("CP");
        p1.depositar(154000);
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco(0, false);
        p2.setnumConta(5678);
        p2.setDono("Henrique");
        p2.abrirConta("CC");
        p2.depositar(4000);
        p2.sacar(500);
        p2.fecharConta();
        p2.estadoAtual(); 
    }
}
