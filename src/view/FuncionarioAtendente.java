package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Timer;
import java.sql.Date;

public class FuncionarioAtendente extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=275,349
	 */
	private final Date date = new Date(0L);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncionarioAtendente frame = new FuncionarioAtendente();
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
	public FuncionarioAtendente() {
		date.setMinutes(23);
		date.setHours(12);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 715, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCabecalho.setBounds(0, 0, 699, 85);
		contentPane.add(panelCabecalho);
		panelCabecalho.setLayout(null);
		
		JLabel lblAtendendo = new JLabel("Atendendo:");
		lblAtendendo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAtendendo.setBounds(10, 11, 83, 20);
		panelCabecalho.add(lblAtendendo);
		
		JCheckBox chckbxPreferencial = new JCheckBox("Preferencial");
		chckbxPreferencial.setEnabled(false);
		chckbxPreferencial.setBounds(98, 7, 97, 23);
		panelCabecalho.add(chckbxPreferencial);
		
		JCheckBox chckbxNormal = new JCheckBox("Normal");
		chckbxNormal.setEnabled(false);
		chckbxNormal.setSelected(true);
		chckbxNormal.setBounds(98, 33, 97, 23);
		panelCabecalho.add(chckbxNormal);
		
		JCheckBox chckbxServico1 = new JCheckBox("Servi\u00E7o 1");
		chckbxServico1.setEnabled(false);
		chckbxServico1.setBounds(220, 7, 97, 23);
		panelCabecalho.add(chckbxServico1);
		
		JCheckBox chckbxServico2 = new JCheckBox("Servi\u00E7o 2");
		chckbxServico2.setEnabled(false);
		chckbxServico2.setBounds(220, 33, 97, 23);
		panelCabecalho.add(chckbxServico2);
		
		JCheckBox chckbxServico3 = new JCheckBox("Servi\u00E7o 3");
		chckbxServico3.setEnabled(false);
		chckbxServico3.setBounds(220, 59, 97, 23);
		panelCabecalho.add(chckbxServico3);
		
		JButton btnFila = new JButton("Fila");
		btnFila.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFila.setBounds(613, 19, 76, 45);
		panelCabecalho.add(btnFila);
		
		JPanel panelInfos = new JPanel();
		panelInfos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelInfos.setBounds(0, 399, 699, 23);
		contentPane.add(panelInfos);
		panelInfos.setLayout(null);
		
		JLabel lblUsuario = new JLabel(" Usu\u00E1rio:");
		lblUsuario.setBounds(0, 0, 62, 23);
		panelInfos.add(lblUsuario);
		
		JLabel lblUsuarioBd = new JLabel("USUARIO");
		lblUsuarioBd.setBounds(65, 0, 91, 23);
		panelInfos.add(lblUsuarioBd);
		
		JLabel lblSeparador = new JLabel("|");
		lblSeparador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeparador.setBounds(163, 0, 16, 23);
		panelInfos.add(lblSeparador);
		
		JLabel lblSeparador2 = new JLabel("|");
		lblSeparador2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeparador2.setBounds(392, 0, 16, 23);
		panelInfos.add(lblSeparador2);
		
		JLabel lblGuiche = new JLabel("Guich\u00EA:");
		lblGuiche.setBounds(237, 0, 46, 23);
		panelInfos.add(lblGuiche);
		
		JLabel lblGuicheBd = new JLabel("1");
		lblGuicheBd.setBounds(316, 0, 46, 23);
		panelInfos.add(lblGuicheBd);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSenha.setBounds(84, 133, 60, 27);
		contentPane.add(lblSenha);
		
		JLabel lblSenhaBd = new JLabel("SENHABD");
		lblSenhaBd.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenhaBd.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblSenhaBd.setBounds(0, 213, 234, 49);
		contentPane.add(lblSenhaBd);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblStatus.setBounds(342, 133, 60, 27);
		contentPane.add(lblStatus);
		
		JLabel lblStatusBd = new JLabel("STATUS BD");
		lblStatusBd.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatusBd.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblStatusBd.setBounds(225, 213, 309, 49);
		contentPane.add(lblStatusBd);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFinalizar.setBounds(502, 300, 187, 49);
		contentPane.add(btnFinalizar);
		
		JButton btnAusente = new JButton("Ausente");
		btnAusente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAusente.setBounds(502, 246, 187, 49);
		contentPane.add(btnAusente);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIniciar.setBounds(502, 193, 187, 49);
		contentPane.add(btnIniciar);
		
		JButton btnChamar = new JButton("Chamar");
		btnChamar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnChamar.setBounds(502, 140, 92, 49);
		contentPane.add(btnChamar);
		
		JButton btnRepetir = new JButton("Repetir");
		btnRepetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRepetir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRepetir.setBounds(597, 140, 92, 49);
		contentPane.add(btnRepetir);
		
		JButton btnVoltar = new JButton("Sair");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FuncionarioLogin funcionarioLogin = new FuncionarioLogin();
				funcionarioLogin.setVisible(true);
				dispose();			
			}
		});
		btnVoltar.setBounds(10, 362, 61, 23);
		contentPane.add(btnVoltar);
	}
}
