package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import controller.FuncionarioController;
import controller.GuicheController;
import controller.SenhaController;
import modelo.entidade.ControleAtendente;
import modelo.entidade.Funcionario;
import modelo.entidade.Guiche;
import modelo.entidade.Senha;

import java.awt.Color;
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
	private JTextField txtGuiche;
	private JTextField textUsuario;
	private JTextField txtHoraData;
	private JTextField textSer1;
	private JTextField textSer2;
	private JTextField textSer3;
	private int prioridade = 0 ;
	private int fluxoAtendimento = 0  ;

	/*
	
	  Launch the application.
		public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			
			
			try {
				FuncionarioAtendente frame = new FuncionarioAtendente( );
		    	frame.setVisible(true);
	           } catch (Exception e) {
	  			e.printStackTrace();
			}
		}
	});
	}  
	*/
  

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
		lblAtendendo.setBounds(12, 9, 83, 20);
		panelCabecalho.add(lblAtendendo);
		
		 
		/*  nome servicos guiche */
		Guiche g = new Guiche ();
		
		 GuicheController controller = new GuicheController();
         g =  controller.servicoNome(guiche );	
		
		
		textSer1 = new JTextField();
		textSer1.setEditable(false);
		textSer1.setBounds(105, 11, 184, 20);
		panelCabecalho.add(textSer1);
		textSer1.setColumns(10);
		textSer1.setText(  g. getnServico1());
	
		
		
		textSer2 = new JTextField();
		textSer2.setEditable(false);
		textSer2.setBounds(299, 11, 199, 20);
		panelCabecalho.add(textSer2);
		textSer2.setColumns(10);
		textSer2.setText(  g. getnServico2());
		
		
			
		
		textSer3 = new JTextField();
		textSer3.setEditable(false);
		textSer3.setBounds(508, 13, 181, 20);
		panelCabecalho.add(textSer3);
		textSer3.setColumns(10);
		textSer3.setText(  g. getnServico3());
		
		 
		  
		JPanel panelInfos = new JPanel();
		panelInfos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelInfos.setBounds(0, 399, 699, 23);
		contentPane.add(panelInfos);
		panelInfos.setLayout(null);
		
		JLabel lblUsuario = new JLabel(" Usu\u00E1rio:");
		lblUsuario.setBounds(0, 0, 62, 23);
		panelInfos.add(lblUsuario);
		
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
		
		txtGuiche = new JTextField();
		txtGuiche.setEditable(false);
		txtGuiche.setBounds(280, 1, 86, 20);
		panelInfos.add(txtGuiche);
		txtGuiche.setColumns(10);
		
		txtGuiche.setText(  String.valueOf (+guiche.getNumeroGuiche()));
		
		
		
		textUsuario = new JTextField();
		textUsuario.setEditable(false);
		textUsuario.setBounds(55, 1, 86, 20);
		panelInfos.add(textUsuario);
		textUsuario.setColumns(10);
		
		Funcionario f = new Funcionario ();
		f.setMatricula(guiche.getFuncinarioGuiche());
		
		FuncionarioController controlle = new FuncionarioController();
        f= controlle.pesquisar( f );
        textUsuario.setText(   f.getNome()) ;
		
		
		txtHoraData = new JTextField();
		txtHoraData.setEditable(false);
		txtHoraData.setBounds(423, 1, 173, 20);
		panelInfos.add(txtHoraData);
		txtHoraData.setColumns(10);
		
	/*	Date data = new Date (10);
		txtHoraData.setText(String.valueOf (data ));	*/
		
		JLabel lblSenha = new JLabel("Senha  :");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSenha.setBounds(42, 110, 92, 27);
		contentPane.add(lblSenha);
		
		JLabel lblStatus = new JLabel("Prioridade :");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblStatus.setBounds(10, 64, 134, 27);
		contentPane.add(lblStatus);
		
		/*botao finalizar*/
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(fluxoAtendimento == 2 &&  s.getNumero() != 0 ) {
				 ControleAtendente at = new  ControleAtendente();
				 at. setStatus("finalizada");
				 at.setHorario("chamada_final");
				 SenhaController controller = new SenhaController();
		         controller.status_hora(FuncionarioAtendente.this , s ,at);	
		         fluxoAtendimento =0 ;
				}else {JOptionPane.showMessageDialog(null,"senha  "+s.getNumero()+" nao inicializada ou ausente");}	}
		});
		btnFinalizar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFinalizar.setBounds(502, 300, 187, 49);
		contentPane.add(btnFinalizar);
		
		JButton btnAusente = new JButton("Ausente");
		btnAusente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(fluxoAtendimento == 2 &&  s.getNumero() != 0 ) {
				 ControleAtendente at = new  ControleAtendente();
				 at. setStatus("ausente");
				 at.setHorario("chamada_final");
				 SenhaController controller = new SenhaController();
		         controller.status_hora(FuncionarioAtendente.this , s ,at);	
		         fluxoAtendimento =0 ;
				}else {JOptionPane.showMessageDialog(null,"senha  " +s.getNumero()+ " nao inicializada ou finalizada " );} }
		});
		btnAusente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAusente.setBounds(502, 246, 187, 49);
		contentPane.add(btnAusente);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(fluxoAtendimento == 1 &&  s.getNumero() != 0 ) {
				 ControleAtendente at = new  ControleAtendente();
				 at. setStatus("iniciou");
				 at.setHorario("chamada_inicio");
				 SenhaController controller = new SenhaController();
		         controller.status_hora(FuncionarioAtendente.this , s ,at);	
		         fluxoAtendimento ++ ;
				}else {JOptionPane.showMessageDialog(null," nenhuma senha ");}}
		});
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIniciar.setBounds(502, 193, 187, 49);
		contentPane.add(btnIniciar);
		
		/* botao Chamar*/
		
		JButton btnChamar = new JButton("Chamar");
		btnChamar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (fluxoAtendimento == 0 || s.getNumero() == 0 ) {
				 SenhaController controller = new SenhaController();
		         s =   controller.chamarSenha(FuncionarioAtendente.this , guiche , prioridade );
		         textSenha.setText(String.valueOf (+ s.getNumero() ));
		         textStatus.setText(String.valueOf (+ s.getPrioridade() ));		
		         
		         if ( s.getPrioridade()  ==  1    ) {  prioridade++ ;
		         }else { prioridade = 0 ;                   }       
		         
		         fluxoAtendimento ++ ;
			}else { JOptionPane.showMessageDialog(null,"senha sem ser finalizada ");
				
        	  }}
		});
		btnChamar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnChamar.setBounds(502, 140, 92, 49);
		contentPane.add(btnChamar);
		
		JButton btnRepetir = new JButton("Repetir");
		btnRepetir.setEnabled(false);
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
		textSenha.setEditable(false);
		textSenha.setBounds(156, 118, 113, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		
		textStatus = new JTextField();
		textStatus.setEditable(false);
		textStatus.setBounds(154, 72, 61, 20);
		contentPane.add(textStatus);
		textStatus.setColumns(10);
	}
}
