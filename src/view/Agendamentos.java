//SEMPRE QUANDO FOR CRIAR UMA TELA, COPIA TODAS AS LINHAS DESSE TELA DEFAULT E COLA NA TELA QUE IRÁ CRIAR
package view;

import javax.swing.*;

import negocio.Registro;
import persistencia.ControlaCadastro;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agendamentos extends JFrame {
	
	ControlaCadastro r = new ControlaCadastro();
	
	private JTextField tfdNome;
	private JTextField tfdTelefone;
	private JTextField tfdData;
	private JTextField tfdHora;
	public Agendamentos() {
		
		getContentPane().setBackground(new Color(240, 240, 240));
		setVisible(true);
		setSize(700, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
        
        
        JButton btnNewButton = new JButton("Especialidades");
        btnNewButton.setBackground(new Color(0, 255, 64));
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnNewButton.setBounds(0, 7, 96, 27);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Agendamentos.super.setVisible(false);
        		Especialidades especialidades = new Especialidades();
        		especialidades.setVisible(true);
        	}
        });
        getContentPane().add(btnNewButton);
        
        JButton btnAgendamentos = new JButton("Agendamentos\r\n");
        btnAgendamentos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnAgendamentos.setForeground(new Color(0, 0, 0));
        btnAgendamentos.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnAgendamentos.setBackground(new Color(0, 255, 64));
        btnAgendamentos.setBounds(203, 7, 96, 27);
        getContentPane().add(btnAgendamentos);
        
        JButton btnInstalacoes = new JButton("Instalações\r\n");
        btnInstalacoes.setForeground(new Color(0, 0, 0));
        btnInstalacoes.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnInstalacoes.setBackground(new Color(0, 255, 64));
        btnInstalacoes.setBounds(492, 7, 89, 27);
        btnInstalacoes.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Agendamentos.super.setVisible(false);
        		Instalacoes instalacoes = new Instalacoes();
        		instalacoes.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnInstalacoes);
        
        JButton btnCorpoClinico = new JButton("Corpo Clinico\r\n");
        btnCorpoClinico.setForeground(new Color(0, 0, 0));
        btnCorpoClinico.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico.setBackground(new Color(0, 255, 64));
        btnCorpoClinico.setBounds(101, 7, 96, 27);
        btnCorpoClinico.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                Agendamentos.super.setVisible(false);
                CorpoClinico corpoclinico = new CorpoClinico();
                corpoclinico.setVisible(true);
            }
        });
        getContentPane().add(btnCorpoClinico);
        
        JButton btnCorpoClinico_1 = new JButton("Consultas\r\n");
        btnCorpoClinico_1.setForeground(new Color(0, 0, 0));
        btnCorpoClinico_1.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1.setBounds(299, 7, 84, 27);
        btnCorpoClinico_1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {

                Agendamentos.super.setVisible(false);
                Consultas consultas = new Consultas();
                consultas.setVisible(true);
            }
        });
        getContentPane().add(btnCorpoClinico_1);
        
        JButton btnCorpoClinico_1_1 = new JButton("Horarios\r\n");
        btnCorpoClinico_1_1.setForeground(new Color(0, 0, 0));
        btnCorpoClinico_1_1.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1_1.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1_1.setBounds(588, 7, 96, 27);
        btnCorpoClinico_1_1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {

            	Agendamentos.super.setVisible(false);
                Horarios horarios = new Horarios();
                horarios.setVisible(true);
            }
        });
        getContentPane().add(btnCorpoClinico_1_1);
        
        JButton btnCorpoClinico_1_2 = new JButton("Convênios");
        btnCorpoClinico_1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
            {
                Agendamentos.super.setVisible(false);
                Convenio convenio = new Convenio();
                convenio.setVisible(true);
            }
        });
        btnCorpoClinico_1_2.setForeground(new Color(0, 0, 0));
        btnCorpoClinico_1_2.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1_2.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1_2.setBounds(386, 7, 96, 27);
        getContentPane().add(btnCorpoClinico_1_2);
        
        JEditorPane editorPane = new JEditorPane();
        editorPane.setBackground(new Color(0, 255, 128));
        editorPane.setBounds(0, 0, 684, 40);
        getContentPane().add(editorPane);

        
        JButton btnCorpoClinico_1_3 = new JButton("Voltar Ao Inicio");
        btnCorpoClinico_1_3.setForeground(Color.BLACK);
        btnCorpoClinico_1_3.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1_3.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1_3.setBounds(285, 45, 114, 27);
        
        //CODIGO PADRAO DE NAVEGAÇÃO DE TELA
        
        //TROCA O NOME btnCorpoClinico_1_3 PELO NOME DO BOTAO DA SUA PAGINA
        //AQUI ESTA ADD ELE AO EVENTO
        btnCorpoClinico_1_3.addActionListener(new ActionListener(){
        	
        	//AQUI ESTA CRIANDO UM METODO PARA O BOTÃO
        	public void actionPerformed(ActionEvent e) {
    		
    	//TROCAR O NOME DEFAULT, PELO NOME DA TELA NOVA QUE ESTA CRIANDO
        	Agendamentos.super.setVisible(false);
    		Home home = new Home();
            home.setVisible(true);
    		//OBJETIVO DESSE METODO É QUANDO CLICAR NO BOTAO, ELE IRA MUDAR DE TELA
            //NO EXEMPLO ACIMA, ELE ESTA FECHANDO A PAGINA QUE ESTA E INDO PARA A PAGINA INICIAL
    	}
    });
        getContentPane().add(btnCorpoClinico_1_3);
        
        JLabel lblNewLabel = new JLabel("Nome:");
        lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblNewLabel.setBounds(101, 174, 44, 27);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Telefone:");
        lblNewLabel_1.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(101, 212, 46, 14);
        getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Data:\r\n");
        lblNewLabel_2.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblNewLabel_2.setBounds(101, 248, 46, 14);
        getContentPane().add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Horario:");
        lblNewLabel_3.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblNewLabel_3.setBounds(101, 284, 46, 14);
        getContentPane().add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Faça Seu Agendamento:");
        lblNewLabel_4.setFont(new Font("Agency FB", Font.PLAIN, 28));
        lblNewLabel_4.setBounds(253, 98, 200, 54);
        getContentPane().add(lblNewLabel_4);
        
        tfdNome = new JTextField();
        tfdNome.setBackground(new Color(255, 255, 255));
        tfdNome.setBounds(151, 180, 393, 20);
        getContentPane().add(tfdNome);
        tfdNome.setColumns(10);
        
        tfdTelefone = new JTextField();
        tfdTelefone.setColumns(10);
        tfdTelefone.setBackground(Color.WHITE);
        tfdTelefone.setBounds(151, 212, 393, 20);
        getContentPane().add(tfdTelefone);
        
        tfdData = new JTextField();
        tfdData.setColumns(10);
        tfdData.setBackground(Color.WHITE);
        tfdData.setBounds(151, 248, 393, 20);
        getContentPane().add(tfdData);
        
        tfdHora = new JTextField();
        tfdHora.setColumns(10);
        tfdHora.setBackground(Color.WHITE);
        tfdHora.setBounds(151, 284, 393, 20);
        getContentPane().add(tfdHora);
        
        JButton btnSair = new JButton("Sair\r\n");
        btnSair.setBackground(new Color(230, 230, 230));
        btnSair.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnSair.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Agendamentos.super.setVisible(false);
        		Home home = new Home();
                home.setVisible(true);
        	}
        });
        btnSair.setBounds(568, 477, 106, 23);
        getContentPane().add(btnSair);
        
        JButton btnVerConsultas = new JButton("Ver Consultas");
        btnVerConsultas.setBackground(new Color(230, 230, 230));
        btnVerConsultas.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Agendamentos.super.setVisible(false);
        		Consultas consultas = new Consultas();
                consultas.setVisible(true);
        	}
        });
        
        btnVerConsultas.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnVerConsultas.setBounds(452, 477, 106, 23);
        getContentPane().add(btnVerConsultas);
        
        JButton btnSalvar = new JButton("Salvar\r\n");
        btnSalvar.setBackground(new Color(230, 230, 230));
        btnSalvar.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnSalvar.setBounds(336, 477, 106, 23);
        getContentPane().add(btnSalvar);
        
	}
	

	
	public void btnSalvar(java.awt.event.ActionEvent e) {
		Registro registro = new Registro();
		registro.setNome(tfdNome.getText());
		registro.setTelefone(tfdTelefone.getText());
		registro.setData(tfdData.getText());
		registro.setHora(tfdHora.getText());
		
		if(r.salvar(registro)) {
			JOptionPane.showMessageDialog(null, "Agendamento Efetuado com Sucesso!!");
			tfdNome.setText("");
			tfdTelefone.setText("");
			tfdData.setText("");
			tfdHora.setText("");
			tfdNome.requestFocus();
			tfdTelefone.requestFocus();
			tfdData.requestFocus();
			tfdHora.requestFocus();
		}else {
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
			
		}
	}
}

