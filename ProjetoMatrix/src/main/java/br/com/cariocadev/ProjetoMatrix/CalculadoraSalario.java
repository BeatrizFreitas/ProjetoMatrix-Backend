package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class CalculadoraSalario {

	/*
	 * 1- Não há necessidade de criação de váriaveis para usar apenas em
	 * validações ou armazenamento do valor de retorno. Isso apenas aumenta a quantidede de linhas de código
	 */
	public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal percentualImpostoINSS) {
		BigDecimal salarioLiquido = new BigDecimal(0);
		TestaNumero teste = new TestaNumero();
		boolean verificaSalario = teste.isNull(salarioBruto);
		boolean verificaPercentual = teste.isNull(percentualImpostoINSS);
		
		if (verificaSalario == false || verificaPercentual == false) {
			throw new IllegalArgumentException();
		} 
		
		// Como deveria ser feito
//		if (teste.isNull(salarioBruto) || teste.isNull(percentualImpostoINSS)) {
//			throw new IllegalArgumentException();
//		}		
		
		salarioLiquido = salarioBruto.subtract(salarioBruto.multiply(percentualImpostoINSS.divide(new BigDecimal ("100"))));
		return salarioLiquido.setScale(2, BigDecimal.ROUND_HALF_UP);
		
//		return salarioBruto.subtract(salarioBruto.multiply(percentualImpostoINSS.divide(new BigDecimal ("100")))).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	/*
	 * 1 - Não há necessidade de criação de váriaveis para usar apenas em
	 * validações ou armazenamento do valor de retorno. Isso apenas aumenta a quantidede de linhas de código
	 * 
	 * 2 - Use o BigDecimal.valueOf(8.0) ao invés de dar new no objeto
	 * 
	 */
	public BigDecimal getValorINSS(BigDecimal salarioBruto) {
		BigDecimal cond1 = new BigDecimal(1693.72);
		BigDecimal cond2 = new BigDecimal(2822.90);
		BigDecimal salarioLiquido = new BigDecimal(0);
		BigDecimal desconto = new BigDecimal(0);
		TestaNumero teste = new TestaNumero();
		boolean verificaSalario = teste.isNull(salarioBruto);
		if (verificaSalario == false) {
			throw new IllegalArgumentException();
		} 
		if (salarioBruto.compareTo(cond1) < 0) {
			salarioLiquido =  getSalarioLiquido(salarioBruto,new BigDecimal(8.0));
			desconto = salarioBruto.subtract(salarioLiquido);
		} else if (salarioBruto.compareTo(cond2) > 0) {
			salarioLiquido =  getSalarioLiquido(salarioBruto,new BigDecimal(11.0));
			desconto = salarioBruto.subtract(salarioLiquido);
		} else {
			salarioLiquido =  getSalarioLiquido(salarioBruto,new BigDecimal(9.0));
			desconto = salarioBruto.subtract(salarioLiquido);
		}
		return desconto;
	}

	/*
	 * Esse código esta correto. Entretanto deixo o desafio de implementação sem o uso do 
	 * switch case
	 */
	public BigDecimal getValorPlanoDeSaude(Integer idade) {
		TestaNumero teste = new TestaNumero();
		boolean verificaIdade = teste.isNull(idade);
		if (verificaIdade == false) {
			throw new IllegalArgumentException();
		} 
		switch((int) Math.floor(idade/10)) {
			case 0:
				return new BigDecimal(75.00).setScale(2, BigDecimal.ROUND_HALF_UP);
			case 1:
				return new BigDecimal(112.50).setScale(2, BigDecimal.ROUND_HALF_UP);
			case 2:
				return new BigDecimal(168.75).setScale(2, BigDecimal.ROUND_HALF_UP);
			case 3:
				return new BigDecimal(253.13).setScale(2, BigDecimal.ROUND_HALF_UP);
			case 4:
				return new BigDecimal(379.69).setScale(2, BigDecimal.ROUND_HALF_UP);
			case 5:
				return new BigDecimal(569.54).setScale(2, BigDecimal.ROUND_HALF_UP);
			default: 
				return new BigDecimal(854.30).setScale(2, BigDecimal.ROUND_HALF_UP);
		}
	}
}
