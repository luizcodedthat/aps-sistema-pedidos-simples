package relatorio;

import model.*;

public class RelatorioTexto {

	public RelatorioTexto() {
		public void gerar(Pedido pedido) {
        System.out.println("\n--- Relatório Pedido ---");
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Produtos:");
        for (ItemPedido item : pedido.getItens()) {
            System.out.printf("- %s (%dx) - R$ %.2f%n", item.getProduto().getNome(), item.getQuantidade(), item.getTotal());
        }
        System.out.printf("Total: R$ %.2f%n", pedido.getTotal());
        System.out.printf("Frete: R$ %.2f%n", pedido.getFrete());
        System.out.printf("Total com frete: R$ %.2f%n", pedido.getTotalComFrete());
    }
	}

}
