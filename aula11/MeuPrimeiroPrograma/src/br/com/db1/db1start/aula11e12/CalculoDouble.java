package br.com.db1.db1start.aula11e12;

public class CalculoDouble {

	public Double menorValorEntreDoisDoubles(Double valor1,Double valor2) {
			if (valor1 <= valor2)
			return valor1;
			else
			return valor2;
	}
	public Double menorValorEntreTresDoubles(Double valor1,Double valor2,Double valor3) {
		if (valor1 <= valor2) {
			if (valor1 <=valor3)
				return valor1;
		}else {
			if (valor2 <= valor3)
				return valor2;
		}
		return valor3;
	}
	public Double calcularMediaDeTresDoubles(Double valor1,Double valor2,Double valor3) {
		Double media = 0.0;
		media = (valor1+valor2+valor3)/3;
		return media;
	}
	public Double calcularAreaDoTriangulo(Double lado1, Double lado2) {
		Double area =0.0;
		area = (lado1*lado2)/2;
		return area;
	}
}