package br.com.eu.gerenciafuncionarios.modelos;

import br.com.eu.gerenciafuncionarios.calculos.Calculos;

public class Funcionario implements Calculos {

    private String nome;
    private double salario;
    private double salarioTotal;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public void calcularSalario() {
    }
}
