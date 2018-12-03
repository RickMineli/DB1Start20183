package br.com.db1.db1start.aula11;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora minhaCalculadora = new Calculadora();
	
	@Test
	public void deveSomarDoisNumeros() {
		Assert.assertSame(4, minhaCalculadora.somarDoisNumeros(2, 2));
	}
	
	@Test	
	public void deveSubtrairDoisNumeros() {
		Assert.assertSame(5, minhaCalculadora.subtrairDoisNumeros(10,5));
	}
	@Test
	public void deveMultiplicarDoisNumeros() {
		Assert.assertSame(10, minhaCalculadora.multiplicarDoisNumeros(5, 2));
	}
	@Test
	public void deveDividirDoisNumeros() {
		Assert.assertSame(5, minhaCalculadora.dividirDoisNumeros(10, 2) );
	}
	@Test
	public void deveSerVerdadeNumeroPar() {
		Assert.assertTrue(minhaCalculadora.eVerdadeNumeroPar(2));
	}
	@Test
	public void deveSerFalsoNumeroPar() {
		Assert.assertFalse(minhaCalculadora.eVerdadeNumeroPar(3));
	}
	@Test
	public void deveVerificarMaiorNumero() {
		Assert.assertSame(10, minhaCalculadora.verificarMaiorNumero(10, 5));
	}
	@Test
	public void deveVerificarQuantosImparAteCem() {
		Assert.assertSame(3, minhaCalculadora.mostrarQuantosImparAteCem(95));
	}
	
}
