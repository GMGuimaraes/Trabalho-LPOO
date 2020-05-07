
public class Medico extends Funcionario {
 	private int numeroRegistro;
 	private String especialidade;

 	public Medico(String nome, String cpf, char sexo,int id, int reg){
 		super(nome,cpf,sexo,id);
 		this.numeroRegistro = reg;
 	}
 	public void setEspecialidade(String esp){
 		this.especialidade = esp;
 	}
 	public void exibeMedico(){
 		System.out.printf("Registro: %d\n Nome: %s\n Especialidade: %s",numeroRegistro,super.getName(),especialidade);
 	}
}
