package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto {
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        // Imposto de 10%
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
