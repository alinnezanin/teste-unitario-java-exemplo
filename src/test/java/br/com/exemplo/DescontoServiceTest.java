package br.com.exemplo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescontoServiceTest {

    @Test
    public void deveRetornarZeroParaComprasAte100() {
        DescontoService service = new DescontoService();
        double desconto = service.calcularDesconto(100);
        assertEquals(0, desconto);
    }

    @Test
    public void deveAplicarCincoPorCentoParaComprasEntre100e500() {
        DescontoService service = new DescontoService();
        double desconto = service.calcularDesconto(200);
        assertEquals(10, desconto);
    }

    @Test
    public void deveAplicarDezPorCentoParaComprasAcimaDe500() {
        DescontoService service = new DescontoService();
        double desconto = service.calcularDesconto(600);
        assertEquals(60, desconto);
    }
}