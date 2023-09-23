package set.OperacoesBasicas.Desafio;

import java.util.HashSet;
import java.util.Set;

public class PalavrasUnicas {

    private Set<String> palavrasList;

    public PalavrasUnicas() {
        this.palavrasList = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasList.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasList.isEmpty()) {
            for (String p : palavrasList) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavrasList.remove(p);
                    break;
                }
            }
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    public boolean verificarPalavra(String palavra) {
        boolean temPalavra = false;
        if (!palavrasList.isEmpty()) {
            for (String p : palavrasList) {
                if (p.contains(palavra)) {
                    temPalavra = true;
                    break;
                }
            }
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
        return temPalavra;
    }

    public void exibirPalavrasUnicas() {
        System.out.println("LISTA DE PALAVRAS ÚNICAS");
        System.out.println(palavrasList);
    }

    public static void main(String[] args) {

        PalavrasUnicas palavrasUnicas = new PalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Abacaxi");
        palavrasUnicas.adicionarPalavra("Laranja");
        palavrasUnicas.adicionarPalavra("Banana");
        palavrasUnicas.adicionarPalavra("Morango");

        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.removerPalavra("Banana");

        palavrasUnicas.exibirPalavrasUnicas();

        boolean verificarPalavra = palavrasUnicas.verificarPalavra("Laranja");
        System.out.println("Tem palavra?: " + verificarPalavra);

    }
}
