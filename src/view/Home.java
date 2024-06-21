package view;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {
	
    //TELA PRINCIPAL
	public Home() {
    	
		//CONFIGURAÇÃO DA TELA
    	getContentPane().setBackground(new Color(240, 240, 240));
        setVisible(true);
        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        //TITULO DA TELA E SUAS AS CONFIGURAÇÕES
        JLabel lblNewLabel = new JLabel("CLINICA DESC");
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN, 40));
        lblNewLabel.setForeground(new Color(0, 255, 64));
        lblNewLabel.setBounds(274, 214, 170, 34);
        getContentPane().add(lblNewLabel);
        
        //SUBTITULO DA TELA E SUAS AS CONFIGURAÇÕES
        JLabel lblNewLabel_1 = new JLabel("Seu Sorisso é Nossa Prioridade!");
        lblNewLabel_1.setFont(new Font("Agency FB", Font.PLAIN, 28));
        lblNewLabel_1.setForeground(new Color(0, 255, 64));
        lblNewLabel_1.setBounds(223, 276, 280, 27);
        getContentPane().add(lblNewLabel_1);
        
        //BOTAO DE ESPECIALIDADES E SUAS AS CONFIGURAÇÕES
        JButton btnNewButton = new JButton("Especialidades");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Home.super.setVisible(false);
        		Especialidades especialidades = new Especialidades();
        		especialidades.setVisible(true);
        	}
        });
        btnNewButton.setBackground(new Color(0, 255, 64));
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnNewButton.setBounds(0, 7, 96, 27);
        getContentPane().add(btnNewButton);
        
        //BOTAO DE AGENDAMENTOS E SUAS AS CONFIGURAÇÕES
        JButton btnAgendamentos = new JButton("Agendamentos\r\n");
        //ADICIONANDO O BOTAO AO EVENTO
        btnAgendamentos.addActionListener(new ActionListener() {
        	//CRIANDO UM METODO PUBLICO PARA O BOTAO EFETUAR O EVENTO
        	public void actionPerformed(ActionEvent e) {
        		//TELA ONDE ESTA O USUARIO, NO EXEMPLO É A TELA HOME
        		//COMANDO PRA ELA SUMIR APOS O CLIQUE
        		Home.super.setVisible(false);
        		//COLOCANDO O OBJ AGENDAMENTOS DENTRO DE UMA VARIAVEL QUE NO CASO É A OUTRA TELA
        		Agendamentos agendamentos = new Agendamentos();
        		//USANDO A VARIAVEL E HABILITANDO ELA PARA FICAR VISIVEL APOS FECHAR A JANELA ANTERIOR
        		agendamentos.setVisible(true);
        		
        		//OBJETIVO:METODO PRA NAVEGAÇÃO DE TELAS PELA AÇÃO DO BOTAO. ISSO COM TODOS OS OUTROS DA MESMA FORMA
        	}
        });
        btnAgendamentos.setForeground(new Color(0, 0, 0));
        btnAgendamentos.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnAgendamentos.setBackground(new Color(0, 255, 64));
        btnAgendamentos.setBounds(203, 7, 96, 27);
        getContentPane().add(btnAgendamentos);
        
        //BOTAO DE INSTALACOES E SUAS AS CONFIGURAÇÕES
        JButton btnInstalacoes = new JButton("Instalações\r\n");
        btnInstalacoes.setForeground(new Color(0, 0, 0));
        btnInstalacoes.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnInstalacoes.setBackground(new Color(0, 255, 64));
        btnInstalacoes.setBounds(492, 7, 89, 27);
        btnInstalacoes.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Home.super.setVisible(false);
        		Instalacoes instalacoes = new Instalacoes();
        		instalacoes.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnInstalacoes);
        
        //BOTAO DO CORPO CLINICO E SUAS AS CONFIGURAÇÕES
        JButton btnCorpoClinico = new JButton("Corpo Clinico\r\n");
        btnCorpoClinico.setForeground(new Color(0, 0, 0));
        btnCorpoClinico.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico.setBackground(new Color(0, 255, 64));
        btnCorpoClinico.setBounds(101, 7, 96, 27);
        btnCorpoClinico.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                Home.super.setVisible(false);
                CorpoClinico corpoclinico = new CorpoClinico();
                corpoclinico.setVisible(true);
            }
        });
        getContentPane().add(btnCorpoClinico);
        
        //BOTAO DE CONSULTAS E SUAS AS CONFIGURAÇÕES
        JButton btnCorpoClinico_1 = new JButton("Consultas\r\n");
        btnCorpoClinico_1.setForeground(new Color(0, 0, 0));
        btnCorpoClinico_1.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1.setBounds(299, 7, 84, 27);
        btnCorpoClinico_1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {

                Home.super.setVisible(false);
                Consultas consultas = new Consultas();
                consultas.setVisible(true);
            }
        });
        getContentPane().add(btnCorpoClinico_1);
        
        //BOTAO DE HORARIOS E SUAS AS CONFIGURAÇÕES
        JButton btnCorpoClinico_1_1 = new JButton("Horarios\r\n");
        btnCorpoClinico_1_1.setForeground(new Color(0, 0, 0));
        btnCorpoClinico_1_1.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1_1.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1_1.setBounds(588, 7, 96, 27);
        btnCorpoClinico_1_1.addActionListener(new ActionListener() {

           public void actionPerformed(ActionEvent e)
           {

               Home.super.setVisible(false);
               Horarios horarios = new Horarios();
               horarios.setVisible(true);
           }
       });
        
        getContentPane().add(btnCorpoClinico_1_1);
        
        //BOTAO DE CONVENIOS E SUAS AS CONFIGURAÇÕES
        JButton btnCorpoClinico_1_2 = new JButton("Convênios");
        btnCorpoClinico_1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
            {
                Home.super.setVisible(false);
                Convenio convenio = new Convenio();
                convenio.setVisible(true);
            }
        });
        btnCorpoClinico_1_2.setForeground(new Color(0, 0, 0));
        btnCorpoClinico_1_2.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1_2.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1_2.setBounds(386, 7, 96, 27);
        getContentPane().add(btnCorpoClinico_1_2);
        
        //PAINEL ONDE TODOS OS ELEMENTOS ESTAO
        JEditorPane editorPane = new JEditorPane();
        editorPane.setBackground(new Color(0, 255, 128));
        editorPane.setBounds(0, 0, 684, 40);
        getContentPane().add(editorPane);
        
        
    }
    public void setVisible(boolean b) {
        super.setVisible(b);
    }
}