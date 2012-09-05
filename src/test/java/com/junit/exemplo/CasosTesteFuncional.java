/**
 * Casos de teste funcionais para cobrir o método calculaIR()
 * 
 * Created on May 31, 2006
 */

package com.junit.exemplo;

import junit.framework.TestCase;

public class CasosTesteFuncional extends TestCase {

	public CasosTesteFuncional(String str) {
		super(str);
	}

	public CasosTesteFuncional() {
		this("");
	}

	public void setUp() {
		// Invocado antes de cada caso de Teste
	}

	public void tearDown() {
		// Invocado depois de cada caso de Teste
	}

	// ****************************************************************
	// cobertura de classes de equivalência
	public void testSalarioAte1000() {
		Servidor s = new Servidor("P", 1, 500, 50);
		double result = s.calculaIR();
		assertEquals(0, result, .0);
	}

	public void testSalarioEntre1000e2000() {
		Servidor s = new Servidor("P", 1, 1500, 50);
		double result = s.calculaIR();
		assertEquals(75, result, .0);
	}

	public void testSalarioMaior2000() {
		Servidor s = new Servidor("P", 1, 2500, 50);
		double result = s.calculaIR();
		assertEquals(275, result, .0);
	}

	// ****************************************************************
	// cobertura de valores limite
	public void testSalario1000() {
		Servidor s = new Servidor("P", 1, 1000, 150);
		double result = s.calculaIR();
		assertEquals(0, result, .0);
	}

	public void testSalario1001() {
		Servidor s = new Servidor("P", 1, 1001, 150);
		double result = s.calculaIR();
		assertEquals(0.15, result, .0);
	}

	public void testSalario2000() {
		Servidor s = new Servidor("P", 1, 2000, 150);
		double result = s.calculaIR();
		assertEquals(result, 150, .0);
	}

	public void testSalario2001() {
		Servidor s = new Servidor("P", 1, 2001, 150);
		double result = s.calculaIR();
		assertEquals(result, 150.25, .0);
	}

}
