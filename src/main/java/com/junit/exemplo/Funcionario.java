package com.junit.exemplo;

public class Funcionario {

	private int codigo;
	private float salario, aliquota;
	private String tipo;

	public Funcionario(int cod, float salario, float aliquota, String tipo) {
		this.codigo = cod;
		this.salario = salario;
		this.tipo = tipo;
		this.aliquota = aliquota;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setAliquota(float aliquota) {
		this.aliquota = aliquota;
	}

	public float calculaIR() {
		return this.salario * (this.aliquota / 100);
	}
}
