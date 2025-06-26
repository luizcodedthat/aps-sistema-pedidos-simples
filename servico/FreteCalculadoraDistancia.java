package servico;


import modelo.Pedido;

public class FreteCalculadoraDistancia {

	public FreteCalculadoraDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double calcular(Pedido pedido) {
		return distancia * 0.5; 
	}
}
