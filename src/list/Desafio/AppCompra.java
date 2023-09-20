package list.Desafio;

public class AppCompra {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Feijão", 6.99, 2);
        carrinho.adicionarItem("Arroz", 23.00, 3);
        carrinho.adicionarItem("Feijão", 6.99, 2);
        carrinho.adicionarItem("Melancia", 6.79, 4);

        carrinho.exibirItens();
        System.out.println("Total: R$" + carrinho.calcularValorTotal());

        System.out.println();

        carrinho.removerItem("Feijão");
        carrinho.exibirItens();
        System.out.println("Total: R$" + carrinho.calcularValorTotal());
    }
}
