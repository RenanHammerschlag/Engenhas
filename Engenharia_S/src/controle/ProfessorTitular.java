package controle;

public class ProfessorTitular extends Professor {
    private String adpTitulacao;

    public ProfessorTitular(String cpf, String nome, String endereco, String telefone, int idade, String especialidade, String adpTitulacao) {
        super(cpf, nome, endereco, telefone, idade, especialidade);
        this.adpTitulacao = adpTitulacao;
    }

    // Getter necessário
    public String getAdpTitulacao() {
        return adpTitulacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", adpTitulacao='" + adpTitulacao + '\'';
    }
}
