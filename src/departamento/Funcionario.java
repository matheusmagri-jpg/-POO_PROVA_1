
package departamento;


public class Funcionario {
    
    private String nome;
    private String cpf;
    private Departamento departamento;
    private Cargo cargo;
    private double salario;
    private boolean ativo;

    
    
    public Funcionario() {
        this.nome = "Indefinido";
        this.cpf = "000.000.000-00";
        this.departamento = null;
        this.cargo = null;
        this.salario = 0.0;
        this.ativo = false;
    }

    
    
    public Funcionario(String nome, String cpf, Departamento departamento, Cargo cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;
    }

    
    
    public void alterarDados(String nome, String cpf, Departamento departamento, Cargo cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
    }

    
    
    public void aplicarReajuste(double percentual) {
        this.salario = this.salario * percentual / 100;
    }

    
    
    public void demitir() {
        this.ativo = false;
    }

    
    @Override
    public String toString() {
        String nomeDepartamento = (departamento != null)
                ? departamento.getNome() : "Departamento não Definido";
        String nomeCargo = (cargo != null)
                ? cargo.getNome() : "Cargo não Definido";
        String situacao = ativo ? "ATIVO" : "INATIVO";

          return "Nome: " + nome
            + "\nCPF: " + cpf
            + "\nDepartamento: " + nomeDepartamento
            + "\nCargo: " + nomeCargo
            + "\nSalário: R$ " + salario
            + "\nSituação: " + situacao;
                
    }
}
 