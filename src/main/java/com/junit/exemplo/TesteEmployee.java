package com.junit.exemplo;

public class TesteEmployee {
	public static void main(String[] args) {
		Servidor s = new Servidor("P", 1, 3500, 50);
		System.out.println(s.print() + "  I.R.:" + s.calculaIR()
				+ "  Salário Líquido: " + s.calculaSalarioLiquidoServidor());
	}
}
