
public class Funcionario extends Pessoa {
	private int idFuncionario;

	public Funcionario(String nome, String cpf, char sexo, int id) {
		super(nome, cpf, sexo);
		this.idFuncionario = id;
		// TODO Auto-generated constructor stub
	}
	public String getName(){
		return super.getNome();
	}
	
}
