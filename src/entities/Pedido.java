package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.Status;

public class Pedido {
	private Date momento;
	private Status status;
	private Cliente cliente;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido(Date momento, Status status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getMomento() {
		return momento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void addItem(ItemPedido item) {
		itens.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public Double total() {
		Double soma = 0.0;
		
		for(ItemPedido i : itens) {
			soma += i.subTotal();
		}
		
		return soma;
	}
	
	public String toString() {
		return "Cliente: " + cliente + "\nData do pedido: " + sdf.format(momento) +
				"\nStatus: " + status + "\nProdutos:" + itens;
	}
}
