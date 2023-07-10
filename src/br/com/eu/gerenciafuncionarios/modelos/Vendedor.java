package br.com.eu.gerenciafuncionarios.modelos;

import br.com.eu.gerenciafuncionarios.calculos.Calculos;

public class Vendedor extends Funcionario implements Calculos {

    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }
    private double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void calcularSalario() {
        this.setSalarioTotal(((this.getSalario() * 0.5) / 100) * this.comissao + this.getSalario());
    }
}
