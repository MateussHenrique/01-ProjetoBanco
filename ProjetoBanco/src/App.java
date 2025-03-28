public class App {
    public static void main(String[] args) {
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

        ContaBanco p3 = new ContaBanco(0, false);
        p3.setnumConta(1290);
        p3.setDono("Isaque");
        p3.abrirConta("CC");
        p3.depositar(7500);
        p3.estadoAtual(); 

        ContaBanco p4 = new ContaBanco(0, false);
        p4.setnumConta(1290);
        p4.setDono("Heverton");
        p4.abrirConta("CP");
        p4.depositar(15000);
        p4.estadoAtual(); 

        ContaBanco p5 = new ContaBanco(0, false);
        p5.setnumConta(1290);
        p5.setDono("Verônica");
        p5.abrirConta("CP");
        p5.depositar(35000);
        p5.estadoAtual(); 
    }
}
