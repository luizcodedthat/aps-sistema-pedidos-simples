package servico;



import model.Cliente;
public class NotificadorSMS {

	public NotificadorSMS() {
		public void enviar(Cliente cliente) {
			System.out.println("Enviando SMS para " + cliente.getTelefone() + ": Seu pedido foi confirmado!");
		}
	}

}
