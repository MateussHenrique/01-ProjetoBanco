public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco();
        p1.setnumConta(1234);
        p1.setDono("Mateus");
        p1.estadoAtual();
    }
}
