public class Mago extends Habitante implements Cura,Feitico{
    String cor;  // Cade o modificador de acesso dela?, -3 pontos
    // Não pedi nenhum construtor, o acesso é por "setters", -5 pontos
    public Mago(int contador, int id, String nome, float energia,Arma arma,String cor) {
        super(contador, id, nome, energia,arma);
        this.cor = cor;
    }
    public void atacar(){
        System.out.println("O mago atacou!");

    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor do magia"+ this.cor);

    }
    // a energia é do "Habitante"
    @Override
    public void curar() {
        System.out.println("Foi curado!");
        float aux = getEnergia() * 1.15f;
    }

    @Override
    public void lancaFeitico() {
        System.out.println(getNome() + " lançou um feitiço.");
        float aux = getEnergia() * 0.9f;
    }
}
