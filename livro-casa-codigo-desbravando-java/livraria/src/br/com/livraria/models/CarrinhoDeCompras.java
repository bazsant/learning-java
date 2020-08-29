package br.com.livraria.models;

import br.com.livraria.interfaces.Produto;

public class CarrinhoDeCompras {

	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void adiciona(Produto produto) {		
		System.out.println("Adicionado: " + produto);
		this.produtos[contador] = produto;
		contador++;
		this.setTotal(this.getTotal() + produto.getValor());
	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
}
