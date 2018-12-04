package br.com.db1.db1start.aula11e12;

public class Calculadora {

	public Integer somarDoisNumeros(Integer numero1, Integer numero2) {			
		return  numero1 + numero2;			
	}
	public Integer subtrairDoisNumeros(Integer numero1, Integer numero2) {			
		return  numero1 - numero2;		
	}
	
	public Integer multiplicarDoisNumeros(Integer numero1, Integer numero2) {
		return numero1 * numero2;
	}
	
	public Integer dividirDoisNumeros(Integer numero1, Integer numero2) {
		return numero1 / numero2;
	}

	public boolean eVerdadeNumeroPar(Integer numero) {
		if (numero % 2 == 0)
			return true;
		else
			return false;
	}

	public Integer verificarMaiorNumero(Integer numero1, Integer numero2) {
		if (numero1 >= numero2)
		return numero1;
		else
		return numero2;
	}

	public Integer mostrarQuantosImparAteCem(Integer numero) {
		Integer count = 0;
		for(int x = numero; x <100 ; x++) {
			if (!eVerdadeNumeroPar(x))
				count++;
		}
			return count;
	}


}
