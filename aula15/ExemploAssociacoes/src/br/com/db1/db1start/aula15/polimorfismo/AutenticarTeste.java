package br.com.db1.db1start.aula15.polimorfismo;

import org.junit.Test;

public class AutenticarTeste {

	@Test
	public void exemploTeste() {
		Cliente cliente = new Cliente();
		System.out.println(cliente.Autenticar());
		Diretor diretor = new Diretor();
		System.out.println(diretor.Autenticar());
		Gerente gerente = new Gerente();
		System.out.println(gerente.Autenticar());
	}
	
	@Test
	public void exemploInterface() {
		exibirMensagemDeAutenticacao(new Gerente());
		exibirMensagemDeAutenticacao(new Diretor());
		exibirMensagemDeAutenticacao(new Cliente());
	}

	private void exibirMensagemDeAutenticacao(Autenticavel autenticavel) {
		System.out.println(autenticavel.Autenticar());
		
	}
	
	
}
