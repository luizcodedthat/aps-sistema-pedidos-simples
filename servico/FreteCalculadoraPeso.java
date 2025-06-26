package servico;


import modelo.Pedido;

public class FreteCalculadoraPeso {

	public double calcular(Pedido pedido) {
		return pedido.getDistancia() * 0.5; 
		
	}

}
