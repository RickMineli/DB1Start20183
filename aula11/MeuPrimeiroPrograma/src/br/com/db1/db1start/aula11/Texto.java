package br.com.db1.db1start.aula11;

import java.util.ArrayList;
import java.util.List;

public class Texto {

	public String transformarParaMaiusculo(String texto) {
		return texto.toUpperCase();
	}
	public String transformarParaMinusculo(String texto) {
		return texto.toLowerCase();
	}
	public Integer mostrarQuantidadeLetrasDB1START() {
		String texto = "DB1START";
		return texto.length();
	}
	public Integer mostrarQuantidadeLetrasDB1STARTComEspaco() {
		String texto = " DB1START ";
		return texto.length();
	}
	public String removerEspacoDeDB1STARTComEspaco() {
		String texto = " DB1START ";
		return texto =texto.trim();
	}
	
	public String retornarAsQuatroPrimeirasLetras(String texto) {
		return texto = texto.substring(0, 4);
	}
	public String retornarAPartirDaTerceiraLetra(String texto) {
		return texto = texto.substring(3);
	}
	
	public String retornarAsQuatroUltimasLetras(String texto) {
		return texto = texto.substring(texto.length()-4);
	}

	public String substituirPrimeiraPalavraPorAluno(String texto) {
		String aluno = "Aluno ";
		texto = texto.split(" ", 2)[1];
		aluno = aluno.concat(texto);
		return aluno;
	}
	public String[] separarTextoPorPontoEVirgula(String texto) {
		String array[] = new String[50];
		array = texto.split(";");
		return array;
	}
	public Integer mostrarQuantasVogais(String texto) {
		Integer vogais =0;
		texto = texto.toLowerCase();
		for (int j = 0;j<texto.length();j++) {
			 char c = texto.charAt(j);
		        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		        	vogais++;
		}
		return vogais;
	}
	public String inverterTexto(String texto) {
		texto = texto.toLowerCase();
		String invertido = new StringBuilder(texto).reverse().toString();
		return invertido;
	}
}
	

