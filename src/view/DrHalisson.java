package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrHalisson extends JFrame {
	public DrHalisson() {
		
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
        		DrHalisson.super.setVisible(false);
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
        		
        		DrHalisson.super.setVisible(false);
        		Agendamentos agendamentos = new Agendamentos();
        		agendamentos.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnAgendamentos);
        
        JButton btnInstalaes = new JButton("Instalações\r\n");
        btnInstalaes.setForeground(new Color(0, 0, 0));
        btnInstalaes.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnInstalaes.setBackground(new Color(0, 255, 64));
        btnInstalaes.setBounds(492, 7, 89, 27);
        btnInstalaes.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	DrHalisson.super.setVisible(false);
        		Instalacoes instalaes = new Instalacoes();
                instalaes.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnInstalaes);
        
        JButton btnCorpoClinico = new JButton("Corpo Clinico\r\n");
        btnCorpoClinico.setForeground(new Color(0, 0, 0));
        btnCorpoClinico.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico.setBackground(new Color(0, 255, 64));
        btnCorpoClinico.setBounds(101, 7, 96, 27);
        btnCorpoClinico.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
        		DrHalisson.super.setVisible(false);
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
        		
        		DrHalisson.super.setVisible(false);
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
        		
        		DrHalisson.super.setVisible(false);
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
        btnCorpoClinico_1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
            {
                DrHalisson.super.setVisible(false);
                Convenio convenio = new Convenio();
                convenio.setVisible(true);
            }
        });
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
        btnCorpoClinico_1_3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
    		
    		DrHalisson.super.setVisible(false);
    		Home home = new Home();
            home.setVisible(true);
    		
    	}
    });
        getContentPane().add(btnCorpoClinico_1_3);
        
        JLabel lblNewLabel = new JLabel("Dr Halisson Desc\r\n");
        lblNewLabel.setForeground(new Color(0, 255, 0));
        lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN, 34));
        lblNewLabel.setBounds(40, 128, 157, 54);
        getContentPane().add(lblNewLabel);
        
        JTextPane txtpnCirurgiodentistaOrtodontistaCrodf = new JTextPane();
        txtpnCirurgiodentistaOrtodontistaCrodf.setBackground(new Color(240, 240, 240));
        txtpnCirurgiodentistaOrtodontistaCrodf.setFont(new Font("Agency FB", Font.PLAIN, 18));
        txtpnCirurgiodentistaOrtodontistaCrodf.setForeground(new Color(0, 0, 0));
        txtpnCirurgiodentistaOrtodontistaCrodf.setText("Cirurgião-Dentista\r\n\r\nCRO- DF 6420");
        txtpnCirurgiodentistaOrtodontistaCrodf.setBounds(40, 193, 138, 141);
        getContentPane().add(txtpnCirurgiodentistaOrtodontistaCrodf);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jhona\\IdeaProjects\\ProjetoDentista\\src\\view\\usuario padrao.png"));
        lblNewLabel_1.setBounds(333, 128, 293, 240);
        getContentPane().add(lblNewLabel_1);
        
        JButton btnDrEdsonDesc = new JButton("Dr. Edson Desc\r\n");
        btnDrEdsonDesc.setForeground(Color.BLACK);
        btnDrEdsonDesc.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnDrEdsonDesc.setBackground(new Color(0, 255, 64));
        btnDrEdsonDesc.setBounds(40, 345, 109, 27);
        btnDrEdsonDesc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	DrHalisson.super.setVisible(false);
        		DrEdson dredson = new DrEdson();
                dredson.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnDrEdsonDesc);
        
       
        JButton btnDraPriscilaDesc = new JButton("Dra. Priscila Desc");
        btnDraPriscilaDesc.setForeground(Color.BLACK);
        btnDraPriscilaDesc.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnDraPriscilaDesc.setBackground(new Color(0, 255, 64));
        btnDraPriscilaDesc.setBounds(40, 383, 121, 27);
        btnDraPriscilaDesc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	DrHalisson.super.setVisible(false);
            	DraPriscila drapriscila = new DraPriscila();
            	drapriscila.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnDraPriscilaDesc);

	}
}
