package entities;

public class Produto {
	private String nomeP;
	private Double preco;
	
	public Produto(String nomeP, Double preco) {
		this.nomeP = nomeP;
		this.preco = preco;
	}

	public String getNomeP() {
		return nomeP;
	}

	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}

	public Double getPrice() {
		return preco;
	}

	public void setPrice(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return"Nome do produto: " + nomeP + "\nPreço: " + preco; 
	}
}
