package com.br.AppEsporteUIAPI.model;

public class ItemVenda {

	private Integer id;

	private String descricao;

	private Venda venda;
	
	private Produto produto;

	public ItemVenda() {
	}

	public ItemVenda(String descricao, Venda venda) {
		this();
		setDescricao(descricao);
		setVenda(venda);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}