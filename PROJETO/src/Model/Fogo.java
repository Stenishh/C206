package Model;

public class Fogo extends Pokemon{

    public Fogo(String nome, String tipo, int nivel, float peso) {
        super(nome, tipo, nivel, peso);


    }
    @Override
    public String getAtaque() {
        return "Explosao de lava";
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Este pokemon tem o ataque padrao do seu tipo: " + getAtaque());
    }
}
