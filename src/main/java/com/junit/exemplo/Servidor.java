/**
 * Especifica��o: Deseja-se calcular o sal�rio l�quido dos servidores de uma determina 
 * institui��o p�blica. Existem 3 tipos de funcion�rios: Professor(P), Funcion�rio(F) e 
 * Outro(O). Cada tipo de servidor pode receber um adicional al�m do seu sal�rio base. 
 * 
 * O sal�rio de cada tipo de servidor � calculado da seguinte forma:
 * 
 * P: Sal�rio-base + adicional vari�vel - IR
 * F: Sal�rio-base + adicional fixo - IR
 * O: Sal�rio-base - IR
 * 
 * O IR (Imposto de Renda) � calculado da seguinte forma:
 * 
 * se sal�rio-base > 2000 
 *   IR = (150) + (sal�rio-base - 2000) * 25%
 * 
 * se 1000 < sal�rio-base <= 2000
 *   IR = (sal�rio-base - 1000) * 15%  	  
 * 
 * se sal�rio-base <= 1000
 *   IR = 0
 * 
 * Observa-se, portanto, que o IR n�o incide sobre os adicionais recebidos.
 *   
 */

package com.junit.exemplo;

public class Servidor {

	protected String atividade;
	protected float salario;
	protected int codigo;
	protected float adicional;

	public Servidor(String atividade, int codigo, float salario, float adicional) {
		this.atividade = atividade;
		this.codigo = codigo;
		this.salario = salario;
		this.adicional = adicional;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setAdicional(float adicional) {
		this.adicional = adicional;
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

	/** Calcula IR de acordo com salario base */
	public double calculaIR() {
		if (this.salario < 1000)
			return 0;
		else if (this.salario >= 1000 && this.salario <= 2000)
			return (this.salario - 1000) * (0.15);
		else if (salario > 2000)
			return 150 + (this.salario - 2000) * (0.25);
		return 0;
	}

    /** Calcula salario de acordo com a atividade do Servidor */
	public double calculaSalarioLiquidoServidor(){
		double IR = this.calculaIR();
        double salarioBruto = this.salario;

        if (this.getAtividade().toUpperCase().equals("P"))
            salarioBruto = this.salario * (1 + this.adicional / 100);
        else if (this.getAtividade().toUpperCase().equals("F"))
            salarioBruto = this.salario * (float) (1 + 0.2);

        System.out.println("Sal�rio Bruto: " + salarioBruto);

        return salarioBruto - IR;

    }


	public String print() {
		return "Codigo: " + getCodigo() + "   Atividade: " + getAtividade()
				+ "   Salario Base: " + getSalario();
	}
}
