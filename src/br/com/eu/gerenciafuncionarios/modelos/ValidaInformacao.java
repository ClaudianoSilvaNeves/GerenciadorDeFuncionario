package br.com.eu.gerenciafuncionarios.modelos;

public class ValidaInformacao {
    private boolean nome;
    private boolean salario;

    public boolean isNome() {
        return nome;
    }

    public boolean isSalario() {
        return salario;
    }

    public void validaNome(String nome) {
        if (!nome.isEmpty()){
            this.nome = true;
        } else {
            System.out.println("Nome não pode ficar em branco");
        }
    }

    public void validaSalario(double salario) {
        if (salario > 0) {
            this.salario = true;
        } else {
            System.out.println("Valor do salario inválido");
        }
    }
}
