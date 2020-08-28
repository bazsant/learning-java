package livraria;

public class Ebook extends Livro {
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
		return super.aplicaDescontoDe(porcentagem);
	}
}
