package br.com.db1.db1start.aula18.calculadoraapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.db1start.aula18.calculadoraapi.model.Calculadora;
import br.com.db1.db1start.aula18.calculadoraapi.model.Operacao;
import br.com.db1.db1start.aula18.calculadoraapi.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@Autowired
	private CalculadoraService calculadoraService;

	@GetMapping
	public Calculadora salvaOperacao(@RequestParam("numeroUm") Double numeroUm,@RequestParam("numeroDois") Double numeroDois,@RequestParam("operacao") Operacao operacao) {
		Calculadora calculadora = calculadoraService.salvarOperacao(numeroUm, numeroDois, operacao);
		return calculadora;
	}
}
