package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import enums.Status;



public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Data de nascimento: ");
		Date data = sdf.parse(sc.nextLine());
		
		Cliente cliente = new Cliente(nome, email, data);
		
		System.out.print("Entre o status do pedido: ");
		String status = sc.nextLine();
		
		Pedido pedido = new Pedido(new Date(), Status.valueOf(status), cliente);
		
		System.out.print("Entre numero de produtods: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Produto #" + (i+1) + ":");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeP = sc.nextLine();
			
			System.out.print("Preço do produto: ");
			Double preco = sc.nextDouble();
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			ItemPedido iP = new ItemPedido(quantidade, preco, new Produto(nomeP, preco));
			
			pedido.addItem(iP);
		}
		
		System.out.println("Lista de produtos: ");
		System.out.println(pedido);
		
		System.out.println("Preço total: ");
		System.out.print(pedido.total());
		
		sc.close();
	}

}
