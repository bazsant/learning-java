package br.com.livraria.models;

import br.com.livraria.interfaces.Produto;
import br.com.livraria.interfaces.Promocional;

public class Revista implements Produto, Promocional {
	private String nome;
	private String descricao;
	private double valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.1) {
			return false;
		}
		
		this.valor -= this.valor * porcentagem;
		return true;
	}
	
}
