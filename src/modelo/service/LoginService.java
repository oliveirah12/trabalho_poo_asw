package modelo.service;


import javax.swing.JOptionPane;

import modelo.dao.FuncionarioDao;
import modelo.dao.LoginDao;
import modelo.entidade.Funcionario;

public class LoginService {
	
	
	private LoginDao dao;

    public LoginService() {
        this.dao = new LoginDao();
    }
    
    public void login(Funcionario calculo) {
    dao.login(calculo);
    }
    
    
    
    
    
    
    
    
    

}





