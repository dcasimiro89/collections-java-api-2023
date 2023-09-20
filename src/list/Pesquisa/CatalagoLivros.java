package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> livrosList;

    public CatalagoLivros() {
        livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalorAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalorAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalorAnos.add(livro);
                }
            }
        }
        return livrosPorIntervalorAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                }
                break;
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalagoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalagoLivros.pesquisarPorIntervalorAnos(2020, 2022));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
