package controller;

import modelo.entidade.Funcionario;
import modelo.entidade.Guiche;
import modelo.service.GuicheService;

import view.EntradaGuiche;

public class GuicheController {
	
	 public Guiche entradaGuiche(EntradaGuiche frame,int guiche,Funcionario f_id ) {
		   Guiche g = new Guiche ();
          g.setFuncinarioGuiche(f_id.getMatricula());
		  g.setNumeroGuiche( guiche);
	        GuicheService service = new GuicheService();     
			return  service.entradaGuiche(g);
	
	   }
		 
	 public Guiche servicoNome(Guiche g ) {
	        GuicheService service = new GuicheService();
			return  service.servicoNome(g);
	       
		   
		   
	   }
	
	
	
	
	
	
	
	
	
	
	

}
