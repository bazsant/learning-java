package br.com.livraria.models;

import br.com.livraria.interfaces.Produto;

public abstract class Livro implements Produto {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;	
	private boolean impresso;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public Livro() {
		this.isbn = "0000-00-00000-00-0";		
		this.setImpresso(true);
	}

	public Livro(Autor autor) {
		this();
		this.autor = autor;
		System.out.println("Livro criado");
	}
	
	public void mostrarDetalhes() {
		System.out.println("\nMostrando detalhes do livro");		
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(getValor());
		System.out.println(isbn);
		if(this.temAutor()) {
			autor.mostrarDetalhes();
		}
	}

	private boolean temAutor() {
		return this.autor != null;
	}

	public void adicionarValor(double valorASerAdicionado) {
		this.setValor(this.getValor() + valorASerAdicionado);
		
	}

	public double retornaValor() {
		return this.getValor();
	}

	public boolean isImpresso() {
		return impresso;
	}

	public void setImpresso(boolean impresso) {
		this.impresso = impresso;
	}

	
}
