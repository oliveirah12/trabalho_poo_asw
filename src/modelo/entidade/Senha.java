package modelo.entidade;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Senha {
	
	
	private int prioridade ;
	private int servico ;
	private int numero ;
	private  Calendar HoraData ;
	
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public int getServico() {
		return servico;
	}
	public void setServico(int servico) {
		this.servico = servico;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Calendar getHoraData() {
		return HoraData;
	}
	public void setHoraData(Calendar horaData) {
		HoraData = horaData;
	}
	
	
	



}
	
	
	
	