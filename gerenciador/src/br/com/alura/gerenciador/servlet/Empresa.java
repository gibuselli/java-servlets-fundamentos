package br.com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {

	private int id;
	private String nome;
	private Date dataAbertura = new Date();
//	
//	public Empresa(int id, String nome) {
//		this.id = id;
//		this.nome = nome;
//	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
