
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
	public void encaminha(String areaEnfermidade){ //Relacionará enfermidade com especialidade médica
		switch(areaEnfermidade.toLowerCase()){
			case "cerebro":
				System.out.println("neurologiasta");
                break;
            case "coracao":
				System.out.println("cardiologista");
                break;
            case "pele":
				System.out.println("dermatologia");
                break;
            case "articulacao":
				System.out.println("reumatologista");
                break;
		}
	}
}	
