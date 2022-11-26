package controller;


import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.entidade.ControleAtendente;
import modelo.entidade.Guiche;
import modelo.entidade.Senha;
import modelo.service.SenhaService;
import view.ClienteRetirarSenha;
import view.FuncionarioAtendente;

public class SenhaController {
	
private Senha senha ;
private ArrayList<String> listaSenha  = new ArrayList() ;
	
	
	   public Senha salvarSenha(ClienteRetirarSenha frame) {
		   
		     Senha senha = new Senha();
		    
		    senha.setPrioridade(frame.getPrioridade());
		    senha.setServico(frame.getServico());
		  
	        
		    SenhaService service = new  SenhaService();
	        
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
		  SenhaService service = new  SenhaService(); 	   
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
				  SenhaService service = new  SenhaService(); 	   
			      s  =  service.chamarSenha(s); 
			      n ++ ; 
			  }while( s. getNumero() == 0 && n < 3 );
			  
		   }
		  
  
		  	
		return s;    }
  public  void status_hora(FuncionarioAtendente frame , Senha id, ControleAtendente at) {
		   
		   
		   SenhaService service = new  SenhaService(); 	   
	       service.status_hora(id , at );  
   }}