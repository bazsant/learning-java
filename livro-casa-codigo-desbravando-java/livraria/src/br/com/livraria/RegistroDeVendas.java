package br.com.livraria;

import br.com.livraria.interfaces.Produto;
import br.com.livraria.models.Autor;
import br.com.livraria.models.CarrinhoDeCompras;
import br.com.livraria.models.Ebook;
import br.com.livraria.models.LivroFisico;

public class RegistroDeVendas {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Jhones Bazilio");
		
		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("TDD");
		livroFisico.setValor(59.9);
		if(livroFisico.aplicaDescontodDe10PorCento()) {
			System.out.println("Valor agora é de: " + livroFisico.getValor());
		}
				
		Ebook ebook = new Ebook(autor);
		ebook.setNome("TDD");
		ebook.setValor(39.9);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adiciona(livroFisico);
		carrinhoDeCompras.adiciona(ebook);
		
		Produto[] produtos = carrinhoDeCompras.getProdutos();
		for (Produto produto: produtos) {
			try {
				if(produto!=null) {
					System.out.println(produto.getValor());
				}
			} catch (Exception e) {
				System.out.println("Problemas no produto: " + produto);
				e.printStackTrace();
			}
		}
		
		System.out.println("Valor total: "+ carrinhoDeCompras.getTotal());
	}
}
