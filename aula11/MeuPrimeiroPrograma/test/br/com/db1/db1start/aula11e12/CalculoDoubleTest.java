package br.com.db1.db1start.aula11e12;

import org.junit.Assert;
import org.junit.Test;

public class CalculoDoubleTest {
	CalculoDouble meuCalculoDouble = new CalculoDouble();
	
	@Test
	public void deveMostrarMenorValorDentreDoisDoubles() {
		Assert.assertEquals(5.0, meuCalculoDouble.menorValorEntreDoisDoubles(5.0, 10.0),0.11);
	}
	@Test
	public void deveMostrarMenorValorDentreTresDoubles() {
		Assert.assertEquals(11.0, meuCalculoDouble.menorValorEntreTresDoubles(12.0, 15.0, 11.0),0.11);
	}
	@Test	
	public void deveMostrarMediaDeTresDoubles() {
		Assert.assertEquals(6.0, meuCalculoDouble.calcularMediaDeTresDoubles(6.0, 6.0, 6.0),0.11);
	}
	@Test
	public void deveMostrarAreaDoTriandulo() {
		Assert.assertEquals(8.0, meuCalculoDouble.calcularAreaDoTriangulo(4.0, 4.0),0.11);
	}
	
}
