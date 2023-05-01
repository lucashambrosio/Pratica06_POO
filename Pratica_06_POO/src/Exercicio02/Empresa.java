package Exercicio02;

public class Empresa {
    private int qtdeDeFuncionario;
    private String nome;
    private String cnpj;
    private int qtdeFuncionario;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int qtdeDeFuncionario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeDeFuncionario = qtdeDeFuncionario;
        this.funcionarios = new Funcionario[qtdeDeFuncionario];
    }

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

    public int getQtdeDeFuncionario() {
        return qtdeDeFuncionario;
    }

    public void setQtdeDeFuncionario(int qtdeDeFuncionario) {
        this.qtdeDeFuncionario = qtdeDeFuncionario;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void adicionaFuncionario(Funcionario funcionario) {
        for (int i = 0; i < qtdeDeFuncionario; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = funcionario;
                break;
            }
        }
    }

    public void mostraFuncionarios() {
        for (int i = 0; i < qtdeDeFuncionario; i++) {
            if (funcionarios[i] != null) {
                System.out.println("Funcionario " + (i + 1) + ":");
                funcionarios[i].mostraDados();
            }
        }
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", "joao@mail.com", "111111111", "Departamento 1", 2000.0, "01/01/2021", true);
        Funcionario f2 = new Funcionario("Maria", "maria@mail.com", "222222222", "Departamento 2", 3000.0, "01/02/2021", true);
        Funcionario f3 = new Funcionario("Pedro", "pedro@mail.com", "333333333", "Departamento 1", 2500.0, "01/03/2021", true);
        Funcionario f4 = new Funcionario("Ana", "ana@mail.com", "444444444", "Departamento 3", 4000.0, "01/04/2021", true);
        Funcionario f5 = new Funcionario("Lucas", "lucas@mail.com", "555555555", "Departamento 2", 3500.0, "01/05/2021", true);

        Funcionario[] funcionarios = {f1, f2, f3, f4, f5};

        for (Funcionario f : funcionarios) {
            f.bonificar(500.0);
        }

        Empresa empresa = new Empresa("Empresa X", "123456789", 100);

        for (Funcionario f : funcionarios) {
            empresa.adicionaFuncionario(f);
        }

        empresa.mostraFuncionarios();
    }
}