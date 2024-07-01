package Recebimento;

import Estoque.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Adicione dados ao produto: ");
        System.out.print("Produto: ");
        produto.nome = scan.nextLine();
        System.out.print("Preço: ");
        produto.preco = scan.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto.quantEstoque = scan.nextInt();

        System.out.print("Dados do Produto: " + produto);

        System.out.println();
        System.out.print("Digite o numero de produtos que vão ser adicionados em estoque: ");
        int quantidade = scan.nextInt();
        produto.addProduto(quantidade);

        System.out.println();
        System.out.println("Atualização: " + produto);

        System.out.println();
        System.out.print("Digite o numero de produtos que vão ser removidos em estoque: ");
        quantidade = scan.nextInt();
        produto.removeProduto(quantidade);

        System.out.println();
        System.out.println("Atualização: " + produto);

        scan.close();
    }

}