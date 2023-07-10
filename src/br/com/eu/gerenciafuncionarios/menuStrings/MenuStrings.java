package br.com.eu.gerenciafuncionarios.menuStrings;

public class MenuStrings {
    private String menuInicial = """
            -----------------------------
            Gerenciamento de Funcionarios
            Digite:
            *****************************
            1 - Adicionar funcionario
            2 - Remover funcionario
            3 - Exibir funcionarios e salario total
            4 - sair
            -----------------------------
            """;

    private String menuAdicionando = """
            -----------------------------
            Adicionar funcionarios
            Digite:
            *****************************
            1 - Adicionar gerente
            2 - Adicionar vendedor
            3 - Voltar
            -----------------------------
            """;

    private String menuRemovendo = """
            -----------------------------
            Remover funcionarios
            Digite:
            *****************************
            1 - Remover
            2 - Voltar
            -----------------------------
            """;

    public String getMenuInicial() {
        return menuInicial;
    }

    public String getMenuAdicionando() {
        return menuAdicionando;
    }

    public String getMenuRemovendo() {
        return menuRemovendo;
    }
}
