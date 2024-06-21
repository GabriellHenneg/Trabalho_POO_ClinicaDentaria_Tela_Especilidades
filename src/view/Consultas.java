//SEMPRE QUANDO FOR CRIAR UMA TELA, COPIA TODAS AS LINHAS DESSE TELA DEFAULT E COLA NA TELA QUE IRÁ CRIAR
package view;

import javax.swing.*;

import negocio.Registro;
import persistencia.ControlaCadastro;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class Consultas extends JFrame {
	private JTable tblRegistro;
	ControlaCadastro r = new ControlaCadastro();
	
	public Consultas(java.awt.Frame parent, boolean modal,ControlaCadastro r) {
		this.r = r;
		exibeInformacoes();
	}
	
	private void exibeInformacoes() {
		ArrayList<Registro> registro = r.retornartodos();
		
		//limpar JTable
		
		for(int i = 0; i < 500; i++) {
			tblRegistro.setValueAt("", i, 0);
			tblRegistro.setValueAt("", i, 1);
			tblRegistro.setValueAt("", i, 2);
			tblRegistro.setValueAt("", i, 3);
		}
		
		for (int i = 0; i < registro.size(); i++) {
			tblRegistro.setValueAt(registro.get(i).getNome(), i, 0);
			tblRegistro.setValueAt(registro.get(i).getTelefone(), i, 1);
			tblRegistro.setValueAt(registro.get(i).getData(), i, 2);
			tblRegistro.setValueAt(registro.get(i).getHora(), i, 3);
		}
	}
	
	public Consultas() {
		
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
        		Consultas.super.setVisible(false);
        		Especialidades especialidades = new Especialidades();
        		especialidades.setVisible(true);
        	}
        });
        getContentPane().add(btnNewButton);
        
        JButton btnAgendamentos = new JButton("Agendamentos\r\n");
        btnAgendamentos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Consultas.super.setVisible(false);
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
        		Consultas.super.setVisible(false);
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
                Consultas.super.setVisible(false);
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
        getContentPane().add(btnCorpoClinico_1);
        
        JButton btnCorpoClinico_1_1 = new JButton("Horarios\r\n");
        btnCorpoClinico_1_1.setForeground(new Color(0, 0, 0));
        btnCorpoClinico_1_1.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico_1_1.setBackground(new Color(0, 255, 64));
        btnCorpoClinico_1_1.setBounds(588, 7, 96, 27);
        btnCorpoClinico_1_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
        		Consultas.super.setVisible(false);
        		Especialidades especialidades = new Especialidades();
        		especialidades.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnCorpoClinico_1_1);
        
        JButton btnCorpoClinico_1_2 = new JButton("Convênios");
        btnCorpoClinico_1_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
        		Consultas.super.setVisible(false);
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
        	Consultas.super.setVisible(false);
    		Home home = new Home();
            home.setVisible(true);
    		//OBJETIVO DESSE METODO É QUANDO CLICAR NO BOTAO, ELE IRA MUDAR DE TELA
            //NO EXEMPLO ACIMA, ELE ESTA FECHANDO A PAGINA QUE ESTA E INDO PARA A PAGINA INICIAL
    	}
    });
        getContentPane().add(btnCorpoClinico_1_3);
        
        JButton btnNewButton_1 = new JButton("Voltar ao Agendamentos");
        btnNewButton_1.setBackground(new Color(230, 230, 230));
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Consultas.super.setVisible(false);
        		Agendamentos agendamentos = new Agendamentos();
        		agendamentos.setVisible(true);
        	}
        });
        btnNewButton_1.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnNewButton_1.setBounds(537, 477, 137, 23);
        getContentPane().add(btnNewButton_1);
        
        tblRegistro = new JTable();
        tblRegistro.setBorder(new LineBorder(new Color(0, 0, 0)));
        tblRegistro.setFont(new Font("Agency FB", Font.PLAIN, 12));
        tblRegistro.setToolTipText("");
        tblRegistro.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        	},
        	new String[] {
        		"Nome", "Telefone", "Data", "Hora"
        	}
        ) {
        	boolean[] columnEditables = new boolean[] {
        		false, true, true, true
        	};
        	public boolean isCellEditable(int row, int column) {
        		return columnEditables[column];
        	}
        });
        tblRegistro.setBounds(163, 140, 361, 283);
        getContentPane().add(tblRegistro);
        
        JLabel lblNewLabel = new JLabel("NOME:");
        lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN, 24));
        lblNewLabel.setBounds(185, 113, 45, 27);
        getContentPane().add(lblNewLabel);
        
        JLabel lblTelefone = new JLabel("TELEFONE:");
        lblTelefone.setFont(new Font("Agency FB", Font.PLAIN, 24));
        lblTelefone.setBounds(261, 113, 76, 27);
        getContentPane().add(lblTelefone);
        
        JLabel lblData = new JLabel("DATA:\r\n");
        lblData.setFont(new Font("Agency FB", Font.PLAIN, 24));
        lblData.setBounds(366, 113, 45, 27);
        getContentPane().add(lblData);
        
        JLabel lblHora = new JLabel("HORA:");
        lblHora.setFont(new Font("Agency FB", Font.PLAIN, 24));
        lblHora.setBounds(455, 113, 45, 27);
        getContentPane().add(lblHora);
        
	}
}
