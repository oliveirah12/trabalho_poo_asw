package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientePrioridade extends JFrame {
	
	//gfdgfdghfjhfgttfsdkdnkjsdngskjgsgnd

	private JPanel contentPane;
	private int servico ;
	private int prioridade ;
	

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

	/**
	 * Launch the application.
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientePrioridade frame = new ClientePrioridade();
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
	public ClientePrioridade() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaPrioridade = new JLabel("Selecione a Prioridade");
		lblEscolhaPrioridade.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEscolhaPrioridade.setBounds(182, 11, 295, 37);
		contentPane.add(lblEscolhaPrioridade);
		
		JLabel lblLinha = new JLabel("________________________________________________________________________________________");
		lblLinha.setBounds(77, 44, 528, 14);
		contentPane.add(lblLinha);
		
		JButton btnPreferencial = new JButton("Preferencial");
		btnPreferencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteRetirarSenha clienteRetirarSenha = new ClienteRetirarSenha();
				
				 prioridade =1 ;
					
				clienteRetirarSenha.setPrioridade(prioridade);
				clienteRetirarSenha.setServico(servico);
				clienteRetirarSenha.setVisible(true);
				dispose();
			}
		});
		btnPreferencial.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnPreferencial.setBounds(196, 128, 252, 68);
		contentPane.add(btnPreferencial);
		
		JButton btnNormal = new JButton("Normal");
		btnNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteRetirarSenha clienteRetirarSenha = new ClienteRetirarSenha();
				prioridade =0;			
				clienteRetirarSenha.setPrioridade(prioridade);
				clienteRetirarSenha.setServico(servico);	
				clienteRetirarSenha.setVisible(true);
		dispose();	
				
				
			}
		});
		btnNormal.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNormal.setBounds(196, 240, 252, 68);
		contentPane.add(btnNormal);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteServicos clienteServicos = new ClienteServicos();
				clienteServicos.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(32, 348, 81, 23);
		contentPane.add(btnVoltar);
	
	}

}
