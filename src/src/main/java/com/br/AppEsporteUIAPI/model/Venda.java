package com.br.AppEsporteUIAPI.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {

	private Integer id;

	private Date datavenda;

	private String nomeloja;

	private Cliente cliente;

	private List<ItemVenda> itensvenda;

	public Venda() {
		itensvenda = new ArrayList<ItemVenda>();
	}

	public Venda(Integer id, Date dataVenda, String nomeLoja) {
		this();
		setId(id);
		setDatavenda(dataVenda);
		setNomeloja(nomeLoja);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemVenda> getItensvenda() {
		return itensvenda;
	}

	public void setItensvenda(List<ItemVenda> itensvenda) {
		this.itensvenda = itensvenda;
	}

	public Date getDatavenda() {
		return datavenda;
	}

	public void setDatavenda(Date datavenda) {
		this.datavenda = datavenda;
	}

	public String getNomeloja() {
		return nomeloja;
	}

	public void setNomeloja(String nomeloja) {
		this.nomeloja = nomeloja;
	}

	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		return String.format(
				"Id da venda: %d \n" + " Data da venda: %s \n" + " Loja da venda: %s \n" + " Nome do cliente %s \n",
				this.getId(), dateFormat.format(this.getDatavenda()), this.getNomeloja(), this.getCliente().getNome());
	}
}