public class Arma {
    private String nome;
    private boolean isMagica;

    // Construtor
    public Arma(String nome, boolean isMagica) {
        this.nome = nome;
        this.isMagica = isMagica;
    }
    //! Penúltimo ponto de "notas importantes": "AVALIE corretamente com relação aos getters e setters."
    // -2 pontos
    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //! Penúltimo ponto de "notas importantes": "AVALIE corretamente com relação aos getters e setters."
    // -2 pontos
    public boolean isMagica() {
        return isMagica;
    }

    public void setMagica(boolean isMagica) {
        this.isMagica = isMagica;
    }


}
