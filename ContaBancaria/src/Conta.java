public class Conta {
    private int numConta;
    private int agencia;
    private float saldo;
    private Cliente dono;
    public int op;
    
    public void dadosConta(){
        System.out.println("----------------------------");
        System.out.println("Dono: " + this.getDono());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Saldo: " + this.getSaldo());
    }

    public Conta(Cliente dono) {
        this.dono = dono;
        this.setSaldo(0);
        this.setNum(numConta++);
        this.setAgencia(1010);
    }

    public void depositar(float valor){
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Depósito realizado na conta de: " + this.getDono());
        System.out.println("Saldo atualizado: R$" + this.getSaldo());
    }

    public void sacar(float valor){
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado na conta de: " + this.getDono());
            System.out.println("Saldo atualizado: R$" + this.getSaldo());
        } else {
            System.out.println("Saldo insuficiente, seu saldo atual é: R$" + this.getSaldo());
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNum(int numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }
    
}
