package map.Pesquisa.Desafio;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        }
    }

    public int exibirContagemPalavras() {
        int somaPalavras = 0;
        if (!palavras.isEmpty()) {
            for (Integer i : palavras.values()) {
                somaPalavras += i;
            }
        }
        return somaPalavras;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = "";
        int quantidadePalavraMaisFrequente = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > quantidadePalavraMaisFrequente) {
                palavraMaisFrequente = entry.getKey();
                quantidadePalavraMaisFrequente = entry.getValue();
            }
        }
        return palavraMaisFrequente;
    }

    public void encontrarPalavraMaisFrequente2() {
        String palavraMaisFrequente = "";
        int quantidadePalavraMaisFrequente = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > quantidadePalavraMaisFrequente) {
                palavraMaisFrequente = entry.getKey();
                quantidadePalavraMaisFrequente = entry.getValue();
            }
        }
        System.out.println("Palavra Frequente: " + palavraMaisFrequente);
        System.out.println("Contagem: " + quantidadePalavraMaisFrequente);
    }

    public int encontrarPalavraMaisFrequente3() {
        String palavraMaisFrequente = "";
        int quantidadePalavraMaisFrequente = Integer.MIN_VALUE;
        for (Integer s : palavras.values()) {
            if (s > quantidadePalavraMaisFrequente) {
                //palavraMaisFrequente = entry.getKey();
                quantidadePalavraMaisFrequente = s;
            }
        }
        return quantidadePalavraMaisFrequente;
    }

    public Integer encontrarPalavra(String palavra) {
        Integer encontrarPalavra = null;
        if (!palavras.isEmpty()) {
            encontrarPalavra = palavras.get(palavra);
        }
        return encontrarPalavra;
    }

    public void exibirPalavras() {
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("Ruby", 3);
        contagemLinguagens.adicionarPalavra("C#", 6);

        contagemLinguagens.exibirPalavras();

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);

        contagemLinguagens.removerPalavra("Ruby");

        System.out.println();
        contagemLinguagens.exibirPalavras();

        /*

        System.out.println();
        contagemLinguagens.encontrarPalavraMaisFrequente2();

        System.out.println();
        System.out.println(contagemLinguagens.encontrarPalavraMaisFrequente3());

        System.out.println();
        System.out.println("Quantidade da palavra: " + contagemLinguagens.encontrarPalavra("Java"));

         */
    }
}
