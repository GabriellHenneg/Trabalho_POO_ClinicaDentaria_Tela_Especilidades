package view;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Especialidades extends JFrame {
    public Especialidades() {
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
        getContentPane().add(btnNewButton);
        
        JButton btnAgendamentos = new JButton("Agendamentos\r\n");
        btnAgendamentos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Especialidades.super.setVisible(false);
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
        		Especialidades.super.setVisible(false);
        		Instalacoes instalacoes = new Instalacoes();
        		instalacoes.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnInstalacoes);
        
        JButton btnCorpoClinico = new JButton("Corpo Clinico\r\n");
        btnCorpoClinico.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	Especialidades.super.setVisible(false);
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
        		
            	Especialidades.super.setVisible(false);
        		Consultas consultas = new Consultas();
                consultas.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnCorpoClinico_1);
        
        JButton btnCorpoClinico_1_1 = new JButton("Horarios\r\n");
        btnCorpoClinico_1_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	Especialidades.super.setVisible(false);
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
        		Especialidades.super.setVisible(false);
        		Convenio convenio = new Convenio();
        		convenio.setVisible(true);
        		
        	}
        });
        btnCorpoClinico_1_2.setForeground(new Color(0, 0, 0));
        btnCorpoClinico_1_2.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1_2.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1_2.setBounds(386, 7, 96, 27);
        getContentPane().add(btnCorpoClinico_1_2);
        

        JLabel lblEspecialidades = new JLabel("Especialidades");
        lblEspecialidades.setForeground(new Color(0, 255, 64));
        lblEspecialidades.setFont(new Font("Agency FB", Font.PLAIN, 34));
        lblEspecialidades.setBounds(33, 130, 147, 60);
        getContentPane().add(lblEspecialidades);

        JTextPane txtpnEspecialidade = new JTextPane();
        txtpnEspecialidade.setFont(new Font("Agency FB", Font.PLAIN, 18));
        txtpnEspecialidade.setBackground(new Color(240, 240, 240));
        txtpnEspecialidade.setText("A Clínica Dentária Desc dispõe da tecnologia mais avançada e dos melhores profissionais, que o acompanham desde o primeiro momento na clínica, fazendo com que a sua única preocupação seja o seu bem-estar.");
        txtpnEspecialidade.setBounds(33, 200, 200, 180);
        getContentPane().add(txtpnEspecialidade);

        // Positioning the buttons on the right side
        JButton btnOrtodontia = new JButton("Ortodontia");
        btnOrtodontia.setForeground(new Color(0, 0, 0));
        btnOrtodontia.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnOrtodontia.setBackground(new Color(0, 255, 64));
        btnOrtodontia.setBounds(33, 390, 120, 27);
        btnOrtodontia.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	Especialidades.super.setVisible(false);
        		Ortodontia ortodontia = new Ortodontia();
                ortodontia.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnOrtodontia);
        
        JButton btnImplantodontia = new JButton("Implantodontia");
        btnImplantodontia.setForeground(new Color(0, 0, 0));
        btnImplantodontia.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnImplantodontia.setBackground(new Color(0, 255, 64));
        btnImplantodontia.setBounds(33, 440, 120, 27);
        btnImplantodontia.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	Especialidades.super.setVisible(false);
        		Implantodontia implantodontia = new Implantodontia();
                implantodontia.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnImplantodontia);
        
        JButton btnProteseFixa = new JButton("Prótese Fixa");
        btnProteseFixa.setForeground(new Color(0, 0, 0));
        btnProteseFixa.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnProteseFixa.setBackground(new Color(0, 255, 64));
        btnProteseFixa.setBounds(180, 390, 120, 27);
        btnProteseFixa.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	Especialidades.super.setVisible(false);
            	ProteseFixa protesefixa = new ProteseFixa();
            	protesefixa.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnProteseFixa);
        
        JButton btnProteseRemovivel = new JButton("Prótese Removível");
        btnProteseRemovivel.setForeground(new Color(0, 0, 0));
        btnProteseRemovivel.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnProteseRemovivel.setBackground(new Color(0, 255, 64));
        btnProteseRemovivel.setBounds(180, 440, 120, 27);
        btnProteseRemovivel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	Especialidades.super.setVisible(false);
            	ProteseRemovivel proteseremovivel = new ProteseRemovivel();
            	proteseremovivel.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnProteseRemovivel);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/imagens/Especialidades.jpg")));
        lblNewLabel_1.setBounds(400, 125, 356, 261);
        getContentPane().add(lblNewLabel_1);

        JButton btnVoltarAoInicio = new JButton("Voltar Ao Inicio");
        btnVoltarAoInicio.setForeground(Color.BLACK);
        btnVoltarAoInicio.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnVoltarAoInicio.setBackground(new Color(0, 255, 64));
        btnVoltarAoInicio.setBounds(285, 45, 114, 27);
        btnVoltarAoInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Especialidades.this.setVisible(false);
                Home home = new Home();
                home.setVisible(true);
            }
        });
        getContentPane().add(btnVoltarAoInicio);
        
        JEditorPane editorPane = new JEditorPane();
        editorPane.setBackground(new Color(0, 255, 128));
        editorPane.setBounds(0, 0, 684, 40);
        getContentPane().add(editorPane);
        
        JButton btnClareamento = new JButton("Clareamento");
        btnClareamento.setForeground(Color.BLACK);
        btnClareamento.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnClareamento.setBackground(new Color(0, 255, 64));
        btnClareamento.setBounds(323, 390, 120, 27);
        btnClareamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Especialidades.this.setVisible(false);
                Clareamento clareamento = new Clareamento();
                clareamento.setVisible(true);
            }
        });
        getContentPane().add(btnClareamento);
        
        JButton btnOdontopediatria = new JButton("Odontopediatria");
        btnOdontopediatria.setForeground(Color.BLACK);
        btnOdontopediatria.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnOdontopediatria.setBackground(new Color(0, 255, 64));
        btnOdontopediatria.setBounds(323, 440, 120, 27);
        btnOdontopediatria.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Especialidades.this.setVisible(false);
                Odontopediatria odontopediatria = new Odontopediatria();
                odontopediatria.setVisible(true);
            }
        });
        getContentPane().add(btnOdontopediatria);
        
    }
}
