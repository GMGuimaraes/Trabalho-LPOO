package application;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame {
	
	private JPanel contentPane;
	
	ArrayList<Paciente> pacientes = new ArrayList(); 
	ArrayList<Medico> medicos = new ArrayList();
	ArrayList<Atendente> atendentes = new ArrayList();
	ArrayList<Prontuario> prontuarios = new ArrayList();
	
	private JTextField Tnome;
	private JTextField Tidade;
	private JTextField Tcpf;
	private JTextField Tsexo;
	private JTextField Tnumero;
	private JTextField Tespecialidade;
	private JTextField Tregistro;
	private JTextField Tsintomas;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton CadMedico = new JButton("Cadastro como M\u00E9dico");
		CadMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 1;
		
				Medico med = new Medico(Tnome.getText(),Tcpf.getText(),Tsexo.getText().toLowerCase().charAt(0),i++,Integer.parseInt(Tnumero.getText()));
				medicos.add(med);
				System.out.println("Medico cadastrado com sucesso!");
				
				
			}
		});
		CadMedico.setBounds(10, 334, 172, 23);
		contentPane.add(CadMedico);
		
		JButton CadAtendente = new JButton("Cadastro como Atendente");
		CadAtendente.setBounds(10, 356, 172, 23);
		contentPane.add(CadAtendente);
		
		JButton cadPaciente = new JButton("Cadastro como Paciente");
		cadPaciente.setBounds(10, 379, 172, 23);
		contentPane.add(cadPaciente);
		
		JButton CadProntuario = new JButton("Cadastro de Prontuario");
		CadProntuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CadProntuario.setBounds(10, 312, 172, 23);
		contentPane.add(CadProntuario);
		
		JLabel lblNewLabel_2 = new JLabel("Nome Completo");
		lblNewLabel_2.setBounds(10, 11, 182, 14);
		contentPane.add(lblNewLabel_2);
		
		Tnome = new JTextField();
		Tnome.setBounds(10, 31, 182, 20);
		contentPane.add(Tnome);
		Tnome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("*Idade");
		lblNewLabel.setBounds(10, 62, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF(com tra\u00E7o e pronto)");
		lblNewLabel_1.setBounds(10, 127, 118, 14);
		contentPane.add(lblNewLabel_1);
		
		Tidade = new JTextField();
		Tidade.setBounds(10, 87, 86, 20);
		contentPane.add(Tidade);
		Tidade.setColumns(10);
		
		Tcpf = new JTextField();
		Tcpf.setBounds(10, 150, 86, 20);
		contentPane.add(Tcpf);
		Tcpf.setColumns(10);
		
		Tsexo = new JTextField();
		Tsexo.setBounds(106, 87, 86, 20);
		contentPane.add(Tsexo);
		Tsexo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo (apenas h/m)");
		lblNewLabel_3.setBounds(106, 62, 91, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("* Somente pacientes devem responder");
		lblNewLabel_4.setBounds(192, 383, 194, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("** Somente Medicos devem responder");
		lblNewLabel_5.setBounds(192, 360, 194, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("**Numero de Registro");
		lblNewLabel_6.setBounds(10, 181, 118, 14);
		contentPane.add(lblNewLabel_6);
		
		Tnumero = new JTextField();
		Tnumero.setBounds(10, 206, 86, 20);
		contentPane.add(Tnumero);
		Tnumero.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("**Especialidade");
		lblNewLabel_7.setBounds(10, 237, 86, 14);
		contentPane.add(lblNewLabel_7);
		
		Tespecialidade = new JTextField();
		Tespecialidade.setBounds(10, 262, 86, 20);
		contentPane.add(Tespecialidade);
		Tespecialidade.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("*Tipo Sanguineo");
		lblNewLabel_8.setBounds(106, 237, 86, 14);
		contentPane.add(lblNewLabel_8);
		
		Tregistro = new JTextField();
		Tregistro.setBounds(106, 262, 86, 20);
		contentPane.add(Tregistro);
		Tregistro.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("*Sintomas");
		lblNewLabel_9.setBounds(136, 127, 61, 14);
		contentPane.add(lblNewLabel_9);
		
		Tsintomas = new JTextField();
		Tsintomas.setBounds(106, 152, 86, 20);
		contentPane.add(Tsintomas);
		Tsintomas.setColumns(10);
	}
}
