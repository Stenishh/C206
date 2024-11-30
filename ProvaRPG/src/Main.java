//! Nota: 39
public class Main {
    public static void main(String[] args) {
        TerraMedia terraMedia = new TerraMedia();

        // Create instances of Arma
        Arma arma1 = new Arma("Espada", false);
        Arma arma2 = new Arma("Varinha", true);
        Arma arma3 = new Arma("Arma de fogo", false);

        // Create instances of Anao, Elfo, and Mago
        Anao anao = new Anao(50, 20, "Rogerio", 50.3F, arma1, 140, "Reino doce");
        Elfo elfo = new Elfo(20, 21, "Sanders", 100.60F, arma3, "Tribo dos banana");
        Mago mago = new Mago(60, 22, "Ryze", 60.50F, arma2, "Azul");

        // Add inhabitants to the list
        terraMedia.addHabitante(anao);
        terraMedia.addHabitante(elfo);
        terraMedia.addHabitante(mago);

        // Execute methods on the inhabitants
        for (Habitante habitante : terraMedia.getHabitantes()) {
            if (habitante != null) {
                habitante.mostraInfo();

                if (habitante instanceof Cura) {
                    ((Cura) habitante).curar();
                }
                if (habitante instanceof Feitico) {
                    ((Feitico) habitante).lancaFeitico();
                }
                System.out.println();
            }
        }
    }
}
