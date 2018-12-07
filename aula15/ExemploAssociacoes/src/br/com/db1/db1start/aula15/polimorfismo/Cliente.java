package br.com.db1.db1start.aula15.polimorfismo;

public class Cliente implements Autenticavel{

	@Override
	public String Autenticar() {
		return "CLIENTE AUTENTICANDO";
	}

	@Override
	public Boolean estaLogado() {
		return true;
	}

}
