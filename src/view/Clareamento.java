package view;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clareamento extends JFrame {
    public Clareamento() {
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
        		Clareamento.super.setVisible(false);
        		Especialidades especialidades = new Especialidades();
        		especialidades.setVisible(true);
        	}
        });
        getContentPane().add(btnNewButton);

        JButton btnAgendamentos = new JButton("Agendamentos");
        btnAgendamentos.setForeground(new Color(0, 0, 0));
        btnAgendamentos.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnAgendamentos.setBackground(new Color(0, 255, 64));
        btnAgendamentos.setBounds(203, 7, 96, 27);
        btnAgendamentos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Clareamento.super.setVisible(false);
        		Agendamentos agendamentos = new Agendamentos();
        		agendamentos.setVisible(true);
        	}
        });
        getContentPane().add(btnAgendamentos);

        JButton btnInstalacoes = new JButton("Instalações");
        btnInstalacoes.setForeground(new Color(0, 0, 0));
        btnInstalacoes.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnInstalacoes.setBackground(new Color(0, 255, 64));
        btnInstalacoes.setBounds(492, 7, 89, 27);
        btnInstalacoes.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Clareamento.super.setVisible(false);
        		Instalacoes instalacoes = new Instalacoes();
        		instalacoes.setVisible(true);
        	}
        });
        getContentPane().add(btnInstalacoes);

        JButton btnCorpoClinico = new JButton("Corpo Clinico");
        btnCorpoClinico.setForeground(new Color(0, 0, 0));
        btnCorpoClinico.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico.setBackground(new Color(0, 255, 64));
        btnCorpoClinico.setBounds(101, 7, 96, 27);
        btnCorpoClinico.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Clareamento.super.setVisible(false);
        		CorpoClinico corpoclinico = new CorpoClinico();
        		corpoclinico.setVisible(true);
        	}
        });
        getContentPane().add(btnCorpoClinico);

        JButton btnConsultas = new JButton("Consultas");
        btnConsultas.setForeground(new Color(0, 0, 0));
        btnConsultas.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnConsultas.setBackground(new Color(0, 255, 64));
        btnConsultas.setBounds(299, 7, 84, 27);
        btnConsultas.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Clareamento.super.setVisible(false);
        		Consultas consultas = new Consultas();
        		consultas.setVisible(true);
        	}
        });
        getContentPane().add(btnConsultas);

        JButton btnHorarios = new JButton("Horarios");
        btnHorarios.setForeground(new Color(0, 0, 0));
        btnHorarios.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnHorarios.setBackground(new Color(0, 255, 64));
        btnHorarios.setBounds(588, 7, 96, 27);
        btnHorarios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Clareamento.this.setVisible(false);
                Horarios horarios = new Horarios();
                horarios.setVisible(true);
            }
        });
        getContentPane().add(btnHorarios);

        JButton btnConvenios = new JButton("Convênios");
        btnConvenios.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Clareamento.super.setVisible(false);
        		Convenio convenio = new Convenio();
        		convenio.setVisible(true);
        	}
        });
        btnConvenios.setForeground(new Color(0, 0, 0));
        btnConvenios.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnConvenios.setBackground(new Color(0, 255, 64));
        btnConvenios.setBounds(386, 7, 96, 27);
        getContentPane().add(btnConvenios);

        JLabel lblEspecialidades = new JLabel("Clareamento");
        lblEspecialidades.setForeground(new Color(0, 255, 64));
        lblEspecialidades.setFont(new Font("Agency FB", Font.PLAIN, 36));
        lblEspecialidades.setBounds(33, 108, 179, 60);
        getContentPane().add(lblEspecialidades);

        JTextPane txtpnEspecialidade = new JTextPane();
        txtpnEspecialidade.setFont(new Font("Agency FB", Font.PLAIN, 18));
        txtpnEspecialidade.setBackground(new Color(240, 240, 240));
        txtpnEspecialidade.setText("Dentes mais brancos são possíveis graças aos tratamentos de clareamento. Existem várias técnicas de clareamento dentário, podendo ser realizados na clínica ou em casa através da aplicação de moldeiras de clareamento. Atualmente, para obter os melhores resultados,  podemos combinar as duas técnicas.\r\n\r\nEm qualquer dos casos, os tratamentos de clareamento devem ser precedidos de uma observação clínica, de forma a estabelecer a indicação ou contra-indicação deste tratamento; nem todos os tipos de manchas ou descolorações são reversíveis; nesses casos partimos para outras soluções estéticas.");
        txtpnEspecialidade.setBounds(33, 179, 295, 308);
        getContentPane().add(txtpnEspecialidade);

        JButton btnVoltarParaAsEspecialidades = new JButton("Voltar para as Especialidades");
        btnVoltarParaAsEspecialidades.setForeground(Color.BLACK);
        btnVoltarParaAsEspecialidades.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnVoltarParaAsEspecialidades.setBackground(new Color(0, 255, 64));
        btnVoltarParaAsEspecialidades.setBounds(273, 45, 159, 27);
        btnVoltarParaAsEspecialidades.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Clareamento.this.setVisible(false);
                Especialidades especialidades = new Especialidades();
                especialidades.setVisible(true);
            }
        });
        getContentPane().add(btnVoltarParaAsEspecialidades);
        
        JEditorPane editorPane = new JEditorPane();
        editorPane.setBackground(new Color(0, 255, 128));
        editorPane.setBounds(0, 0, 684, 40);
        getContentPane().add(editorPane);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/imagens/Clareamento.jpg")));
        lblNewLabel_1.setBounds(355, 154, 300, 282);
        getContentPane().add(lblNewLabel_1);
        
    }
}
