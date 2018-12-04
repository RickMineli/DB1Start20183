package br.com.db1.db1start.aula11e12;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.aula11e12.Nome;

public class NomeTest {
	
	@Test
	public void deveTransformarParaLetraMaiuscula() {
		Nome nome = new Nome();
		String valorTransformado = nome.transformarParaLetraMaiscula("ricardo Mineli");
		Assert.assertEquals("RICARDO MINELI", valorTransformado);
	}
	@Test
	public void deveRetornarTamanhoDoNome() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.tamanhoDoNome("MAIKO CUNHA");
		Assert.assertEquals(11, tamanhoDoNome);
	}

}
