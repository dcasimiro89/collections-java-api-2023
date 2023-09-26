package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

    private Map<String, Integer> agendaContatosMap;

    public AgendaContato() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public Integer pesquisaNumeroPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public static void main(String[] args) {

        AgendaContato agendaContatos = new AgendaContato();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 68574);
        agendaContatos.adicionarContato("Camila Cavalcante", 654821);
        agendaContatos.adicionarContato("Camila Dio", 123456);
        agendaContatos.adicionarContato("Maria Silva", 230247);
        agendaContatos.adicionarContato("Camila", 4444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisaNumeroPorNome("Camila Dio"));
    }
}
