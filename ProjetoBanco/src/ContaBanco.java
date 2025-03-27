public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;



    //Método para mostrar o estado atual da conta
    public void estadoAtual() {
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
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
    
    public void setnumConta (int n) {
        this.numConta = n;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo (String t){
        this.tipo = t;
    }

    public String getDono(){
        return dono;
    }

    public void setDono (String d){
        this.dono = d;
    }

    public float getSaldo (){
        return saldo;
    }

    public void setSaldo (float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus (boolean s){
        this.status = s;
    }



    //Métodos da classe
    public void abrirConta (){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }

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

    public void depositar (float v){
        if (this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " +this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar (float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v); {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            } else {
                System.out.println("Impossível sacar em uma conta fechada!");
            }
        }
    }

    public void pagarMensal (){
        int v;
        if (this.getTipo() == "CC") {
            v=12;
        } else if (this.getTipo() == "CP"{
            v=20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
}
