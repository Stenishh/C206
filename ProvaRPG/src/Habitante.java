public class Habitante {
    static int contador = 0;
    private int  id;
   private String nome;
    float energia; // Cade o modificador de acesso dela?, -3 pontos
    private Arma arma;
    // Não pedi nenhum construtor, o acesso é por "setters", -5 pontos
    public Habitante(int contador, int id, String nome, float energia,Arma arma) {
        this.id = ++contador;
        this.id = id;
        this.nome = nome;
        this.energia = energia;
}
    //! Penúltimo ponto de "notas importantes": "AVALIE corretamente com relação aos getters e setters."
    // -2 pontos
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Habitante.contador = contador;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public float getEnergia() {
        return energia;
    }
    // q q é isso jesus, -5 pontos
    public Arma getArma() {
        return arma;
    }

    public void getArma(Arma arma) {
        this.arma = arma;
    }



    public void mostraInfo() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Energia: " + energia);

    }
}

