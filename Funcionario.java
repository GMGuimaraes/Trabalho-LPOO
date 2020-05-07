
public class Funcionario extends Pessoa {
	public Funcionario(String nome, String cpf, char sexo) {
		super(nome, cpf, sexo);
		// TODO Auto-generated constructor stub
	}

	private int idFuncionario;

	public String getName(){
		return super.getNome();
	}
	
}
