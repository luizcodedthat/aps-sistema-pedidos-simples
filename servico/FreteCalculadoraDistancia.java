package servico;

import modelo.Pedido;

public class FreteCalculadoraDistancia {
    public double calcular(Pedido pedido, double distanciaKm) {
        return distanciaKm * 0.5;
    }
}