package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import controller.SenhaController;
import modelo.entidade.Guiche;
import modelo.entidade.Senha;

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
import javax.swing.JTextField;

public class FuncionarioAtendente extends JFrame {

	private JPanel contentPane;
	private JTextField textSenha;
	private JTextField textStatus;
	private  Senha s = new Senha ();

	/**
	 * Launch the application.
	 */
//**	public static void main(String[] args) {
//	*	EventQueue.invokeLater(new Runnable() {
//	*		public void run() {
//	*			try {
//	*				FuncionarioAtendente frame = new FuncionarioAtendente();
//	*				frame.setVisible(true);
//	*			} catch (Exception e) {
//	*				e.printStackTrace();
//				}
//			}
//		});
//	}  
//   */

	/**
	 * Create the frame.
	 */
	public FuncionarioAtendente(  Guiche   guiche   ) {
		setTitle("Atendimento");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 715, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCabecalho.setBounds(0, 0, 699, 35);
		contentPane.add(panelCabecalho);
		panelCabecalho.setLayout(null);
		
		JLabel lblAtendendo = new JLabel("Atendendo:");
		lblAtendendo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAtendendo.setBounds(10, 11, 83, 20);
		panelCabecalho.add(lblAtendendo);
		
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
		
		JLabel lblHora = new JLabel("HH:mm:ss");
		lblHora.setBounds(414, 4, 62, 14);
		panelInfos.add(lblHora);
		
		JLabel lblSenha = new JLabel("Senha  :");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSenha.setBounds(10, 62, 92, 27);
		contentPane.add(lblSenha);
		
		JLabel lblStatus = new JLabel("Status :");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblStatus.setBounds(10, 148, 75, 27);
		contentPane.add(lblStatus);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				 SenhaController controller = new SenhaController();
		         controller.finalizaSenha(FuncionarioAtendente.this , s );
				
				
				
				
				
			}
		});
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
		btnChamar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				 SenhaController controller = new SenhaController();
				
		         s =   controller.chamarSenha(FuncionarioAtendente.this  ,guiche  );	
		       
		         textSenha.setText(String.valueOf (+ s.getNumero() ));
		         textStatus.setText(String.valueOf (+ s.getPrioridade() ));		
				
			}
		});
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
		
		JLabel lblChamada = new JLabel("Chamada:");
		lblChamada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblChamada.setBounds(97, 373, 53, 15);
		contentPane.add(lblChamada);
		
		JLabel lblHoraChamada = new JLabel("HH:mm");
		lblHoraChamada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHoraChamada.setBounds(155, 373, 60, 15);
		contentPane.add(lblHoraChamada);
		
		JLabel lblIncio = new JLabel("In\u00EDcio:");
		lblIncio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIncio.setBounds(225, 371, 32, 15);
		contentPane.add(lblIncio);
		
		JLabel lblHoraChamada_1 = new JLabel("HH:mm");
		lblHoraChamada_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHoraChamada_1.setBounds(263, 371, 60, 17);
		contentPane.add(lblHoraChamada_1);
		
		JLabel lblTermino = new JLabel("T\u00E9rmino:");
		lblTermino.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTermino.setBounds(333, 371, 49, 15);
		contentPane.add(lblTermino);
		
		JLabel lblHoraTermino = new JLabel("HH:mm");
		lblHoraTermino.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHoraTermino.setBounds(386, 371, 60, 17);
		contentPane.add(lblHoraTermino);
		
		JLabel lblTempoAtendimento = new JLabel("Tempo de Atendimento");
		lblTempoAtendimento.setBounds(541, 360, 111, 14);
		contentPane.add(lblTempoAtendimento);
		
		JLabel lblTempo = new JLabel("HH:mm:ss");
		lblTempo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTempo.setBounds(575, 374, 60, 14);
		contentPane.add(lblTempo);
		
		textSenha = new JTextField();
		textSenha.setBounds(102, 70, 113, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		
		textStatus = new JTextField();
		textStatus.setBounds(95, 156, 120, 20);
		contentPane.add(textStatus);
		textStatus.setColumns(10);
	}
}
