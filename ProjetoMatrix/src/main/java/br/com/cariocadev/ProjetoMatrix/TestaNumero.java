package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class TestaNumero {
	public boolean isMenorQueZero(BigDecimal n) {
		return n.compareTo(BigDecimal.ZERO) < 0 ? false : true;
	}
	
	public boolean isMenorQueZero(int n) {
		return n < 0 ? false : true;
	}
	
	public boolean isMaiorQueDez(BigDecimal n) {
		return  n.compareTo(BigDecimal.TEN) > 0 ? false : true;
	}
	
	public boolean isNull(BigDecimal n) {
		return (n == null) ? false : true;
	}
	
	public boolean isNull(int n) {
		Integer i= n;
		return i == null ? false : true;
	}
}