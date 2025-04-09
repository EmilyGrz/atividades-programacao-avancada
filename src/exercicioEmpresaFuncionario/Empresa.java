package exercicioEmpresaFuncionario;
import java.util.*;

public class Empresa {
    private String nome;
    private String cnpj;
    private Set<String> emails;
    private ArrayList<Funcionario> funcionarios;
    private Map<String, Double> produtos;
    private List<Produto> listaProdutos;


    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.emails = new HashSet<>();
        this.funcionarios = new ArrayList<>();
        this.produtos = new HashMap<>();
        this.listaProdutos = new ArrayList<>();

    }

    // Método para adicionar e-mail
    public boolean adicionarEmail(String email) {
        return emails.add(email);
    }

    // Método para remover e-mail
    public boolean removerEmail(String email) {
        return emails.remove(email);
    }

    // Método para exibir e-mails
    public void exibirEmails() {
        System.out.println("E-mails da empresa:");
        for (String email : emails) {
            System.out.println(email);
        }
    }

    // Método para adicionar funcionário
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para remover funcionário
    public boolean removerFuncionario(String nomeFuncionario) {
        return funcionarios.removeIf(f -> f.nome.equalsIgnoreCase(nomeFuncionario));
    }

    // Método para exibir funcionários
    public void exibirFuncionarios() {
        System.out.println("Funcionários da empresa:");
        for (Funcionario f : funcionarios) {
            System.out.println(f.nome);
        }
    }

    // Métodos para adicionar produtos na lista
    public void adicionarProdutoNaLista(Produto produto) {
    listaProdutos.add(produto);
}
   // Métodos para filtrar produtos usando Stream
    public void filtrarProdutos(double precoMin, int quantidadeMin, String nomeContem) {
    System.out.println("Produtos filtrados:");
    listaProdutos.stream()
        .filter(p -> p.getPreco() >= precoMin)
        .filter(p -> p.getQuantidade() >= quantidadeMin)
        .filter(p -> p.getNome().toLowerCase().contains(nomeContem.toLowerCase()))
        .forEach(System.out::println);
   }
    
    // Métodos para manipulação de produtos
    public void adicionarProduto(String nome, double preco) {
        produtos.put(nome, preco);
    }

    public boolean editarProduto(String nome, double novoPreco) {
        if (produtos.containsKey(nome)) {
            produtos.put(nome, novoPreco);
            return true;
        }
        return false;
    }

    public boolean removerProduto(String nome) {
        return produtos.remove(nome) != null;
    }

    public void listarProdutos() {
        System.out.println("Produtos da empresa:");
        for (Map.Entry<String, Double> entry : produtos.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + " - Preço: R$ " + entry.getValue());
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
