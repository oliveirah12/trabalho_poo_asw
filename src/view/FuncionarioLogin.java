package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.LoginController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import modelo.entidade.Funcionario;
import javax.swing.JPasswordField;

public class FuncionarioLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField passwordSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncionarioLogin frame = new FuncionarioLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FuncionarioLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("S.T.O.P");
		lblLogo.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblLogo.setBounds(73, 11, 140, 51);
		contentPane.add(lblLogo);
		
		JLabel lblLinha = new JLabel("_________________________________");
		lblLinha.setBounds(43, 48, 198, 14);
		contentPane.add(lblLinha);
		
		JLabel lblLogin = new JLabel("Nome");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogin.setBounds(43, 135, 44, 17);
		contentPane.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(43, 155, 198, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Senha");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMatricula.setBounds(43, 205, 71, 17);
		contentPane.add(lblMatricula);
		
		JButton btnLogin = new JButton("Entrar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
			
				
				
		 login ();	
				
			}
		});
		btnLogin.setBounds(162, 288, 79, 23);
		contentPane.add(btnLogin);
	
		JButton btnCancelar = new JButton("Sair");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnCancelar.setBounds(43, 288, 79, 23);
		contentPane.add(btnCancelar);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(43, 233, 198, 20);
		contentPane.add(passwordSenha);
	}
	
	private void login () {
	
	      
		   LoginController controller = new LoginController();
		   Funcionario  f  =   controller.login(FuncionarioLogin.this);
		    	
//	   JOptionPane.showMessageDialog(null," "+ f.getCargo() );	
		   
		if(f.getCargo().equals("adm") || f.getCargo().equals("atendente")) {	
			
			
      
		switch (f.getCargo()){	
				case "adm" :
					MenuGerente tela0 = new MenuGerente();
					tela0.setVisible(true);
				dispose();
					break ;	
					
				case "atendente":
					FuncionarioAtendente tela1 = new FuncionarioAtendente();
					tela1.setVisible(true);
				dispose();
					break ;	
					
				
		}}
		
	    else { JOptionPane.showMessageDialog(null,"falha ao localizar funcionario"); 
	    
	   }
	}
		
	

	public JTextField getTxtLogin() {
		return txtLogin;
	}

	public void setTxtLogin(JTextField txtLogin) {
		this.txtLogin = txtLogin;
	}

	public JPasswordField getPasswordSenha() {
		return passwordSenha;
	}

	public void setPasswordSenha(JPasswordField passwordSenha) {
		this.passwordSenha = passwordSenha;
	}

	
}
