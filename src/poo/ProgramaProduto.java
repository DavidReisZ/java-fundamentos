package poo;

public class ProgramaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("David",24.00,3);
        Produto produto1 = new Produto("Luiza",30.00,2);
        Produto produto2 = new Produto("Joao",44.00,7);

        double total= produto.calcularValorTotalEstoque();

        double total1 = produto1.calcularValorTotalEstoque();

        double total2 = produto2.calcularValorTotalEstoque();

        System.out.println("Produto: " +produto.getNome()+  " ,Preco do produto: "+ produto.getPreco() + " ,Quantidade do Estoque: " + produto.getQuantidadeEstoque()+ " ,Total " + total);

        System.out.println("Produto: " +produto1.getNome()+  " ,Preco do produto: "+ produto1.getPreco() + " ,Quantidade do Estoque: " + produto1.getQuantidadeEstoque()+ " ,Total " + total1);

        System.out.println("Produto: " +produto2.getNome()+  " ,Preco do produto: "+ produto2.getPreco() + " ,Quantidade do Estoque: " + produto2.getQuantidadeEstoque()+ " ,Total " + total2);
    }
}
