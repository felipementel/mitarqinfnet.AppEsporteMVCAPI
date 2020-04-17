package com.br.AppEsporteUIAPI.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private Integer id;

	private String nome;

	private int ddd;

	private long telefone;

	private String email;

	private Date datacadastro;

	private boolean isativo;

	public Cliente() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(Date datacadastro) {
		this.datacadastro = datacadastro;
	}

	public boolean isIsativo() {
		return isativo;
	}

	public void setIsativo(boolean isativo) {
		this.isativo = isativo;
	}

	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		return String.format("%s - %d - %d - %s - %s - %s", this.getNome(), this.getDdd(), this.getTelefone(),
				this.getEmail(), this.isIsativo(), dateFormat.format(this.getDatacadastro()));
	}

}
