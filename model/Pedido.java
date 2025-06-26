package model;

import java.util.ArrayList;
import java.util.List;

import servico.FreteCalculadora;

public class Pedido {
	private List<ItemPedido> itensPedido = new ArrayList<>();
	private FreteCalculadora calculadoraFrete;
	
	private final Cliente cliente;

	public Pedido(Cliente cliente, FreteCalculadora calculadoraFrete) {
		this.cliente = cliente;
		this.calculadoraFrete = calculadoraFrete;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double calcularTotalPedido() {
		double precoTotal = 0;
		
		for (ItemPedido itemPedido: itensPedido) {
			precoTotal += itemPedido.getPrecoTotal();
		}
		
		return precoTotal;
	}
	
	public double calcularFrete() {
		return calculadoraFrete.calcularFrete();
	}
	
}
