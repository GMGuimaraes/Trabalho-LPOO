
public class Paciente extends Pessoa {
	private int idPaciente;
	private String tipoSanguineo;
	private String sintomas; //sintomas pode ser um vetor
	private int idade;
	

	public Paciente(String nome, String cpf, char sexo, int idPaciente, String tipoSanguineo, String sintomas,
			int idade) {
		super(nome, cpf, sexo);
		this.idPaciente = idPaciente;
		this.tipoSanguineo = tipoSanguineo;
		this.sintomas = sintomas;
		this.idade = idade;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
