  # Gerenciador de funcionarios
  
  ## Nesse pequeno projeto eu pedi para nossa querida AI chatGpt para me fazer um exercício, ele disse oque queria que eu fizesse, então é isso ai.
  
  - ## Class Funcionario
  1. Na class Funcionario criei os seguintes atributos privados nome, salario, salariototal, e alguns getters e setters para que eu possa manipular esses atributos.
  2. Também criei um construtor de Funcionario obrigando a inserção de parâmetros nome e salario.
  3. Também fiz a implementação de uma interface que efetua um calculo de salario total.
     
  - ## Class Gerente
  1. Tornei ela class filha de Funcionario, adicionei um atributo de bonus e fiz o getter e setter do mesmo.
  2. O método implementado de calcular salario é feito através de um setter em funcionario.
     
  - ## Class Vendedor
  1. Tornei ela class filha de Funcionario, adicionei um atributo de comissao e fiz o getter e setter do mesmo.
  2. O método implementado de calcular salario é feito através de um setter em funcionario.
     
  - ## Class Gerenciamento de funcionários
  1. Nessa class fiz uma lista que recebe o tipo Funcionario que logo por sua vez recebe os filhos.
  2. Criei um metodo de adicionar um tipo Funcionario a lista.
  3. Também criei um método de exibir a lista de funcionarios dentro desse Array usando um Foreach e se não existir objetos na lista ele retorna uma mensagem "Nenhum funcionario registrado".
     
  - ## Class ValidaInformacao
  1. Criei dois atributos boolean de nome e salario para fazer uma verificação se os dados entregues pelo usuário são válidos ou não.
     
  - ## Class MenuStrings
  1. Fiz uma class para armazenar alguns menus, <h3>talvez não seja uma boa ideia, mas ainda estou começando nisso então vou aprendendo.
  2. E fiz métodos para que eu pudesse chamar elas na Class principal.
     
  - ## Interface Calculos
  1. Aqui criei o metodo de calcularSalario que é implementado na class Funcionario e herdado pelas classes Gerente e Vendedor que por sua vez executam seus próprios métodos.

  - ## Class principal
  1. Primeiramente nessa class fiz a construção dos seguinte objetos
     1. Criei um objeto MenuStrings menu, para que eu possa chamar os menus em String da class MenuString.
     2. O Scanner scanner para que o usuário possa interagir.
     3. Criei o objeto ValidaInformacao valida que valida as informações dadas pelo usuario.
     4. Criei o a lista GerenciamentoDeFuncionarios lista para armazenar os objetos do tipo Funcionarios.
     5. Fiz a criação de alguns objetos do tipo Funcionario e usei um setter para adicionar um valores a alguns atributos desses objetos em questão.
        
  2. Criei a opção de adicionar um Funcionario, Que adiciona um Gerente ou Vendedor, após o usuário entregar os dados nome e salário e eles forem validados, o objeto é criado e adiciona a lista.
  3. Criei também a opção de remover os funcionarios, que remove os funcionarios.
  4. Outra opção uma que exibe o nome e o salário total de cada funcionário na lista.  
      
