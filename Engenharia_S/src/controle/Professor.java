package controle;

public abstract class Professor {
    protected String cpf;
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected int idade;
    protected String especialidade;

    public Professor(String cpf, String nome, String endereco, String telefone, int idade, String especialidade) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.especialidade = especialidade;
    }

    // Getters e Setters necessários
    public String getCpf() {
        return cpf;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
