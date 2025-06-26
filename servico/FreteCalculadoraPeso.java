package servico;

import modelo.Pedido;

public class FreteCalculadoraPeso {
    public double calcular(Pedido pedido) {
        return pedido.getPesoTotal() * 5.0;
    }
}
