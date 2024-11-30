public class Main3 {
    public static void main(String[] args) {

        // criando zumbis
        Zumbi3 zumbi1 = new Zumbi3();
        Zumbi3 zumbi2 = new Zumbi3();

        // declarando a vida dos zumbis
        zumbi1.vida = 86.45;
        zumbi2.vida = 74.93;

        System.out.println("Vidas dos zumbis!");
        System.out.println(zumbi1.vida);
        System.out.println(zumbi2.vida);

        zumbi1 = zumbi2; // igualando os dois objetos

        System.out.println("Vida deles igualadas:");
        System.out.println("zumbi 1: " + zumbi1.vida);
        System.out.println("Zumbi 2: " + zumbi2.vida);


    }
}