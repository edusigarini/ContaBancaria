public class ContaPoupanca extends Conta{
    private float juros;

    public void jurosConta(float juros){
        float rendimento = (this.getJuros() * this.getSaldo()) + this.getSaldo();
        this.setSaldo(this.getSaldo() + rendimento);
    }

    public ContaPoupanca(Cliente dono) {
        super(dono);
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
        super.sacar(valor);
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

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }
}
