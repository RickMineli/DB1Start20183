package br.com.db1.db1start.exercicios;

public class Calculadora {

	private Double numero1;
	private Double numero2;

	public Calculadora(Double numero1, Double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public Double executaOperacao(Operacao operacao) {
		return operacao.executorDeOperacoes(this.numero1, this.numero2);
	}
}
