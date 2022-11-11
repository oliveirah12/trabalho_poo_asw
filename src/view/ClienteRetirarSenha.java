package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ClienteRetirarSenha extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteRetirarSenha frame = new ClienteRetirarSenha();
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
	public ClienteRetirarSenha() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel.setBounds(149, 11, 371, 92);
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblSenha = new JLabel("Senha XX");
		sl_panel.putConstraint(SpringLayout.NORTH, lblSenha, 20, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblSenha, 45, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblSenha, -29, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblSenha, -52, SpringLayout.EAST, panel);
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblSenha);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JLabel lblTempoEstimado = new JLabel("Tempo estimado de espera");
		lblTempoEstimado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTempoEstimado.setBounds(225, 156, 214, 22);
		contentPane.add(lblTempoEstimado);
		
		JLabel lblTempo = new JLabel("XX minutos");
		lblTempo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTempo.setBounds(262, 189, 148, 37);
		contentPane.add(lblTempo);
		
		JButton btnRetirarSenha = new JButton("Retirar Senha");
		btnRetirarSenha.setFont(new Font("Tahoma", Font.PLAIN, 36));
		btnRetirarSenha.setBounds(77, 295, 503, 73);
		contentPane.add(btnRetirarSenha);
	}
}
