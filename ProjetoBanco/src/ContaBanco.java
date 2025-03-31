public class ContaBanco {

    //Atributos para a classe
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private int getSaldo;



    //Método para mostrar o estado atual da conta
    public void estadoAtual() {
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-------------------------------");
    }



    //Construtor da classe
    public ContaBanco(float saldo, boolean status) {
        this.setSaldo(0);
        this.setStatus(false);
    }



    //Métodos Getters e Setters
    public int getnumConta(){
        return numConta;
    }
    
    public void setnumConta (int numConta) {
        this.numConta = numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return dono;
    }

    public void setDono (String dono){
        this.dono = dono;
    }

    public float getSaldo (){
        return saldo;
    }

    public void setSaldo (float saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus (boolean status){
        this.status = status;
    }



    //Métodos da classe

    //Método para "Abrir conta"
    public void abrirConta (String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }

    //Método para "Fechar conta"
    public void fecharConta (){
        if (this.getSaldo > 0){
            System.out.println("Conta não pode ser fechada porque está com dinheiro");
        } else if (this.getSaldo < 0){
            System.out.println("Conta não pode ser fechada pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

        //Método para "Depósito"
    public void depositar (float v){
        if (this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " +this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

        //Método para "Saque"
    public void sacar (float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar em uma conta fechada!");
        }
    }

    //Método para gerenciar o "Pagamento mensal"
    public void pagarMensal (){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v=12;
        } else if ("CP".equals(this.getTipo())){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
}

