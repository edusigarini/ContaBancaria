public class ContaCorrente extends Conta{
    private float limiteConta;
    private float jurosConta;

    public ContaCorrente(Cliente dono) {
        super(dono);
    }

    public void juros(float jurosConta){
        float juros = (this.getSaldo()*this.getJurosConta()) + this.getSaldo();
        if (this.getSaldo() < 0){
            this.setSaldo(this.getSaldo() - juros);
        }
    }
    @Override
    public void depositar(float valor) {
        super.depositar(valor);
    }

    @Override
    public int getAgencia() {
        return super.getAgencia();
    }

    @Override
    public Cliente getDono() {
        return super.getDono();
    }

    @Override
    public int getNumConta() {
        return super.getNumConta();
    }

    @Override
    public float getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void sacar(float valor) {
        float limite = valor + this.getLimiteConta();
        if (this.getSaldo() <= limite){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado na conta de: " + this.getDono());
            System.out.println("Saldo atualizado: R$" + this.getSaldo());
        } else {
            System.out.println("Saldo insuficiente, seu saldo atual é: R$" + this.getSaldo());
        }
    }

    @Override
    public void setAgencia(int agencia) {
        super.setAgencia(agencia);
    }

    @Override
    public void setDono(Cliente dono) {
        super.setDono(dono);
    }

    @Override
    public void setNum(int numConta) {
        super.setNum(numConta);
    }

    @Override
    public void setSaldo(float saldo) {
        super.setSaldo(saldo);
    }

    public float getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(float limiteConta) {
        this.limiteConta = limiteConta;
    }

    public float getJurosConta() {
        return jurosConta;
    }

    public void setJurosConta(float jurosConta) {
        this.jurosConta = jurosConta;
    }   
    
}
