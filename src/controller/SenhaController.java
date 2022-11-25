package controller;


import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.entidade.Guiche;
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
	   
	   public  Senha chamarSenha(FuncionarioAtendente frame,  Guiche g  , int  cprioridade) {
		  
		
		   int n =0 ;
		   Senha s = new Senha ();
		   int [ ] vetor = new int[3];
		   
		  
		   vetor[0]= g.getServico1() ;
		   vetor[1]= g.getServico2() ;
		   vetor[2]= g.getServico3() ;
		   
		   
		
		 int  prioridade = 1 ;
		   
		 if( cprioridade < 2  ) {
			 
			 cprioridade ++ ;
		  do { 
			 
		 
		  s.setPrioridade(prioridade);
		  s.setServico(vetor[n]);
		  GerarSenhaService service = new  GerarSenhaService(); 	   
	      s  =  service.chamarSenha(s); 
	      n ++ ;
	      
		  }while( s. getNumero() == 0 && n < 3 );
		  }
		
		  if( s. getNumero() == 0 )  {
			  cprioridade = 0 ;
			  prioridade = 0 ;
			  n=0 ;
			  
			  do {  
				  s.setPrioridade(prioridade);
				  s.setServico(vetor[n]);
				  GerarSenhaService service = new  GerarSenhaService(); 	   
			      s  =  service.chamarSenha(s); 
			      n ++ ; 
			  }while( s. getNumero() == 0 && n < 3 );
			  
		   }
		  
  
		  	
		return s;    }
	   
	   
  public  void finalizaSenha(FuncionarioAtendente frame ,Senha id) {
		   
		   
		   GerarSenhaService service = new  GerarSenhaService(); 	   
	       service.finalizaSenha(id);  
	       
  }









}