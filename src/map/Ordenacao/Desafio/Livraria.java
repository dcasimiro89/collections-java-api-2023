package map.Ordenacao.Desafio;

import java.util.*;

public class Livraria {

    public static void main(String[] args) {


        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
            put("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05));
            put("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99));
            put("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
            put("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
            put("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));
        }};
//        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
//            System.out.println(livro.getKey() + " - " + livro.getValue().getTitulo());
//        }

        List<Map.Entry<String, Livro>> entryList = new ArrayList<>(meusLivros.entrySet());
        Collections.sort(entryList, new ComparatorPorPreco());
        for (Map.Entry<String, Livro> x : entryList) {
            System.out.println(x.getValue().getTitulo() + " - " + x.getValue().getPreco());
        }
    }

}
