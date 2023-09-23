package set.Pesquisa.Desafio;

public class Tarefa {

    private String descricaoTarefa;
    private boolean tarefaConcluida;

    public Tarefa(String tarefa) {
        this.descricaoTarefa = tarefa;
    }

    public Tarefa(String tarefa, boolean tarefaConcluida) {
        this.descricaoTarefa = tarefa;
        this.tarefaConcluida = tarefaConcluida;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String tarefa) {
        this.descricaoTarefa = tarefa;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public String toString() {
        return "{Descrição: " + descricaoTarefa + ", Status Tarefa: "
            + tarefaConcluida + "}";
    }
}
