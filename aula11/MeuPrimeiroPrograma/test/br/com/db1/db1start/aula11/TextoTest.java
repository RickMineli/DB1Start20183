package br.com.db1.db1start.aula11;

import org.junit.Assert;
import org.junit.Test;

public class TextoTest {
	Texto meuTexto = new Texto();
	
	@Test
	public void deveTransformarParaMaiusculo() {
		Assert.assertEquals("MASSA", meuTexto.transformarParaMaiusculo("massa"));
	}
	@Test
	public void deveTransformarParaMinusculo() {
		Assert.assertEquals("massa", meuTexto.transformarParaMinusculo("MASSA"));
	}
	@Test	
	public void deveRetornarTamanhoDoTextoDB1START() {
		Assert.assertSame(8, meuTexto.mostrarQuantidadeLetrasDB1START());
	}
	@Test	
	public void deveRetornarTamanhoDoTextoDB1STARTComEspaco() {
		Assert.assertSame(10, meuTexto.mostrarQuantidadeLetrasDB1STARTComEspaco());
	}
	@Test
	public void deveRemoverEspacoDeDB1STARTComEspaco(){
		Assert.assertEquals("DB1START", meuTexto.removerEspacoDeDB1STARTComEspaco());
	}
	@Test
	public void deveRetornarQuatroPrimeirasLetras() {
		Assert.assertEquals("Rica", meuTexto.retornarAsQuatroPrimeirasLetras("Ricardo Mineli"));
	}
	@Test
	public void deveRetornarAPartirDaTerceiraLetra() {
		Assert.assertEquals("ardo Mineli", meuTexto.retornarAPartirDaTerceiraLetra("Ricardo Mineli"));
	}
	@Test	
	public void deveRetornarAsUltimasQuatroLetras() {
		Assert.assertEquals("neli", meuTexto.retornarAsQuatroUltimasLetras("Ricardo Mineli"));
	}
	@Test
	public void deveSubstituirPrimeiraPalavraPorAluno() {
		Assert.assertEquals("Aluno Mineli",meuTexto.substituirPrimeiraPalavraPorAluno("Ricardo Mineli"));
	}
	
}
