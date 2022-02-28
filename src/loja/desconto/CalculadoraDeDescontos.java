package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        Desconto desconto = new DescontoParaOrcamentoComMaisDe5Itens(
                new DescontoParaOrcamentoMaiorQueQuinhentos(
                new SemDesconto()
                ));

        return desconto.calcular(orcamento);
    }

}
