package controle;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String codigo;
    private String nome;
    private int credito;
    private List<Disciplina> preRequisitos;

    public Disciplina(String codigo, String nome, int credito) {
        this.codigo = codigo;
        this.nome = nome;
        this.credito = credito;
        this.preRequisitos = new ArrayList<>();
    }

    // Getters necessários
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCredito() {
        return credito;
    }

    public List<Disciplina> getPreRequisitos() {
        return preRequisitos;
    }

    public void adicionarPreRequisito(Disciplina disciplina) {
        preRequisitos.add(disciplina);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", credito=" + credito +
                ", preRequisitos=" + preRequisitos.size() +
                '}';
    }
}
