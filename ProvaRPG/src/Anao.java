public class Anao extends Habitante implements Mineracao{
    int altura;
    // Cade o modificador de acesso dela?, -6 pontos
    String reino;

    public Anao(int contador, int id, String nome, float energia,Arma arma, int altura,String reino) {
        super(contador,id,nome,energia,arma);
        this.altura = altura;
        this.reino = reino;

    }
    public void atacar() {
        System.out.println(getNome() + " está atacando with " + getArma().getNome());
        Arma arma = getArma();
        // era pra ter pego a energia do personagem e ter subtraido dela, -5 pontos
        if (arma.isMagica()) {
            float aux = getEnergia() - 20;
        } else {
            float aux = getEnergia() - 10;
        }
    }

    //! Não sobrescreveu o método, -4 pontos
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Altura"+ this.altura);
        System.out.println("Reino"+ this.reino);

    }

    @Override
    public void minerar() {
        System.out.println("O anao esta mineirando!");

    }
}
