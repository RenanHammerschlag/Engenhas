package controle;

public class Departamento {
    private String codigo;
    private String nome;

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // Getters necessários
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}

