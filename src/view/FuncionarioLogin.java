package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FuncionarioLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogin.setBounds(43, 135, 44, 17);
		contentPane.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(43, 155, 198, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMatricula.setBounds(43, 205, 71, 17);
		contentPane.add(lblMatricula);
		
		textField_1 = new JTextField();
		textField_1.setBounds(43, 225, 198, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				//Código para fazer o login e conectar com banco
				
				FuncionarioAtendente funcionarioAtendente = new FuncionarioAtendente();
				funcionarioAtendente.setVisible(true);
				dispose();
				
			}
		});
		btnEntrar.setBounds(162, 288, 79, 23);
		contentPane.add(btnEntrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnSair.setBounds(43, 288, 79, 23);
		contentPane.add(btnSair);
	}
}
