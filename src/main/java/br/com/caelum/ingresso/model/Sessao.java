package br.com.caelum.ingresso.model;

import java.time.LocalTime;

public class Sessao {
	
	private Integer id;
	private LocalTime horario;
	private Sala sala;
	private Filme filme;
	
	public Sessao(LocalTime horario, Sala sala, Filme filme) {
		this.horario = horario;
		this.filme = filme;
		this.setSala(sala);
		
	}
	
	public LocalTime getHorarioTermino() {
		return this.horario.plusMinutes(filme.getDuracao().toMinutes());
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}
