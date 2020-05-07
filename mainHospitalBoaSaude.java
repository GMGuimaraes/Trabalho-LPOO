
public class mainHospitalBoaSaude {

	public static void main(String[] args) {
		
		String h="h",m="m";
		Paciente p1 = new Paciente("John","123456789-10",h.charAt(0),3,"A+","pele ardendo",21);
		Paciente p2 = new Paciente("Vitoria","987654321-01",m.charAt(0),4,"B-","dor de cabeça",19);
		Paciente[] pacientes = new Paciente[2];
		pacientes[0]= p1;
		pacientes[1]= p2;
		Medico md = new Medico("Leandro","11111111-11",h.charAt(0),190, 2022);
		md.setEspecialidade("reumatologista");
		Atendente at = new Atendente("Lucia","999999999-99",m.charAt(0),555);
		Prontuario pron = new Prontuario(pacientes,2);

		pron.exibeProntuario();
		System.out.println("Paciente 1 tem cadastro:"+at.ConsultaCadastro(pacientes[0])+" e o 2:"+at.ConsultaCadastro(pacientes[1]));
		at.encaminha("articulacao");
		at.encaminha("cerebro");


	}

}
