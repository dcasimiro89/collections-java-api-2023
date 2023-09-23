package set.Ordenacao.Desafio;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(long matricula, String nome, double nota) {
        alunoSet.add(new Aluno(matricula, nome, nota));
    }

    public void removerAluno(long matricula) {
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoSet.remove(a);
                    break;
                }
            }
        } else {
            throw new RuntimeException("Conjunto vazio!");
        }
    }

    public Set<Aluno> exibirAlunoPorNome() {
        return new TreeSet<>(alunoSet);
    }

    public Set<Aluno> exibirAlunoPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public Set<Aluno> exibirAlunoPorMatricula() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorMatricula());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public void exibirAlunos() {
        for (Aluno a : alunoSet) {
            System.out.println("Matrícula: " + a.getMatricula()
                    + ", Nome: " + a.getNome()
                    + ", Nota: " + String.format("%.1f", a.getNota()));
        }
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno(4547, "Geraldo Casimiro", 9.0);
        gerenciadorAlunos.adicionarAluno(1125, "Deivison Casimiro", 8.5);
        gerenciadorAlunos.adicionarAluno(6985, "Rose Casimiro", 10.0);
        gerenciadorAlunos.adicionarAluno(1125, "Maria Joana", 8.5);
        gerenciadorAlunos.adicionarAluno(3789, "João da Silva", 9.5);

        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(1125);

        System.out.println();
        gerenciadorAlunos.exibirAlunos();

        System.out.println("\nEXIBINDO ALUNOS POR NOME");
        System.out.println(gerenciadorAlunos.exibirAlunoPorNome());

        System.out.println("\nEXIBINDO ALUNOS POR NOTA");
        System.out.println(gerenciadorAlunos.exibirAlunoPorNota());

        System.out.println("\nEXIBINDO ALUNOS POR MATRÍCULA");
        System.out.println(gerenciadorAlunos.exibirAlunoPorMatricula());
    }
}
