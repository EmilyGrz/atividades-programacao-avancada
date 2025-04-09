package exercicioEmpresaFuncionario;
public class Main {
    public static void main(String[] args) throws Exception {
        
        String nome = "Ana Carol";
        int idade = 20;
        String endereco = "Ponta Grossa";
        String cpf = "119.455.699.05";
        float salario = 12345;
        String cargo = "Analista";

        Pessoa p = new Pessoa(nome, idade, cpf, endereco);

       p.exibirInfo();

        Funcionario f = new Funcionario(nome, salario, cargo);

        System.out.println("\nSalario Funcionario " + f.nome + " com bonus: " + "R$" + f.getSalario(500));

        f.exibirInfo();

        Empresa e = new Empresa("Tech & CIA", "12.345.678/0001-91");

        e.adicionarProduto(new Produto("Notebook", 5000.0, 5));
        e.adicionarProduto(new Produto("Mouse", 50.0, 50));
        e.adicionarProduto(new Produto("Monitor", 400.0, 10));
        e.adicionarProduto(new Produto("Cadeira Gamer", 2500.0, 2));

        e.filtrarProdutos(1000.0, 3, "o");  // Esse exmplo filtra produtos com preço >= 1000, quantidade >= 3 e nome contendo "o"


    }
}
