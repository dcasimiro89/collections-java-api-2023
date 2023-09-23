package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(numero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Deivison", 123456);
        agendaContatos.adicionarContato("Deivison", 0); // não foi adicionado
        agendaContatos.adicionarContato("Deivison Casimiro", 456789);
        agendaContatos.adicionarContato("Deivison Savio", 252546);
        agendaContatos.adicionarContato("Camila Silva", 123456);

        agendaContatos.exibirContato();

        System.out.println("\nPESQUISA POR NOME:");
        System.out.println(agendaContatos.pesquisarPorNome("Deivison"));

        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Camila Silva", 585874);
        System.out.println("\nCONTATO ATUALIZADO: " + contatoAtualizado);

        System.out.println("\nCONJUNTO ATUALIZADO:");
        agendaContatos.exibirContato();
    }
}
