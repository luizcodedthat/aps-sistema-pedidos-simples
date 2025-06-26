package servico;


import modelo.Cliente;

public class NotificadorEmail {

	public void enviar(Cliente cliente) {
        System.out.println("Enviando e-mail para " + cliente.getEmail() + ": Seu pedido foi confirmado!");
    }

}
