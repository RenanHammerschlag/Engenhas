package controle;

public class Turma {
    private String codigo;
    private String situacao;
    private Professor professor;

    public Turma(String codigo, String situacao, Professor professor) {
        this.codigo = codigo;
        this.situacao = situacao;
        this.professor = professor;
    }

    // Getters e Setters necessários
    public String getCodigo() {
        return codigo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "codigo='" + codigo + '\'' +
                ", situacao='" + situacao + '\'' +
                ", professor=" + professor.getNome() +
                '}';
    }
}

