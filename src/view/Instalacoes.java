//SEMPRE QUANDO FOR CRIAR UMA TELA, COPIA TODAS AS LINHAS DESSE TELA DEFAULT E COLA NA TELA QUE IRÁ CRIAR
package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Objects;

public class Instalacoes extends JFrame {
	public Instalacoes() {
		
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
        		Instalacoes.super.setVisible(false);
        		Especialidades especialidades = new Especialidades();
        		especialidades.setVisible(true);
        	}
        });
        getContentPane().add(btnNewButton);
        
        JButton btnAgendamentos = new JButton("Agendamentos\r\n");
        btnAgendamentos.setForeground(new Color(0, 0, 0));
        btnAgendamentos.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnAgendamentos.setBackground(new Color(0, 255, 64));
        btnAgendamentos.setBounds(203, 7, 96, 27);
        btnAgendamentos.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
        		Instalacoes.super.setVisible(false);
        		Agendamentos agendamentos = new Agendamentos();
        		agendamentos.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnAgendamentos);
        
        JButton btnInstalacoes = new JButton("Instalações\r\n");
        btnInstalacoes.setForeground(new Color(0, 0, 0));
        btnInstalacoes.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnInstalacoes.setBackground(new Color(0, 255, 64));
        btnInstalacoes.setBounds(492, 7, 89, 27);
        getContentPane().add(btnInstalacoes);
        
        JButton btnCorpoClinico = new JButton("Corpo Clinico\r\n");
        btnCorpoClinico.setForeground(new Color(0, 0, 0));
        btnCorpoClinico.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico.setBackground(new Color(0, 255, 64));
        btnCorpoClinico.setBounds(101, 7, 96, 27);
        btnCorpoClinico.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
        		Instalacoes.super.setVisible(false);
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
        btnCorpoClinico_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
        		Instalacoes.super.setVisible(false);
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
        btnCorpoClinico_1_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
        		Instalacoes.super.setVisible(false);
        		Horarios horarios = new Horarios();
                horarios.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnCorpoClinico_1_1);
        
        JButton btnCorpoClinico_1_2 = new JButton("Convênios");
        btnCorpoClinico_1_2.setForeground(new Color(0, 0, 0));
        btnCorpoClinico_1_2.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1_2.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1_2.setBounds(386, 7, 96, 27);
        btnCorpoClinico_1_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
        		Instalacoes.super.setVisible(false);
        		Convenio convenio = new Convenio();
        		convenio.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnCorpoClinico_1_2);
        
        JEditorPane editorPane = new JEditorPane();
        editorPane.setBackground(new Color(0, 255, 128));
        editorPane.setBounds(0, 0, 684, 40);
        getContentPane().add(editorPane);
        
        //conteúdo
        JLabel lblNewLabel = new JLabel("Instalações");
        lblNewLabel.setForeground(new Color(0, 255, 64));
        lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN,34));
        lblNewLabel.setBounds(34, 80, 200, 41);
        getContentPane().add(lblNewLabel);
        
        JTextPane txtpnOsInstallsDe = new JTextPane();
        txtpnOsInstallsDe.setFont(new Font("Agency FB", Font.PLAIN, 18));
        txtpnOsInstallsDe.setBackground(new Color(240, 240, 240));
        txtpnOsInstallsDe.setText("A clínica dispôe de instalações modernas.\r\r 1 Recepção.\r 1 Sala de Espera.\r 1 Sala de Esterilização.\r 2 Consutórios Dentários.\r 1 Escritório");
        txtpnOsInstallsDe.setBounds(34, 140, 194, 204);
        getContentPane().add(txtpnOsInstallsDe);
 
        JTextPane txtpnOsEquipmDe = new JTextPane();
        txtpnOsEquipmDe.setFont(new Font("Agency FB", Font.PLAIN, 18));
        txtpnOsEquipmDe.setBackground(new Color(240, 240, 240));
        txtpnOsEquipmDe.setText("Equipamento técnico de destaque...\r\r RX.\r Clareamento a Led Laser.\r Câmara intra-oral.\r Ultrasom.");
        txtpnOsEquipmDe.setBounds(33, 342, 186, 158);
        getContentPane().add(txtpnOsEquipmDe);
        ImageIcon originalIcon = (new ImageIcon(getClass().getResource("/imagens/instalacoes.png")));
        Image image = originalIcon.getImage();
        Image resizedImage = image.getScaledInstance(315, 241, java.awt.Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        //fim conteúdo
        
        JButton btnCorpoClinico_1_3 = new JButton("Voltar Ao Inicio");
        btnCorpoClinico_1_3.setForeground(Color.BLACK);
        btnCorpoClinico_1_3.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1_3.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1_3.setBounds(285, 45, 114, 27);
        btnCorpoClinico_1_3.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
 
        	Instalacoes.super.setVisible(false);
    		Home home = new Home();
            home.setVisible(true);
    		
    	}
    });
        getContentPane().add(btnCorpoClinico_1_3);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/imagens/instalacoes.png")));
        lblNewLabel_1.setBounds(238, 104, 425, 362);
        getContentPane().add(lblNewLabel_1);
        
	}
}
