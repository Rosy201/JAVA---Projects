package Estoque;

public class Produto {
    public String nome;
    public double preco;
    public int quantEstoque;

    public double totalValorEstoque() {
        return preco*quantEstoque;
    }
    public void addProduto (int quantEstoque) {
//  o {this} serve como referenciar o objeto na classe em caso de ambiguidade
//  entre obj. e o paramentro da funcao add//
        this.quantEstoque += quantEstoque;
    }
    public void removeProduto (int quantEstoque) {
        this.quantEstoque -= quantEstoque;
    }
//    a funcao (toString()) vai converter o obj. em string para retorna o pedido e nao a "memoria"
    public String toString() {
        return nome + " , $" + preco + " , " + quantEstoque + " unidades, total: $ " + totalValorEstoque();
    }

}

