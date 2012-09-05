package com.junit.exemplo;

public class Funcionario {

	private int codigo;
	private float salario, aliquota;
	private String tipo;

	public Funcionario(int _cod, float _sal, float _aliq, String _tipo) {
		this.codigo = _cod;
		this.salario = _sal;
		this.tipo = _tipo;
		this.aliquota = _aliq;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setAliquota(float _aliq) {
		this.aliquota = _aliq;
	}

	public float calculaIR() {
		return this.salario * (this.aliquota / 100);
	}
}
