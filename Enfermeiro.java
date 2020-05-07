public class Enfermeiro extends Funcionario {
	private int numeroRegistro;

	public Enfermeiro(String nome, String cpf, char sexo, int id, int nreg){
		super(nome, cpf, sexo, id);
		this.numeroRegistro = nreg;
	}
}
