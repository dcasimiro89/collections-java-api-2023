package list.Desafio.SomaNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    List<Integer> numerosList;

    public SomaNumeros() {
        numerosList = new ArrayList<>();
    }

    public void adicionaNumero(int numero) {
        numerosList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numerosList.isEmpty()) {
            for (Integer i : numerosList) {
                soma += i;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        return Collections.max(numerosList);
    }

    public int encontrarMenorNumero() {
        return Collections.min(numerosList);
    }

    public void exibirNumeros() {
        System.out.println(numerosList);
    }

    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionaNumero(34);
        somaNumeros.adicionaNumero(57);
        somaNumeros.adicionaNumero(69);
        somaNumeros.adicionaNumero(58);
        somaNumeros.adicionaNumero(66);
        somaNumeros.adicionaNumero(18);

        System.out.println("Soma da lista: " + somaNumeros.calcularSoma());
        System.out.println("Maior Número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor Número: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Lista números: ");
        somaNumeros.exibirNumeros();
    }
}
