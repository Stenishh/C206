import java.util.HashMap;

public class FETIN {
    HashMap<String, Double> projetosNotas;

    public FETIN() {
        this.projetosNotas = new HashMap<>();
    }

    public void adicionarProjeto(String nomeProjeto, double nota) throws Exception {
        if (projetosNotas.containsKey(nomeProjeto)) {
            System.out.println("Projeto com nome duplicado!");
        }

        if (nota < 6.0) {
            System.out.println("Nota insuficiente para FETIN!");
        }

        projetosNotas.put(nomeProjeto, nota);
        System.out.println("Projeto cadastrado com sucesso.");
    }
}
