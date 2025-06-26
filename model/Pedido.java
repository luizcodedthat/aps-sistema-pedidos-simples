package model;

import java.util.ArrayList;
import java.util.List;

import servico.FreteCalculadora;

public class Pedido {
	private double frete;
	private List<ItemPedido> itensPedido = new ArrayList<>();
	
	private final Cliente cliente;

	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public List<ItemPedido> getPedidos() {
		return itensPedido;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}
	
	public void adicionarItem(ItemPedido item, int quantidade) {
		itensPedido.add(item);
	}
	
	public double calcularTotalPedido() {
		double precoTotal = 0;
		
		for (ItemPedido itemPedido: itensPedido) {
			precoTotal += itemPedido.getPrecoTotal();
		}
		
		return precoTotal;
	}
	
	
	
}
