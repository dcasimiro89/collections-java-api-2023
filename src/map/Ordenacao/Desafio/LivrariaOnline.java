package map.Ordenacao.Desafio;

import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

//    public void adicionarLivro(String link, String titulo, String autor, double preco) {
//        livroMap.put(link, new Livro(titulo, autor, preco));
//    }

    public void adicionarLivro(String link, Livro livro) {
        livroMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        if (!livroMap.isEmpty()) {
           for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
               if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                   livroMap.remove(titulo);
               }
           }
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {

        List<Map.Entry<String, Livro>> ordemPreco = new ArrayList<>(livroMap.entrySet());
        Collections.sort(ordemPreco, new ComparatorPorPreco());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : ordemPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Livro> entry : livrosOrdenadosPorPreco.entrySet()) {
            String link = entry.getKey();
            String titulo = entry.getValue().getTitulo();
            String autor = entry.getValue().getAutor();
            double preco = entry.getValue().getPreco();

            System.out.println("link: " + link
                    + " | Título: " + titulo
                    + " | Autor: " + autor
                    + " | Preço: " + preco);
        }
    }

    public void exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> entryList = new ArrayList<>(livroMap.entrySet());
        entryList.sort(new ComparatorPorAutor());
        for (Map.Entry<String, Livro> entry : entryList) {
            System.out.println("Autor: " + entry.getValue().getAutor()
                    + ", Título: " + entry.getValue().getTitulo());
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorTitulo() {
        List<Map.Entry<String, Livro>> entryList = new ArrayList<>(livroMap.entrySet());
        if (!entryList.isEmpty()) {
            entryList.sort(new ComparatorPorTitulo());
        }
        Map<String, Livro> entryMap = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : entryList) {
            entryMap.put(entry.getKey(), entry.getValue());
        }
        return entryMap;
    }

    public void exibirLivrosOrdenadosPorTituloFormatado() {
        List<Map.Entry<String, Livro>> entryList = new ArrayList<>(livroMap.entrySet());
        entryList.sort(new ComparatorPorTitulo());
        for (Map.Entry<String, Livro> entry : entryList) {
            System.out.println("Título: " + entry.getValue().getTitulo()
                    + ", Autor: " + entry.getValue().getAutor());
        }
    }

    public void pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> pesquisaPorAutor = new HashMap<>(livroMap);
        if (!livroMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : pesquisaPorAutor.entrySet()) {
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                    System.out.println("Autor: " + entry.getValue().getAutor()
                            + " | Título: " + entry.getValue().getTitulo());
                }
            }
        }
        //return pesquisaPorAutor;
    }

    public String obterLivroMaisCaro() {
        String livroMaisCaro = "";
        double precoMaisCaro = Double.MIN_VALUE;

        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getPreco() > precoMaisCaro) {
                livroMaisCaro = entry.getValue().getTitulo();
                precoMaisCaro = entry.getValue().getPreco();
            }
        }
        return livroMaisCaro;
    }

    public String obterLivroMaisBarato() {
        String livroMaisBarato = "";
        double precoMaisBarato = Double.MAX_VALUE;

        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getPreco() < precoMaisBarato) {
                livroMaisBarato = entry.getValue().getTitulo();
                precoMaisBarato = entry.getValue().getPreco();
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {

        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        // Exibe todos os livros ordenados por preço
        //System.out.println("\nexibirLivrosOrdenadosPorPreco()");
        //livrariaOnline.exibirLivrosOrdenadosPorPreco();
        //System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livros ordenados por autor
        //System.out.println("\nexibirLivrosOrdenadosPorAutor()");
        //livrariaOnline.exibirLivrosOrdenadosPorAutor();
        //System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        //System.out.println("\nexibirLivrosOrdenadosPorTitulo()");
        livrariaOnline.exibirLivrosOrdenadosPorTituloFormatado();
        System.out.println("\n" + livrariaOnline.exibirLivrosOrdenadosPorTitulo());

        // Pesquisa livros por autor
//        String autorPesquisa = "Josh Malerman";
//        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);
//
//        // Obtém e exibe o livro mais caro
//        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());
//
//        // Obtém e exibe o livro mais barato
//        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());
//
//        // Remover um livro pelo título
//        livrariaOnline.removerLivro("1984");
//        System.out.println(livrariaOnline.livroMap);
    }
}
