public class CaixaEletronico implements Caixa {

    //Atributos para a classe
    private double saldo;
    private boolean acesso;

    
    //Métodos especiais
    public CaixaEletronico (boolean acesso, double saldoInicial) {
        this.acesso = acesso;
        this.saldo = saldoInicial;
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
        if (acesso) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente ou valor inválido para saque.");
            }
        } else {
            System.out.println("Acesso negado. Caixa Eletrônico indisponível.");
        }
    }
    
    @Override
    public void depositar(double valor) {
        if (acesso) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor inválido para depósito.");
            }
        } else {
            System.out.println("Acesso negado. Caixa Eletrônico indisponível.");
        }
    }
    
    @Override
    public double consultarSaldo() {
        if (acesso) {
            return saldo;
        } else {
            System.out.println("Acesso negado. Caixa Eletrônico indisponível.");
            return -1;
        }
    }
    
    @Override
    public void transferir(double valor, String contaDestino) {
        if (acesso) {
            if (valor >= 0 && valor <= saldo) {
                saldo -= valor;
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