package com.junit.exemplo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CasosTesteFuncionalJUnit4Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// ****************************************************************
	// cobertura de classes de equivalência
	@Test
	public void SalarioAte1000() {
		Servidor s = new Servidor("P", 1, 500, 50);
		double result = s.calculaIR();
		assertEquals(0, result, .0);
	}

	@Test
	public void SalarioEntre1000e2000() {
		Servidor s = new Servidor("P", 1, 1500, 50);
		double result = s.calculaIR();
		assertEquals(75, result, .0);
	}

	@Test
	public void SalarioMaior2000() {
		Servidor s = new Servidor("P", 1, 2500, 50);
		double result = s.calculaIR();
		assertEquals(275, result, .0);
	}

	// ****************************************************************
	// cobertura de valores limite
	@Test
	public void Salario1000() {
		Servidor s = new Servidor("P", 1, 1000, 150);
		double result = s.calculaIR();
		assertEquals(0, result, .0);
	}

	@Test
	public void Salario1001() {
		Servidor s = new Servidor("P", 1, 1001, 150);
		double result = s.calculaIR();
		assertEquals(0.15, result, .0);
	}

	@Test
	public void Salario2000() {
		Servidor s = new Servidor("P", 1, 2000, 150);
		double result = s.calculaIR();
		assertEquals(result, 150, .0);
	}

	@Test
	public void Salario2001() {
		Servidor s = new Servidor("P", 1, 2001, 150);
		double result = s.calculaIR();
		assertEquals(result, 150.25, .0);
	}

}
