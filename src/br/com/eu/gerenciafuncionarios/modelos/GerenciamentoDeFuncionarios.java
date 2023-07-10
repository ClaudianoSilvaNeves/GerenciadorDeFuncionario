package br.com.eu.gerenciafuncionarios.modelos;

import java.util.ArrayList;

public class GerenciamentoDeFuncionarios {

    private ArrayList<Funcionario> funcionarios;

    public GerenciamentoDeFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public void adicionaFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> listaFuncionarios() {
        return this.funcionarios;
    }

    public ArrayList<Funcionario> exibeFuncionariosESalarioTotal() {
        if (!this.funcionarios.isEmpty()) {
            int i = 1;
            for (Funcionario funcionario : funcionarios) {
                listaFuncionarios().get(i - 1).calcularSalario();
                System.out.println("[" + i + "] " + funcionario.getNome() + " " + funcionario.getSalarioTotal() + "R$");
                i++;
            }
            return this.funcionarios;
        } else {
            System.out.println("Nenhum funcionario registrado");
        }
        return null;
    }
}
