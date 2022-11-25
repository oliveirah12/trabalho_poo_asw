package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FuncionarioFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCargo;
	private JTextField textMatricula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncionarioFrame frame = new FuncionarioFrame();
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
	public FuncionarioFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(120, 92, 208, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textCargo = new JTextField();
		textCargo.setBounds(120, 123, 208, 20);
		contentPane.add(textCargo);
		textCargo.setColumns(10);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(120, 60, 208, 20);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(120, 189, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.setBounds(240, 189, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Matricula");
		lblNewLabel.setBounds(10, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 95, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cargo");
		lblNewLabel_2.setBounds(10, 126, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
