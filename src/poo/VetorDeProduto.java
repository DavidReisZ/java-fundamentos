package poo;



public class VetorDeProduto {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
       produtos[0] = new Produto("David",24.00,3);
       produtos[1] = new Produto("Luiza",30.00,2);
       produtos[2] = new Produto("Joao",44.00,7);

      double soma = 0;
       for (int i = 0; i < produtos.length; i++) {
           soma = soma + produtos[i].calcularValorTotalEstoque();

            System.out.println( "Nome "+ produtos[i].getNome()+ " Preco do produto: "+ produtos[i].getPreco()+ " Valor em estoque: "+ produtos[i].getQuantidadeEstoque()+ " Total: "+ produtos[i].calcularValorTotalEstoque());

        }
        System.out.println("O total dessa soma é: "+ soma);

    }


}
