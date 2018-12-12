package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

	@Test
	public void deveRetornarNomeMaisculo() {
		Cliente cliente = new Cliente("Ricardo Mineli");
		Assert.assertEquals("RICARDO MINELI", cliente.trataNome(TratamentoNome.UPPERCASE));
	}
	@Test
	public void deveRetornarNomeMinusculo() {
		Cliente cliente = new Cliente("Ricardo Mineli");
		Assert.assertEquals("ricardo mineli", cliente.trataNome(TratamentoNome.LOWERCASE));
	}
	
	@Test
	public void deveRetornarQuatroPrimeirasLetras() {
		Cliente cliente = new Cliente("Ricardo Mineli");
		Assert.assertEquals("Rica", cliente.trataNome(TratamentoNome.QUATRO_PRIMEIRAS_LETRAS));
	}
	
	
	
}
