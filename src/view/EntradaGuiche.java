package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GuicheController;
import controller.LoginController;
import modelo.entidade.Funcionario;
import modelo.entidade.Guiche;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import modelo.entidade.Funcionario;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntradaGuiche extends JFrame {

	private JPanel contentPane;
	private JButton btnVoltar;
	private JButton btnGuiche2;
	private JButton btnGuiche1;
	
	/**
	 * Launch the application.
	 */
//*	public static void main(String[] args) {
	//	EventQueue.invokeLater(new Runnable() {
	//		public void run() {
	//			try {
	//				EntradaGuiche frame = new EntradaGuiche();
	//				frame.setVisible(true);
	//			} catch (Exception e) {
	//				e.printStackTrace();
	//			}
	//		}
	//	});
//	}

	/**
	 * Create the frame.
	 */
	public EntradaGuiche(  Funcionario f_id  ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuiche3 = new JButton("Guiche 3");
		btnGuiche3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				Guiche g = new Guiche ();
				int ng = 3 ;
		
				
				 
			    GuicheController controller = new GuicheController();
				  
				g =  controller. entradaGuiche(EntradaGuiche.this,ng,f_id);
				
				FuncionarioAtendente funcionarioLogin = new FuncionarioAtendente(g);
				funcionarioLogin.setVisible(true);
				dispose();	
				
				
				
			}
		});
		btnGuiche3.setBounds(172, 179, 89, 23);
		contentPane.add(btnGuiche3);
		
		JLabel lblNewLabel = new JLabel("Informe o Guiche");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(144, 35, 146, 36);
		contentPane.add(lblNewLabel);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FuncionarioLogin funcionarioLogin = new FuncionarioLogin();
				funcionarioLogin.setVisible(true);
				dispose();			
				
				
				
			}
		});
		btnVoltar.setBounds(10, 227, 89, 23);
		contentPane.add(btnVoltar);
		
		btnGuiche2 = new JButton("Guiche 2");
		btnGuiche2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Guiche g = new Guiche ();
				int ng = 2 ;
		
				
				 
			    GuicheController controller = new GuicheController();
				  
				g =  controller. entradaGuiche(EntradaGuiche.this,ng,f_id);
				
				FuncionarioAtendente funcionarioLogin = new FuncionarioAtendente(g);
				funcionarioLogin.setVisible(true);
				dispose();		
				
				
				
				
				
				
				
			}
		});
		btnGuiche2.setBounds(172, 131, 89, 23);
		contentPane.add(btnGuiche2);
		
		btnGuiche1 = new JButton("Guiche 1");
		btnGuiche1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Guiche g = new Guiche ();
				int ng = 1 ;
		
				
				 
			    GuicheController controller = new GuicheController();
				  
				g =  controller. entradaGuiche(EntradaGuiche.this,ng,f_id);
				
				FuncionarioAtendente funcionarioLogin = new FuncionarioAtendente(g);
				funcionarioLogin.setVisible(true);
				dispose();		
				
				
				
				
			}
		});
		btnGuiche1.setBounds(172, 82, 89, 23);
		contentPane.add(btnGuiche1);
	}

	

	
	
	
	
	
	
	
	
}
