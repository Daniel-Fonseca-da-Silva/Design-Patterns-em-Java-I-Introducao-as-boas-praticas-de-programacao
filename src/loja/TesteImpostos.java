package loja;

import loja.imposto.CalculadoraDeImposto;
import loja.imposto.ICMS;
import loja.imposto.ISS;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();

        System.out.println(calculadora.calcular(orcamento, new ICMS()));
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }


}
