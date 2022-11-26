package modelo.service;

import java.util.ArrayList;

import modelo.dao.SenhaDao;
import modelo.dao.LoginDao;
import modelo.entidade.ControleAtendente;
import modelo.entidade.Funcionario;
import modelo.entidade.Guiche;
import modelo.entidade.Senha;
import modelo.entidade.Servico;

public class SenhaService {
	
	
	private SenhaDao  dao;

    public SenhaService() {
        this.dao = new SenhaDao ();
    }
    
    public void gerarSenha(Senha calculo) {
    dao.gerarSenha(calculo);
    }
	
    public Senha informarSenha() {
        
		return  dao.informarSenha() ;
	
    }
        
 public Senha chamarSenha(Senha s) {
        
		return  dao.chamarSenha(s) ;
	
    }
 
 public void status_hora(Senha calculo,ControleAtendente at) {
	    dao.status_hora(calculo,at);
     }

}
