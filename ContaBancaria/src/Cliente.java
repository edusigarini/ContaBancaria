public class Cliente {
    String nome;
    String endereco;
    String profissao;
    String cpf;
    
    public Cliente(String nome, String endereco, String profissao, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.profissao = profissao;
        this.cpf = cpf;
    }

    public void dadosCliente(){
        System.out.println("----------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Profissão: " + this.getProfissao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }    
}
