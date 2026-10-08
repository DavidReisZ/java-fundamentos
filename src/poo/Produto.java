package poo;

public class Produto {
    private String nome;
    public String getNome(){
        return nome;
    }

    private double preco;
    public double getPreco(){
        return preco;
    }

    private int quantidadeEstoque;
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    Produto(String nome,double preco,int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    double calcularValorTotalEstoque(){
        return preco * quantidadeEstoque;
    }


}
