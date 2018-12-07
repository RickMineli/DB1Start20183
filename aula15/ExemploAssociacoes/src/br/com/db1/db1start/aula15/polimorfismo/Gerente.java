package br.com.db1.db1start.aula15.polimorfismo;

public class Gerente extends Funcionario implements Autenticavel{

	@Override
	public String Autenticar() {
		return "GERENTE AUTENTICANDO";
	}

	@Override
	public Boolean estaLogado() {
		return true;
	}

}
