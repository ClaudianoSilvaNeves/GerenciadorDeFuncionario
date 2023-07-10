package br.com.eu.gerenciafuncionarios.main;

import br.com.eu.gerenciafuncionarios.menuStrings.MenuStrings;
import br.com.eu.gerenciafuncionarios.modelos.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        MenuStrings menu = new MenuStrings();
        Scanner scanner = new Scanner(System.in);
        ValidaInformacao valida = new ValidaInformacao();
        GerenciamentoDeFuncionarios lista = new GerenciamentoDeFuncionarios();

        Gerente gerente1 = new Gerente("Hm", 1500);
        Gerente gerente2 = new Gerente("Hmm", 1500);
        Gerente gerente3 = new Gerente("Hmmm", 1500);
        Vendedor vendedor1 = new Vendedor("eh",1500);
        Vendedor vendedor2 = new Vendedor("ehh",1500);
        Vendedor vendedor3 = new Vendedor("ehhh",1500);

        gerente1.setBonus(20);
        gerente2.setBonus(30);
        gerente3.setBonus(40);

        vendedor1.setComissao(200);
        vendedor2.setComissao(300);
        vendedor3.setComissao(650);


        lista.adicionaFuncionario(gerente1);
        lista.adicionaFuncionario(gerente2);
        lista.adicionaFuncionario(gerente3);
        lista.adicionaFuncionario(vendedor1);
        lista.adicionaFuncionario(vendedor2);
        lista.adicionaFuncionario(vendedor3);




        int repeticaoMenu = 0;
        while(repeticaoMenu < 4) {
            System.out.println(menu.getMenuInicial());
            repeticaoMenu = Integer.parseInt(scanner.nextLine());
            switch (repeticaoMenu) {
                case 1 -> {
                    int repeticaoSubMenu = 0;
                    while (repeticaoSubMenu < 3) {
                        System.out.println(menu.getMenuAdicionando());
                        repeticaoSubMenu = Integer.parseInt(scanner.nextLine());
                        switch (repeticaoSubMenu) {
                            case 1, 2 -> {
                                System.out.println("Digite nome do funcionario: ");
                                String nome = scanner.nextLine();
                                valida.validaNome(nome);
                                if (valida.isNome()) {
                                    System.out.println("Digite o salario do funcionario: ");
                                    double salario = Double.parseDouble(scanner.nextLine());
                                    valida.validaSalario(salario);
                                    if (valida.isSalario()) {
                                        if (repeticaoSubMenu == 1) {
                                            Gerente gerente = new Gerente(nome, salario);
                                            lista.adicionaFuncionario(gerente);
                                        } else if (repeticaoSubMenu == 2) {
                                            Vendedor vendedor = new Vendedor(nome, salario);
                                            lista.adicionaFuncionario(vendedor);
                                        }
                                    }
                                }
                            }

                            case 3 -> {
                                System.out.println("Voltando");
                            }
                        }
                    }
                }

                case 2 -> {
                    System.out.println(menu.getMenuRemovendo());
                    int escolhaSubMenu = Integer.parseInt(scanner.nextLine());
                    if (escolhaSubMenu == 1) {
                        System.out.println("Digite o numero referente ao funcionario a remover\n");
                        ArrayList<Funcionario> removerFuncionarios = lista.exibeFuncionariosESalarioTotal();
                        if (!removerFuncionarios.isEmpty()) {
                            int remove = Integer.parseInt(scanner.nextLine());
                            if (remove <= removerFuncionarios.size() && remove > 0) {
                                System.out.println("Funcionario(a): " + lista.listaFuncionarios().get(remove - 1).getNome() + " Removido com sucesso");
                                lista.listaFuncionarios().remove(remove - 1);
                            } else {
                                System.out.println("Escolha inválida");
                            }
                        } else {
                            System.out.println("Não existem funcionarios cadastrados");
                        }
                    } else if (escolhaSubMenu == 2) {
                        System.out.println("Voltando");
                    } else {
                        System.out.println("Opção inválida");
                    }
                }

                case 3 -> {
                    lista.exibeFuncionariosESalarioTotal();
                }

                case 4 -> System.out.println("Saindo");

                default -> {
                    System.out.println("Opção inválida");
                    repeticaoMenu = 0;
                }
            }
        }
    }
}
