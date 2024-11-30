public class Zumbi2 {

    double vida; // vida do zumbi, da instancia
    String nome;
    double vida(){

        System.out.println("mostrando a vida"+ vida);
        return 0;
    }
    void transferir(Zumbi2 zumbi_recebe, double qntd ){ // zumbi_Recebe tem acesso a toda classe Zumbi2

        vida = vida - qntd;
        zumbi_recebe.vida = vida; // zumbi alvo recebendo a vida
    }


}
