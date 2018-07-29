package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

/*
 * Como desafio deixo a tarefa de você fazer testes unitários para os métodos abaixo.
 * 
 */
public class TestaNumero {
	
	/*
	 * 1- Faltou vericar se n é null. Neste caso poderá acontecer um NullPointerException
	 * 
	 * 2- Retornar o valor direto ao inves de usar if ternário
	 */
	public boolean isMenorQueZero(BigDecimal n) {		
		return n.compareTo(BigDecimal.ZERO) < 0 ? false : true;
	}
	
	/*
	 * 1- Na criação de métodos de preferência de 
	 * receber como argumentos classes ao invés de tipos primitivos.
	 * 
 	 * 2- Retornar o valor direto ao inves de usar if ternário.
	 */
	public boolean isMenorQueZero(int n) {
		return n < 0 ? false : true;
	}
	
	/*
	 * 1- Faltou vericar se n é null. Neste caso poderá acontecer um NullPointerException
	 * 
	 * 2- Retornar o valor direto ao inves de usar if ternário
	 */
	public boolean isMaiorQueDez(BigDecimal n) {
		return  n.compareTo(BigDecimal.TEN) > 0 ? false : true;
	}
	
	/*
	 * 1- Há um erro de lógica na validação. O nome isNull testa se o valor é nulo. Caso e caso verdadeiro
	 * retorna true. No código abaixo ele esta fazendo o contrário do que o nome do método indica.
	 * 
	 * 2- Retornar o valor direto ao inves de usar if ternário.
	 * 
	 * 3- Particulamente eu não criaria um método apenas para testar se algo é null
	 * 
	 */
	public boolean isNull(BigDecimal n) {
		return (n == null) ? false : true;
	}
	
	/*
	 * 1- Há um erro de lógica na validação. O nome isNull testa se o valor é nulo e caso verdadeiro
	 * retorna true. No código abaixo ele esta fazendo o contrário do que o nome do método indica.
	 * 
	 * 2- Retornar o valor direto ao invés de usar if ternário.
	 * 
	 * 3- Na criação de métodos de preferência de 
	 * receber como argumentos classes ao invés de tipos primitivos.
	 * 
	 * 4- Um tipo primitivo nunca poderá ser null, logo você nunca poderá chamar esse método
	 * passando null como argumento
	 * 
	 * 5- Particulamente eu não criaria um método apenas para testar se algo é null
	 * 
	 */
	public boolean isNull(int n) {
		Integer i= n;
		return i == null ? false : true;
	}
	
}
