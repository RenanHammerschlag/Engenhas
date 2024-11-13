package controle;

public class Aluno {
	private int id;
	private String nome;
	private String endereco;
	private int idade;
	private String telefone;
	
	public Aluno(int id, String nome, String endereco, int idade, String telefone){
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void getTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", idade=" + idade +
                ", telefone='" + telefone + '\'' +
                '}';
	}
}


