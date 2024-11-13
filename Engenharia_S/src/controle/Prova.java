package controle;

import java.util.Date;

public class Prova {
    private String codigo;
    private Date dataRealizacao;
    private double peso;
    private String status;

    public Prova(String codigo, Date dataRealizacao, double peso, String status) {
        this.codigo = codigo;
        this.dataRealizacao = dataRealizacao;
        this.peso = peso;
        this.status = status;
    }

    // Getters e Setters necessários
    public String getCodigo() {
        return codigo;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public double getPeso() {
        return peso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Prova{" +
                "codigo='" + codigo + '\'' +
                ", dataRealizacao=" + dataRealizacao +
                ", peso=" + peso +
                ", status='" + status + '\'' +
                '}';
    }
}

