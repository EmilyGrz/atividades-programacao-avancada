### ATIVIDADE 1 - SLIDE AULA 3 *FEITA!*
- Crie uma classe Pessoa com sobrecarga de construtores, utilize diferentes de informações (nome, idade, endereço, etc), crie um método para exibir as informações da pessoa, crie um atributo cpf e restrinja as permissões de acesso deste atributo.
- Criar uma classe Funcionario que herda as informações da classe Pessoa, use sobrecarga de construtores para inicializar com diferentes conjuntos de informações (cargo, salário, etc.).
- Faça um método getSalario() que indica o salário do funcionário, e depois crie uma sobrecarga do método getSalário() que calcula o salário a partir de um valor de bônus, que será informado como parâmetro do método.
- Faça a sobreposição do método de exibir informações, para exibir as informações do funcionário.

### ATIVIDADE 2 - SLIDE AULA 4 *FEITA!*
Criar uma classe abstrata ContaBancaria com os seguintes métodos:
- depositar(double valor)
- sacar(double valor) 
- exibirSaldo()
- Criar classes herdando da ContaBancaria:
#### ContaCorrente
- Adicionar o atributo tarifa, é um número real que indica o valor descontado para cada saque.
- Sobrescrever o método saque para descontar o valor da tarifa e imprimir na tela o valor descontado no saque,
#### ContaPoupanca
- Adicionar o atributo rendimentoMensal, que informa a porcentagem que a conta rende no mês.
- Crie o método aplicarRendimentoMensal que adiciona o rendimento do mês ao saldo.
- Criar interface Tributavel com o método calcularIR(), implemente esta interface na classe ContaCorrente.

### ATIVIDADE 3 - SLIDE AULA 5 *FEITA!*
Nas classes:
#### ContaCorrente
- Adicionar o atributo tarifa, é um número real e é sempre o mesmo para todas as contas. Torna-lo estático.
#### ContaPoupanca 
- Adicionar o atributo rendimentoMensal, que informa a porcentagem que a conta rende no mês. Este valor é sempre o mesmo para todas as contas. Torna-lo estático.
- Criar atributos nas ContaBancaria:
    - Titular: Nome do Titular da conta.
    - Agencia: Número da agencia
    - Conta: número da conta.

### ATIVIDADE 4 - SLIDE AULA 6 *FEITA!*
Crie uma classe Empresa
- Crie os seguinte atributos na empresa:
    - Nome;
    - CNPJ;
    - E-mails: Crie um array que permite o cadastro de até 5 e-mails;
    - Funcionários: uma lista com os funcionários da empresa (use a classe Funcionário, criada anteriormente)
    - Crie os métodos para cadastro, remoção e exibição de funcionários e e-mail

### ATIVIDADE 5 - SLIDE AULA 7 *FEITA!*
Refatore a classe de Empresa, para
- Usar um Set na listagem de e-mails
- Crie um atributo de produtos na empresa e use um map para cadastrar os produtos.
- Crie os métodos para cadastro, edição, remoção e listagem de produtos.

### ATIVIDADE 6 - SLIDE AULA 8 *FEITA!*(eu acho...)
- Na classe Empresa, crie uma lista de elementos da classe Produto.
- Crie uma stream de dados para filtrar essa lista por preço, quantidade de produtos e nome do produto.

### ATIVIDADE 7 - SLIDE AULA 10 *FEITA!*(eu acho...)
Na classe ContaBancaria: 
- Criar uma exceção personalizada SaldoInsuficienteException.
- Implementar o tratamento adequado para evitar saques indevidos.
