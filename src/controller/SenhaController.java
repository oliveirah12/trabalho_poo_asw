package controller;


import java.util.ArrayList;

import modelo.entidade.InformarSenha;
import modelo.entidade.Senha;
import modelo.service.GerarSenhaService;
import view.ClienteRetirarSenha;
import view.FuncionarioAtendente;

public class SenhaController {
	
private Senha senha ;
private ArrayList<String> listaSenha  = new ArrayList() ;
	
	
	   public Senha salvarSenha(ClienteRetirarSenha frame) {
		   
		     Senha senha = new Senha();
		    
		    senha.setPrioridade(frame.getPrioridade());
		    senha.setServico(frame.getServico());
		  
	        
		    GerarSenhaService service = new  GerarSenhaService();
	        
	        service.gerarSenha(senha);
	        return service.informarSenha();
		     }
	   
	   public  Senha chamarSenhap(FuncionarioAtendente frame) {
		   
		   
		   GerarSenhaService service = new  GerarSenhaService(); 	   
		return  service.chamarSenhap();   }
	   
	   
  public  void finalizaSenha(FuncionarioAtendente frame ,Senha id) {
		   
		   
		   GerarSenhaService service = new  GerarSenhaService(); 	   
	       service.finalizaSenha(id);  
	       
  }









}