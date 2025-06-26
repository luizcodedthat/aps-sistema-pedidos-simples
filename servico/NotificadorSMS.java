package servico;

import modelo.Cliente;
public class NotificadorSMS {

	public void enviar(Cliente cliente) {
		System.out.println("Enviando SMS para " + cliente.getTelefone() + ": Seu pedido foi confirmado!");
	}

}
