package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {


    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {

        switch (tipoImposto) {
            case ICMS:
                // Orçamento de 10%
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            case ISS:
                // Orçamento de 6%
                return orcamento.getValor().multiply(new BigDecimal("0.06"));
            default:
                return BigDecimal.ZERO;
        }
    }

}
