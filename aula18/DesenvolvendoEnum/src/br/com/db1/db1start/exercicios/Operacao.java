package br.com.db1.db1start.exercicios;

public enum Operacao {
	SOMA{
		@Override
		public Double executorDeOperacoes(Double numero1, Double numero2) {
			return numero1+numero2;
		}
	},
	SUBTRACAO{
		@Override
		public Double executorDeOperacoes(Double numero1, Double numero2) {
			return numero1-numero2;
		}
	},
	DIVISAO{
		@Override
		public Double executorDeOperacoes(Double numero1, Double numero2) {
			return numero1/numero2;
		}
	},
	MULTIPLICACAO{
		@Override
		public Double executorDeOperacoes(Double numero1, Double numero2) {
			return numero1*numero2;
		}
	};
	public abstract Double executorDeOperacoes(Double numero1, Double numero2);
}
