package list.Desafio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> lixeira = new ArrayList<>();
        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                lixeira.add(item);
            }
        }
        carrinho.removeAll(lixeira);
    }

    public double calcularValorTotal() {
        double soma = 0.0;
        for (Item item : carrinho) {
            soma += item.getPreco() * item.getQuantidade();
        }
        return soma;
    }

    public void exibirItens() {
        //System.out.println(carrinho);
        for (Item i : carrinho) {
            System.out.println("Item: " + i.getNome()
                    + ", Preço: " + String.format("R$%.2f", i.getPreco())
                    + ", Qtd: " + i.getQuantidade());
        }
    }

}
