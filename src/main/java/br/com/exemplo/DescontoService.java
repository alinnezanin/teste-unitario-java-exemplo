package br.com.exemplo;

public class DescontoService {

    public double calcularDesconto(double valorCompra) {
        if (valorCompra <= 100) {
            return 0;
        } else if (valorCompra <= 500) {
            return valorCompra * 0.05;
        } else {
            return valorCompra * 0.10;
        }
    }
}
