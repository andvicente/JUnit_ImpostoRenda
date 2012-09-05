/**
 * Especificação: Deseja-se calcular o salário líquido dos servidores de uma determina 
 * instituição pública. Existem 3 tipos de funcionários: Professor(P), Funcionário(F) e 
 * Outro(O). Cada tipo de servidor pode receber um adicional além do seu salário base. 
 * 
 * O salário de cada tipo de servidor é calculado da seguinte forma:
 * 
 * P: Salário-base + adicional variável - IR
 * F: Salário-base + adicional fixo - IR
 * O: Salário-base - IR
 * 
 * O IR (Imposto de Renda) é calculado da seguinte forma:
 * 
 * se salário-base > 2000 
 *   IR = (150) + (salário-base - 2000) * 25%
 * 
 * se 1000 < salário-base <= 2000
 *   IR = (salário-base - 1000) * 15%  	  
 * 
 * se salário-base <= 1000
 *   IR = 0
 * 
 * Observa-se, portanto, que o IR não incide sobre os adicionais recebidos.
 *   
 */

package com.junit.exemplo;

public class Servidor {

	protected String atividade;
	protected float salario;
	protected int codigo;
	protected float adicional;

	public Servidor(String tmpAt, int tmpC, float tmpS, float tmpAd) {
		this.atividade = tmpAt;
		this.salario = tmpS;
		this.codigo = tmpC;
		this.adicional = tmpAd;
	}

	public void setAtividade(String tmpAt) {
		this.atividade = tmpAt;
	}

	public void setSalario(float tmpS) {
		this.salario = tmpS;
	}

	public void setCodigo(int tmpC) {
		this.codigo = tmpC;
	}

	public void setAdicional(float tmpAd) {
		this.adicional = tmpAd;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getAtividade() {
		return this.atividade;
	}

	public float getSalario() {
		return this.salario;
	}

	public float getAdicional() {
		return this.adicional;
	}

	// /** Calcula IR de acordo com salario base */
	// public double calculaIR() {
	// double ret = 0;
	// if ( this.salario > 2000 )
	// ret = (150) + (this.salario - 2000) * (0.25);
	// else if( this.salario > 1000 )
	// ret = (this.salario - 1000) * (0.15);
	// return ret;
	// }

	/** Calcula IR de acordo com salario base */
	public double calculaIR() {
		double ret = 0;

		if (this.salario > 1000)
			ret = (this.salario - 1000) * (0.15);

		if (this.salario > 2000)
			ret = ret + (this.salario - 2000) * (0.10);

		if (this.salario > 3000)
			ret = ret + (this.salario - 3000) * (0.05);

		return ret;
	}

	/** Calcula salario de acordo com a atividade do Servidor */
	public double calculaSalarioLiquido() {
		double ret = this.salario;

		double ir = this.calculaIR();

		if (this.getAtividade().toUpperCase().equals("P"))
			ret = this.salario * (1 + this.adicional / 100); // utiliza
																// adicional
		else if (this.getAtividade().toUpperCase().equals("F"))
			ret = this.salario * (float) (1 + 0.2); // adicional fixo

		ret = ret - ir;

		return ret;
	}

	public String print() {
		return "Codigo: " + getCodigo() + "   Atividade: " + getAtividade()
				+ "   Salario Base: " + getSalario();
	}
}
