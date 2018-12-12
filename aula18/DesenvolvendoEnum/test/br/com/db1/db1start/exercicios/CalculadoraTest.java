package br.com.db1.db1start.exercicios;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calculadora;
	
	@Before
	public void Antes() {
		calculadora = new Calculadora(1d, 2d);
	}

	@Test
	public void deveSomar() {
		Assert.assertEquals(3d, calculadora.executaOperacao(Operacao.SOMA),0d);	
	}
	@Test
	public void deveSubtrair() {
		Assert.assertEquals(-1d, calculadora.executaOperacao(Operacao.SUBTRACAO),0d);	
	}
	@Test
	public void deveDividir() {
		Assert.assertEquals(0.5, calculadora.executaOperacao(Operacao.DIVISAO),0.d);	
	}
	@Test
	public void deveMultiplicar() {
		Assert.assertEquals(2d, calculadora.executaOperacao(Operacao.MULTIPLICACAO),0d);	

	}
}
