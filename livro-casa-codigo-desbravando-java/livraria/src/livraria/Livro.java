package livraria;

public class Livro {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;	

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

	public boolean aplicaDescontoDe(double desconto) {
		if(desconto > 0.3) {
			return false;
		}
		this.setValor(this.getValor() - this.getValor() * desconto);
		return true;
	}

	public void adicionarValor(double valorASerAdicionado) {
		this.setValor(this.getValor() + valorASerAdicionado);
		
	}

	public double retornaValor() {
		return this.getValor();
	}

	
	
}
