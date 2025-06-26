package relatorio;

public class RelatorioJSON {

	public RelatorioJSON() {
		public void gerar(Pedido pedido) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  \"cliente\": \"" + pedido.getCliente().getNome() + "\",\n");
        sb.append("  \"produtos\": [\n");
        for (int i = 0; i < pedido.getItens().size(); i++) {
            ItemPedido item = pedido.getItens().get(i);
            sb.append("    {\"nome\": \"" + item.getProduto().getNome() + "\", \"quantidade\": " + item.getQuantidade() + ", \"preco\": " + item.getTotal() + "}");
            if (i < pedido.getItens().size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("  ],\n");
        sb.append("  \"total\": " + pedido.getTotal() + ",\n");
        sb.append("  \"frete\": " + pedido.getFrete() + ",\n");
        sb.append("  \"total_com_frete\": " + pedido.getTotalComFrete() + "\n");
        sb.append("}\n");
        System.out.println(sb);
    }
	}

}
