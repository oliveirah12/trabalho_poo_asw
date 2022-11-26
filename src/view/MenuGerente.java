package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.entidade.Funcionario;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuGerente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGerente frame = new MenuGerente();
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
	public MenuGerente(Funcionario f) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTelat = new JButton("Guiche");
		btnTelat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EntradaGuiche tela1 = new EntradaGuiche( f );
				tela1.setVisible(true);
			    dispose();
				
				
			}
		});
		btnTelat.setBounds(144, 116, 133, 23);
		contentPane.add(btnTelat);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(144, 150, 133, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(144, 182, 133, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Escolha  sua opcao");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(135, 37, 142, 41);
		contentPane.add(lblNewLabel);
	}
}
