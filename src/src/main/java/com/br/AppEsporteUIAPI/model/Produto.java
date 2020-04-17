package com.br.AppEsporteUIAPI.model;

public abstract class Produto {

	private Integer id;

	private String descricao;

	public Produto() {
		
	}

	public Produto(Integer id, String descricao) {
		this();
		this.setId(id);
		this.setDescricao(descricao);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}