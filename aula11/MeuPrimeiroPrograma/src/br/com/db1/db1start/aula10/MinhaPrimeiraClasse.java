package br.com.db1.db1start.aula10;

public class MinhaPrimeiraClasse {
	public static void main(String[] args) {
		//Declaracoes
		Integer numeroASerVerificado =3;
		boolean eVerdadeNumeroImpar;
		
		//Operacoes
		eVerdadeNumeroImpar = numeroASerVerificado % 2 >0;
		
		//Apresentacao de dados
		System.out.println("Ol� Mundo!");
		System.out.println("Seu n�mero �: "+ numeroASerVerificado);
		System.out.println("Seu n�mero � impar? \n "+ eVerdadeNumeroImpar);
		System.out.println("A soma do n�mero mais ele mesmo �: "+ somarDoisValores(numeroASerVerificado,numeroASerVerificado));
		System.out.println("A subtra��o do n�mero menos 2 �: "+ subtrairDoisValores(numeroASerVerificado, 2));
		System.out.println("A multiplica��o do n�mero com ele mesmo �: "+multiplicarDoisValores(numeroASerVerificado,numeroASerVerificado));
		System.out.println("A Divisao do n�mero por 2 �: "+ dividirDoisValores(numeroASerVerificado, 2));
	}
	
	//Metodos
	public static Integer somarDoisValores(Integer numero1, Integer numero2) {			
		return  numero1 + numero2;			
	}
	public static Integer subtrairDoisValores(Integer numero1, Integer numero2) {			
		return  numero1 - numero2;		
	}
	public static Integer multiplicarDoisValores(Integer numero1, Integer numero2) {
		return numero1 * numero2;
	}
	public static Integer dividirDoisValores(Integer numero1, Integer numero2) {
		return numero1 / numero2;
	}
	
	
}