public class App {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco(0, false);
        p1.setnumConta(1234);
        p1.setDono("Mateus");
        p1.estadoAtual();
    }
}
