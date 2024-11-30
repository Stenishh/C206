//! tem 2 main nessa bagunça aqui????????
public class TerraMedia {
    private Habitante[] habitantes = new Habitante[3];
    private int contador = 0;

    public static void main(String[] args) {
        TerraMedia terraMedia = new TerraMedia();


        Arma arma1 = new Arma("Espada", false);
        Arma arma2 = new Arma("Varinha", true);
        Arma arma3 = new Arma("Arma de fogo",false);


        Anao anao = new Anao(50,20,"Rogerio",50.3F,arma1,140,"Reino doce");
        Elfo elfo = new Elfo(20,21,"Sanders",100.60F,arma3,"Tribo dos banana");
        Mago mago = new Mago(60,22,"Ryze",60.50F,arma2,"Azul");

        // Add inhabitants to the list
        terraMedia.addHabitante(anao);
        terraMedia.addHabitante(elfo);
        terraMedia.addHabitante(mago);

        // Execute methods on the inhabitants
        for (Habitante habitante : terraMedia.habitantes) {
            if (habitante != null) {
                habitante.mostraInfo();
                if (habitante instanceof Cura) {
                    ((Cura) habitante).curar();
                }
                if (habitante instanceof Feitico) {
                    ((Feitico) habitante).lancaFeitico();
                }
            }
        }
    }

    public void addHabitante(Habitante habitante) {
        if (contador < habitantes.length) {
            habitantes[contador] = habitante;
            contador++;
        } else {
            System.out.println("O array está cheio");
        }
    }

    public Habitante[] getHabitantes() {
        return habitantes;
    }
}