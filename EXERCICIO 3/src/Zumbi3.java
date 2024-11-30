public class Zumbi3 {

    double vida;
    String nome;

    void vida(){
        System.out.println(vida);
    }
    void transferir(Zumbi3 zumbi_recebe, double qntd ){

        vida = vida - qntd;
        zumbi_recebe.vida = vida;
    }


}
