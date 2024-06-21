package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Horarios extends JFrame {
	public Horarios() {
		
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
        		Horarios.super.setVisible(false);
        		Especialidades especialidades = new Especialidades();
        		especialidades.setVisible(true);
        	}
        });
        getContentPane().add(btnNewButton);
        
        JButton btnAgendamentos = new JButton("Agendamentos\r\n");
        btnAgendamentos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Horarios.super.setVisible(false);
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
        		Horarios.super.setVisible(false);
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
        btnCorpoClinico.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
        		Horarios.super.setVisible(false);
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

                Horarios.super.setVisible(false);
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
        getContentPane().add(btnCorpoClinico_1_1);
        
        JButton btnCorpoClinico_1_2 = new JButton("Convênios");
        btnCorpoClinico_1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
            {
                Horarios.super.setVisible(false);
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
        
        JLabel lblNewLabel = new JLabel("Horários");
        lblNewLabel.setForeground(new Color(0, 255, 64));
        lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN, 34));
        lblNewLabel.setBounds(34, 119, 87, 41);
        getContentPane().add(lblNewLabel);
        
        JTextPane txtpnOsHorriosDe = new JTextPane();
        txtpnOsHorriosDe.setFont(new Font("Agency FB", Font.PLAIN, 18));
        txtpnOsHorriosDe.setBackground(new Color(240, 240, 240));
        txtpnOsHorriosDe.setText("Os horários de abertura ao público são os seguintes:\r\n\r\nSegunda a Sexta:\r\n\tManhã 8hs - 12hs\r\n\t\r\n\tTarde 14hs - 18 hs\r\nSabados:\r\n\t8hs - 12hs");
        txtpnOsHorriosDe.setBounds(34, 205, 194, 204);
        getContentPane().add(txtpnOsHorriosDe);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/imagens/Horarios.jpg")));
        lblNewLabel_1.setBounds(277, 136, 363, 318);
        getContentPane().add(lblNewLabel_1);
        
        
        JButton btnCorpoClinico_1_3 = new JButton("Voltar Ao Inicio");
        btnCorpoClinico_1_3.setForeground(Color.BLACK);
        btnCorpoClinico_1_3.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1_3.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1_3.setBounds(285, 45, 114, 27);
        btnCorpoClinico_1_3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
    		
    		Horarios.super.setVisible(false);
    		Home home = new Home();
            home.setVisible(true);
    		
    	}
    });
        getContentPane().add(btnCorpoClinico_1_3);
        
	}
}
