package br.com.eu.gerenciafuncionarios.modelos;

import br.com.eu.gerenciafuncionarios.calculos.Calculos;

public class Gerente extends Funcionario implements Calculos {

    public Gerente(String nome, double salario) {
        super(nome,salario);
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calcularSalario() {
        setSalarioTotal(this.getSalario() + this.getSalario() / this.bonus);
    }
}
