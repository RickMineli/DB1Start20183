package br.com.db1.db1start.aula15.polimorfismo;

public class Diretor extends Funcionario implements Autenticavel {

	@Override
	public String Autenticar() {
		return "DIRETOR AUTENTICANDO";
	}

	@Override
	public Boolean estaLogado() {
		return true;
	}

}
