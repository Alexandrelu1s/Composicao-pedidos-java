package entities;

public class ItemPedido {
	private int quantidade;
	private Double price;
	private Produto produto;
	
	public ItemPedido(int quantidade, Double price, Produto produto) {
		this.quantidade = quantidade;
		this.price = price;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Double subTotal() {
		return price * quantidade;
	}
	
	@Override
	public String toString() {
		return "\n" + produto + "\nQuantidade: " + quantidade + "\nPreço: R$ " + price;
	}
}
