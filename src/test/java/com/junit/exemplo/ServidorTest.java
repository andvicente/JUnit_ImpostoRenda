package com.junit.exemplo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ServidorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 Cobertura de classes de equivalência
	 **/
	@Test
	public void SalarioAte1000() {
		Servidor s = new Servidor("P", 1, 500, 30);
		double result = s.calculaIR();
		assertEquals(0, result, .0);
	}

	@Test
	public void SalarioEntre1000e2000() {
		Servidor s = new Servidor("P", 1, 1500, 30);
		double result = s.calculaIR();
		assertEquals(75, result, .0);
	}

	@Test
	public void SalarioMaior2000() {
		Servidor s = new Servidor("P", 1, 2500, 30);
		double result = s.calculaIR();
		assertEquals(275, result, .0);
	}

	/**
		Cobertura de valores limite
	 **/
	@Test
	public void Salario1000() {
		Servidor s = new Servidor("P", 1, 1000, 30);
		double result = s.calculaIR();
		assertEquals(0, result, .0);
	}

	@Test
	public void Salario1001() {
		Servidor s = new Servidor("P", 1, 1001, 30);
		double result = s.calculaIR();
		assertEquals(0.15, result, .0);
	}

	@Test
	public void Salario2000() {
		Servidor s = new Servidor("P", 1, 2000, 30);
		double result = s.calculaIR();
		assertEquals(result, 150, .0);
	}

	@Test
	public void Salario2001() {
		Servidor s = new Servidor("P", 1, 2001, 30);
		double result = s.calculaIR();
		assertEquals(result, 150.25, .0);
	}

	@Test
	public void Salario3000() {
		Servidor s = new Servidor("P", 1, 3000, 30);
		double result = s.calculaIR();
		assertEquals(result, 400.0, .0);
	}

    /**
     Cobertura Salario Liquido
     **/
    @Test
    public void calcularSalarioLiquidoProfessor(){


    }

    @Test
    public void calcularSalarioLiquidoFuncionario(){

    }



}
