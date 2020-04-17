package com.br.AppEsporteUIAPI.model;

public class Bodyboard extends Produto {

	private double tamanho;

	private float preco;

	private String cor;

	private String bloco;

	public Bodyboard() {
		super();
	}

	public Bodyboard(double tamanho, float preco, String cor, String bloco) {
		this();
		this.setTamanho(tamanho);
		this.setPreco(preco);
		this.setCor(cor);
		this.setBloco(bloco);
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	@Override
	public String toString() {

		return String.format("%s - %s - %s - %f - %f \n", this.getBloco(), this.getCor(), this.getDescricao(),
				this.getPreco(), this.getTamanho());
	}
}