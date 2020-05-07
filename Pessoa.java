public class Pessoa {
	private String nome;
	private String cpf;
	private char sexo;
	
	public Pessoa() {
		super();
		this.nome = "NaoDeclarado";
		this.cpf = "XXXXXXXXX-XX";
		this.sexo = 109;
	}
	
	public Pessoa(String nome, String cpf, char sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
}

