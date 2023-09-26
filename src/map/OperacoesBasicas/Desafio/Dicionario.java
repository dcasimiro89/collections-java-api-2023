package map.OperacoesBasicas.Desafio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Dicionário não contém esta palavra");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            for (Map.Entry<String, String> entry : dicionarioMap.entrySet()) {
                System.out.println("Palavra: " + entry.getKey() + " / Definição: " + entry.getValue());
            }
        } else {
            System.out.println("Dicionário vazio");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada = null;
        if (!dicionarioMap.isEmpty()) {
            palavraPesquisada = dicionarioMap.get(palavra);
        } else {
            throw new RuntimeException("Conjunto vazio!");
        }
        return palavraPesquisada;

        /*
        String definicao = dicionario.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Linguagem não encontrada no dicionário.";
         */
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
