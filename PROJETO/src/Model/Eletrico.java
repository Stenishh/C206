package Model;

public class Eletrico extends Pokemon {
    public Eletrico(String nome, String tipo, int nivel, float peso) {
        super(nome, tipo, nivel, peso);


    }
    @Override
    public String getAtaque() {
        return "Bomba eletrica";
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Este pokemon tem o ataque padrao do seu tipo: " + getAtaque());
    }
}
