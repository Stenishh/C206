package Model;

public class Agua extends Pokemon {

    public Agua(String nome, String tipo, int nivel, float peso) {
        super(nome, tipo, nivel, peso);


    }

    @Override
    public String getAtaque() {
        return "Jato de agua";
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Este pokemon tem o ataque padrao do seu tipo: " + getAtaque());
    }

}
