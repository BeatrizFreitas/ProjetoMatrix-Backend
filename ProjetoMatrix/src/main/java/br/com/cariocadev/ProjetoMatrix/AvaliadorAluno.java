package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class AvaliadorAluno {
	public BigDecimal getMaiorNota(BigDecimal[] notas) {
		if(notas == null) {
			throw new IllegalArgumentException();
		} 
		BigDecimal maior = new BigDecimal(0);
		for (int i = 0; i< notas.length; i++) {
			if (notas[i].compareTo(maior) > 0) {
				maior = notas[i];
			}
		}
		return maior;
	}
	
	public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {	
		BigDecimal soma = new BigDecimal(0);
		BigDecimal qtd = new BigDecimal(3);
		BigDecimal media = new BigDecimal(0);
		TestaNumero teste = new TestaNumero();
		boolean verificaNumero1 = teste.isNull(nota1) && teste.isMenorQueZero(nota1) && teste.isMaiorQueDez(nota1);
		boolean verificaNumero2 = teste.isNull(nota2) && teste.isMenorQueZero(nota2) && teste.isMaiorQueDez(nota2);
		boolean verificaNumero3 = teste.isNull(nota3) && teste.isMenorQueZero(nota3) && teste.isMaiorQueDez(nota3);

		if (verificaNumero1 == false || verificaNumero2 == false || verificaNumero3 == false) {
			throw new IllegalArgumentException();
		} 
		soma = nota1.add(nota2.add(nota3));
		return media = soma.divide(qtd,BigDecimal.ROUND_HALF_UP);
	}

	public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		BigDecimal media = new BigDecimal(0);
		String result = null;
		media = getMedia(nota1, nota2, nota3);
		
		if (media.compareTo(new BigDecimal("6.00"))>= 0) {
			result = "APROVADO";
		} else 
		if (media.compareTo(new BigDecimal("4.00")) < 0) {
			result = "REPROVADO";
		} else
		if ((media.compareTo(new BigDecimal("6.00"))< 0) && (media.compareTo(new BigDecimal("4.00"))>= 0)) {
			result = "PROVA_FINAL";
		}
		return result;
	}
}
