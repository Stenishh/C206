package Model;

import java.util.ArrayList;

public class Pokedex {
    private final ArrayList<Pokemon> pokemons;

    public Pokedex() {
        this.pokemons = new ArrayList<>();
    }

    public void adicionarPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }
    public void exibirTodosPokemons() {
        for (Pokemon pokemon : pokemons) {
            ((Pokemon) pokemon).exibirDetalhes();
            System.out.println("--------------------");
        }
    }

    public void exibirPokemonsPorTipo(String tipo) {
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getTipo().equalsIgnoreCase(tipo)) {
                pokemon.exibirDetalhes();
                System.out.println("--------------------");
            }
        }
    }

}
