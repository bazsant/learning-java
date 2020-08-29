package br.com.livraria;

import br.com.livraria.interfaces.Produto;

public class CarrinhoDeCompras {

	private double total;
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void adiciona(Produto produto) {		
		System.out.println("Adicionado: " + produto);		
		this.setTotal(this.getTotal() + produto.getValor());
	}
}
