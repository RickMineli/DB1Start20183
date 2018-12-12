package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class RegioesTest {

	@Test
	public void deveRetornarEstadosDoSul() {
		Uf[] ufs = Regioes.SUL.getUfs();
		Assert.assertArrayEquals(new Uf[] { Uf.PR, Uf.SC }, ufs);
	}

}