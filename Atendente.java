
public class Atendente extends Funcionario {

	public Atendente(String nome, String cpf, char sexo, int id){
		super(nome, cpf, sexo, id);
	}
	public void imprimeProntuario(Prontuario pront){
		pront.exibeProntuario();
	}
	public boolean ConsultaCadastro(Pessoa people){
		if(people.getCpf().equals("XXXXXXXXX-XX") || people.getCpf().isEmpty()){
			return false;
		}else{
			return true;
		}
	}
}	
