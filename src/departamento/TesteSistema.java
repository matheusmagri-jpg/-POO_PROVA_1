package departamento;


import java.util.Scanner;


public class TesteSistema {

    public static void main(String[] args) {
        
        Departamento compras = new Departamento("Compras") {};
        
        Departamento vendas = new Departamento ("Vendas") {};

        Cargo comprador = new Cargo ("Comprador") {};
        Cargo vendedor = new Cargo ("Vendedor") {};

        
        Funcionario f1 = new Funcionario("Matheus Magri", "119.741.906-33", vendas, vendedor, 3000.00);
       
        Funcionario f2 = new Funcionario("Matheus Silva Magri", "119.741.906-33", compras, comprador, 3500.00);
       
        Funcionario f3 = new Funcionario();

        System.out.println("====== FUNCIONARIOS CRIADOS ======");
        System.out.println(f1);
        System.out.println();
        System.out.println(f2);
        System.out.println();
        System.out.println(f3);
        System.out.println();

        System.out.println("====== DADOS ALTERADOS - F3 ====== ");
        f3.alterarDados("RODRIGO", "111.111.111-11", vendas, vendedor, 2800.00);
        System.out.println(f3);
        System.out.println();

        System.out.println("====== REAJUSTE DE 15% - F1 ======");
        f1.aplicarReajuste(15.0);
        System.out.println(f1);
        System.out.println();
        System.out.println();

        System.out.println("====== FUNCIONARIO DEMITIDO - F3 ======");
        f2.demitir();
        System.out.println("F3 foi demitido.\n");

        System.out.println("====== LISTA FINAL DE FUNCIONÁRIOS ======");
        System.out.println(f1);
        System.out.println();
        System.out.println(f2);
        System.out.println();
        System.out.println(f3);
    }
}
