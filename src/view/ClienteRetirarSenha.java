package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import controller.FuncionarioController;
import controller.SenhaController;
import modelo.entidade.Senha;

import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ClienteRetirarSenha extends JFrame {

	private JPanel contentPane;
	private int servico ;
	private int prioridade ;
	private JTextField textSenha;
	private JTextField textPrioridade;
	private JTextField textHoraData;
    private  Senha s = new Senha ();
	private  int    n=0 ;



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
		
		JLabel lblTempoEstimado = new JLabel("Horario / Data");
		lblTempoEstimado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTempoEstimado.setBounds(267, 151, 112, 22);
		contentPane.add(lblTempoEstimado);
		
		JButton btnRetirarSenha = new JButton("Retirar Senha ");
		btnRetirarSenha.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	
			  n++;
		        	if (n == 1) {
		        		
					 SenhaController controller = new SenhaController();
			         s =   controller.salvarSenha(ClienteRetirarSenha.this);
			         textSenha.setText(String.valueOf (+ s.getNumero() ));
			         textPrioridade.setText(String.valueOf (+ s.getPrioridade() ));
			      
		        	}
	                	else {
			        	
			        	ClienteServicos tela1 = new ClienteServicos(); 
						tela1.setVisible(true);
						dispose();	    }
			        
			        
				      //   textPrioridade.setText(String.valueOf (+ s.getPrioridade() ));
				   //   textPrioridade.setText(String.valueOf (+ s.getPrioridade() ));
			      //   DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			       //  String dataFormatada = dateFormat.format(s.getHoraData());
			         
			      //   JOptionPane.showMessageDialog(null,"" + dataFormatada);
			         
			        
			         
			      //   textHoraData.setText( dataFormatada  );
}
		});
		btnRetirarSenha.setFont(new Font("Tahoma", Font.PLAIN, 36));
		btnRetirarSenha.setBounds(77, 295, 503, 73);
		contentPane.add(btnRetirarSenha);
		
		textSenha = new JTextField();
		textSenha.setEditable(false);
		textSenha.setBounds(303, 49, 124, 56);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		textSenha.setText(String.valueOf (+ s.getNumero() ));
		
		textPrioridade = new JTextField();
		textPrioridade.setEditable(false);
		textPrioridade.setBounds(213, 49, 86, 56);
		contentPane.add(textPrioridade);
		textPrioridade.setColumns(10);
		textPrioridade.setText(String.valueOf (+ s.getPrioridade() ));
		
		textHoraData = new JTextField();
		textHoraData.setEnabled(false);
		textHoraData.setBounds(183, 202, 295, 49);
		contentPane.add(textHoraData);
		textHoraData.setColumns(10);
		
		
		
		
	}

	public JTextField getTextSenha() {
		return textSenha;
	}

	public void setTextSenha(JTextField textSenha) {
		this.textSenha = textSenha;
	}
	
	public JTextField getTextPrioridade() {
		return textPrioridade;
	}

	public void setTextPrioridade(JTextField textPrioridade) {
		this.textPrioridade = textPrioridade;
	}

	public int getServico() {
		return servico;
	}

	public void setServico(int servico) {
		this.servico = servico;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public JTextField getTextHoraData() {
		return textHoraData;
	}

	public void setTextHoraData(JTextField textHoraData) {
		this.textHoraData = textHoraData;
	}
	
	
	
	
}
