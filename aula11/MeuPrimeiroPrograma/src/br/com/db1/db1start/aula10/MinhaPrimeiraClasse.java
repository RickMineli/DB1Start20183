package br.com.db1.db1start.aula10;

public class MinhaPrimeiraClasse {
	public static void main(String[] args) {
		//Declaracoes
		Integer numeroASerVerificado =3;
		boolean eVerdadeNumeroImpar;
		
		//Operacoes
		eVerdadeNumeroImpar = numeroASerVerificado % 2 >0;
		
		//Apresentacao de dados
		System.out.println("Olá Mundo!");
		System.out.println("Seu número é: "+ numeroASerVerificado);
		System.out.println("Seu número é impar? \n "+ eVerdadeNumeroImpar);
		System.out.println("A soma do número mais ele mesmo é: "+ somarDoisValores(numeroASerVerificado,numeroASerVerificado));
		System.out.println("A subtração do número menos 2 é: "+ subtrairDoisValores(numeroASerVerificado, 2));
		System.out.println("A multiplicação do número com ele mesmo é: "+multiplicarDoisValores(numeroASerVerificado,numeroASerVerificado));
		System.out.println("A Divisao do número por 2 é: "+ dividirDoisValores(numeroASerVerificado, 2));
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