public class Elfo extends Habitante implements Cura{
    // Cade o modificador de acesso dela?, -3 pontos
    String tribo;

    // Não pedi nenhum construtor, o acesso é por "setters", -5 pontos
    public Elfo(int contador, int id, String nome, float energia,Arma arma,String tribo) {
        super(contador, id, nome, energia,arma);
        this.tribo = tribo;


    }
    public void viajar(){
        System.out.println("O elfo viajou!");

    }
    //! Não sobrescreveu o método, -8 pontos
    public void atacar() {
        System.out.println(getNome() + " está atacando com " + getArma().getNome());
    }
    //! Não sobrescreveu o método, -3 pontos
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tribo"+ this.tribo);

    }

    @Override
    public void curar() {
        System.out.println("Foi curado!");
        // tem q usar a energia do personagem
        float aux2 = getEnergia() * 1.15f;
    }
}


