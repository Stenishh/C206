package Model;

public abstract class Pokemon {
     String nome;
     String tipo;
     int nivel;
     float peso;

    public Pokemon(String nome, String tipo, int nivel, float peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public float getPeso() {
        return peso;
    }


    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nível: " + nivel);
        System.out.println("Peso: " + peso);

    }

    public abstract String getAtaque();
}
