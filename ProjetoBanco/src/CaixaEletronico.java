public class CaixaEletronico implements Caixa {
    //Atributos 
    private double saldo;

    //Métodos Especiais
    public CaixaEletronico (boolean acesso, int transacao) {
        this.acesso = acesso;
        this.transacao = transacao;
    }

    public boolean getAcesso() {
        return acesso;
    }

    public void setAcesso(boolean acesso) {
        this.acesso = acesso;
    }

    public int getTransacao() {
        return transacao;
    }

    public void setTransacao(int transacao) {
        this.transacao = transacao;
    }


    //Métodos Abstratos
    @Override
    public void entrarConta() {
        this.setAcesso(true);
    }

    @Override
    public void sairConta() {
        this.setAcesso(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Você está acessando a conta: " + this.getAcesso());
        System.out.println("Houve quantas transações? " + this.getTransacao());
        System.out.println("------------------------------------------------------------");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");      
    }

    @Override
    public void depositar() {
        if (this.getAcesso()){
            this.setTransacao(this.getTransacao());
        }          
    }

    @Override
    public void sacar() {
        if (this.getAcesso()){
            this.setTransacao(this.getTransacao());
        }
    }
}

