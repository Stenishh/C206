package Model;

public class Normal extends Pokemon{

    public Normal(String nome, String tipo, int nivel, float peso) {
        super(nome, tipo, nivel, peso);


    }
    @Override
    public String getAtaque() {
        return "Investida rapida";
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Este pokemon tem o ataque padrao do seu tipo: " + getAtaque());
    }
}
