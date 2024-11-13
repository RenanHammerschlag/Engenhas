package controle;

import java.util.Date;

public class ProfessorAdjunto extends Professor {
    private Date dataJudi;

    public ProfessorAdjunto(String cpf, String nome, String endereco, String telefone, int idade, String especialidade, Date dataJudi) {
        super(cpf, nome, endereco, telefone, idade, especialidade);
        this.dataJudi = dataJudi;
    }

    // Getter necessário
    public Date getDataJudi() {
        return dataJudi;
    }

    @Override
    public String toString() {
        return super.toString() + ", dataJudi=" + dataJudi;
    }
}

