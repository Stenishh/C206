package Model;

public class Grama extends Pokemon{

    public Grama(String nome, String tipo, int nivel, float peso) {
        super(nome, tipo, nivel, peso);


    }
    @Override
    public String getAtaque() {
        return "Chicote Selvagem";
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Este pokemon tem o ataque padrao do seu tipo: " + getAtaque());
    }
}
