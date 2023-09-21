package list.Ordenacao.Desafio.OrdenacaoNumero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordemCrescente = new ArrayList<>(numeros);
        if (!ordemCrescente.isEmpty()) {
            Collections.sort(ordemCrescente);
            return ordemCrescente;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordemDecrescente = new ArrayList<>(numeros);
        if (!ordemDecrescente.isEmpty()) {
            ordemDecrescente.sort(Collections.reverseOrder());
            return ordemDecrescente;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public void exibirLista() {
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public static void main(String[] args) {

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(69);
        ordenacaoNumeros.adicionarNumero(26);
        ordenacaoNumeros.adicionarNumero(133);
        ordenacaoNumeros.adicionarNumero(120);
        ordenacaoNumeros.adicionarNumero(70);

        System.out.println("IMPRESSÃO LISTA");
        ordenacaoNumeros.exibirLista();

        System.out.println("IMPRESSÃO LISTA ASCENDENTE");
        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println("IMPRESSÃO LISTA DESCENDENTE");
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }

}
