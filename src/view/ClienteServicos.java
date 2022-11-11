package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.SpringLayout;
import java.awt.Component;
import java.awt.Canvas;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteServicos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteServicos frame = new ClienteServicos();
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
	public ClienteServicos() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaServicos = new JLabel("Selecione o Servi\u00E7o");
		lblEscolhaServicos.setBounds(203, 11, 256, 37);
		lblEscolhaServicos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblEscolhaServicos);
		
		JLabel lblLinha = new JLabel("________________________________________________________________________________________");
		lblLinha.setBounds(54, 42, 528, 14);
		contentPane.add(lblLinha);
		
		JButton btnServico1 = new JButton("Servi\u00E7o 1");
		btnServico1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientePrioridade clientePrioridade = new ClientePrioridade();
				clientePrioridade.setVisible(true);
				dispose();
			}
		});
		btnServico1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnServico1.setBounds(228, 94, 199, 57);
		contentPane.add(btnServico1);
		
		JButton btnServico2 = new JButton("Servi\u00E7o 2");
		btnServico2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnServico2.setBounds(228, 163, 199, 57);
		contentPane.add(btnServico2);
		
		JButton btnServico3 = new JButton("Servi\u00E7o 3");
		btnServico3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnServico3.setBounds(228, 231, 199, 57);
		contentPane.add(btnServico3);
	}
}
