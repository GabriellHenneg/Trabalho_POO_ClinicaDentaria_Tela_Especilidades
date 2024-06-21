//SEMPRE QUANDO FOR CRIAR UMA TELA, COPIA TODAS AS LINHAS DESSE TELA DEFAULT E COLA NA TELA QUE IRÁ CRIAR
package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Convenio extends JFrame {
	public Convenio() {
		
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
        		Convenio.super.setVisible(false);
        		Especialidades especialidades = new Especialidades();
        		especialidades.setVisible(true);
        	}
        });
        getContentPane().add(btnNewButton);
        
        JButton btnAgendamentos = new JButton("Agendamentos\r\n");
        btnAgendamentos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Convenio.super.setVisible(false);
        		Agendamentos agendamentos = new Agendamentos();
        		agendamentos.setVisible(true);
        		
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
        		Convenio.super.setVisible(false);
        		Instalacoes instalacoes = new Instalacoes();
        		instalacoes.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnInstalacoes);
        
        JButton btnCorpoClinico = new JButton("Corpo Clinico\r\n");
        btnCorpoClinico.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
        		Convenio.super.setVisible(false);
        		CorpoClinico corpoclinico = new CorpoClinico();
        		corpoclinico.setVisible(true);
        		
        	}
        });
        btnCorpoClinico.setForeground(new Color(0, 0, 0));
        btnCorpoClinico.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico.setBackground(new Color(0, 255, 64));
        btnCorpoClinico.setBounds(101, 7, 96, 27);
        getContentPane().add(btnCorpoClinico);
        
        JButton btnCorpoClinico_1 = new JButton("Consultas\r\n");
        btnCorpoClinico_1.setForeground(new Color(0, 0, 0));
        btnCorpoClinico_1.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1.setBounds(299, 7, 84, 27);
        btnCorpoClinico_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
        		Convenio.super.setVisible(false);
        		Consultas consultas = new Consultas();
                consultas.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnCorpoClinico_1);
        
        JButton btnCorpoClinico_1_1 = new JButton("Horarios\r\n");
        btnCorpoClinico_1_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
        		Convenio.super.setVisible(false);
        		Horarios horarios = new Horarios();
        		horarios.setVisible(true);
        		
        	}
        });
        btnCorpoClinico_1_1.setForeground(new Color(0, 0, 0));
        btnCorpoClinico_1_1.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1_1.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1_1.setBounds(588, 7, 96, 27);
        getContentPane().add(btnCorpoClinico_1_1);
        
        JButton btnCorpoClinico_1_2 = new JButton("Convênios");
        btnCorpoClinico_1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
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
        	Convenio.super.setVisible(false);
    		Home home = new Home();
            home.setVisible(true);
    		//OBJETIVO DESSE METODO É QUANDO CLICAR NO BOTAO, ELE IRA MUDAR DE TELA
            //NO EXEMPLO ACIMA, ELE ESTA FECHANDO A PAGINA QUE ESTA E INDO PARA A PAGINA INICIAL
    	}
    });
        getContentPane().add(btnCorpoClinico_1_3);
        
        JLabel lblNewLabel = new JLabel("\r\nConvênios\r\n");
        lblNewLabel.setForeground(new Color(0, 255, 64));
        lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN, 34));
        lblNewLabel.setBounds(47, 156, 108, 56);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("\r\n");
        lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/imagens/Convenios.jpg")));
        lblNewLabel_1.setBounds(249, 140, 411, 302);
        getContentPane().add(lblNewLabel_1);
        
        JTextPane txtpnAClnicaDesc = new JTextPane();
        txtpnAClnicaDesc.setText("A Clínica Desc dispôe de convênios com os seguintes planos de saúde:\r\n\r\nBradesco Saúde.\r\nAmil Saúde.\r\nUnimed.");
        txtpnAClnicaDesc.setFont(new Font("Agency FB", Font.PLAIN, 20));
        txtpnAClnicaDesc.setBackground(new Color(240, 240, 240));
        txtpnAClnicaDesc.setBounds(47, 223, 170, 219);
        getContentPane().add(txtpnAClnicaDesc);
        
	}
}
