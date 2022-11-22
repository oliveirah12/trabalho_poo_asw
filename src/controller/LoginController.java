package controller;


import java.sql.ResultSet;

import javax.swing.JOptionPane;


import modelo.dao.LoginDao;
import modelo.entidade.Funcionario;
import modelo.service.FuncionarioService;
import modelo.service.LoginService;
import view.FuncionarioLogin;


public class LoginController {
	
	private Funcionario  funcionario ;
	
	public Funcionario login (FuncionarioLogin frame ) {
		
		Funcionario funcionario = new Funcionario();
	
		
		
		funcionario.setNome(frame.getTxtLogin().getText());
	    funcionario.setSenha(frame.getPasswordSenha().getText());
	    
	   
	    	 LoginService login =  new LoginService();
	  return       login.login(funcionario);
	         	

}}
