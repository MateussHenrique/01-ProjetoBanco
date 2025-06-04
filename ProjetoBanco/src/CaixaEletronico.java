public class CaixaEletronico implements Caixa {

    //Atributos para a classe
    private boolean acesso;
    private ContaBanco conta;
    
    //Métodos especiais
    public CaixaEletronico (boolean acesso, ContaBanco conta) {
        this.acesso = acesso;
        this.conta = conta  ;
    }

    public boolean getAcesso() {
        return acesso;
    }

    public void setAcesso(boolean acesso) {
        this.acesso = acesso;
    }


    //Métodos Abstratos e Sobrescrevidos
    @Override
    public void sacar(double valor) {
        if (acesso && conta != null) {
            // Converter double para float
            conta.sacar((float) valor); 
        } else {
            System.out.println("Acesso negado, não foi possível sacar.");
        }
    }
    

    
    @Override
    public void depositar(double valor) {
        if (acesso && conta != null) {
            conta.depositar((float) valor);
            } else {
                System.out.println("Acesso negado, não foi possível depositar");
        }
    }
    


    @Override
    public double consultarSaldo() {
        if (acesso && conta != null) {
            return conta.getSaldo();
        } else {
            System.out.println("Acesso negado. Caixa Eletrônico indisponível.");
            return 0;
        }
    }


    @Override
    public void transferir(double valor, CaixaEletronico contaDestino) {
        if (acesso && conta != null && contaDestino.conta != null) {
            if (valor > 0 && valor <= conta.getSaldo()) {
                conta.sacar((float) valor);
                contaDestino.conta.depositar((float) valor);
                System.out.println("Transferência de R$" + valor + " para a conta " + contaDestino + " realizada com sucesso.");
            } else {
                System.out.println("Saldo insuficiente ou valor inválido para transferência.");
            }
        } else {
            System.out.println("Acesso negado. Caixa Eletrônico indisponível.");
        }
    }
    

    // Método para abrir o menu do caixa eletrônico
    public void abrirMenu() {
        if (acesso) {
            System.out.println("Bem-vindo ao Caixa Eletrônico. Escolha uma opção: ");
        } else {
            System.out.println("Caixa Eletrônico indisponível.");
        }
    }
}
