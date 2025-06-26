package servico;

import modelo.Cliente;
public class NotificadorWhatsApp {
		public void enviar(Cliente cliente) {
			System.out.println("Enviando WhatsApp para " + cliente.getTelefone() + ": Seu pedido foi confirmado!");
		}

}
