package servico;



import model.Cliente;
public class NotificadorWhatsApp {

	public NotificadorWhatsApp() {
		public void enviar(Cliente cliente) {
			System.out.println("Enviando WhatsApp para " + cliente.getTelefone() + ": Seu pedido foi confirmado!");
		}
	}

}
