package livraria.models;

import livraria.interfaces.Promocional;

public class Ebook extends Livro implements Promocional {
	public Ebook(Autor autor) {
		super(autor);
	}
	
	private String watermark;
	
	public String getWatermark() {
		return watermark;
	}
	public void setWatermark(String watermark) {
		this.watermark = watermark;
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		System.out.println("Aplicando desconto no Ebook");
		this.setValor(this.getValor() - this.getValor() * porcentagem);
		return true;
	}
}
