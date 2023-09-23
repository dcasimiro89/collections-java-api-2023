package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();
        numeros.add(40);
        numeros.add(49);
        numeros.add(42);
        numeros.add(42);
        numeros.add(44);
        System.out.println(numeros.size());

        for(Integer i : numeros) {
            System.out.println(i);
        }


    }
}
