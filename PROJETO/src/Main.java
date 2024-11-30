import Model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();

        Eletrico pokemon1 = new Eletrico("Pikachu", "Eletrico", 10, 100);
        Agua pokemon2 = new Agua("Squirtle", "Agua", 15, 50);
        Fogo pokemon3 = new Fogo("Charmander", "Fogo", 40, 67);
        Grama pokemon4 = new Grama("Bulbasaur", "Grama", 10, 53);
        Normal pokemon5 = new Normal("Eevee", "Normal", 5, 20);

        Eletrico pokemon6 = new Eletrico("Electabuzz", "Eletrico", 60, 190);
        Agua pokemon7 = new Agua("Pliplup", "Agua", 55, 30);
        Fogo pokemon8 = new Fogo("Chimchar", "Fogo", 59, 97);
        Grama pokemon9 = new Grama("Torterra", "Grama", 100, 600);
        Normal pokemon10 = new Normal("Meowth", "Normal", 13, 40);

        Treinador treinador1 = new Treinador("Ash", "todos");
        Treinador treinador2 = new Treinador("Misty", "agua");
        Treinador treinador3 = new Treinador("Brock", "Grama");
        Treinador treinador4 = new Treinador("Red", "Fogo e Normal");
        Treinador treinador5 = new Treinador("Professor Carvalho", "Cientista");

        pokedex.adicionarPokemon(pokemon1);
        pokedex.adicionarPokemon(pokemon2);
        pokedex.adicionarPokemon(pokemon3);
        pokedex.adicionarPokemon(pokemon4);
        pokedex.adicionarPokemon(pokemon5);
        pokedex.adicionarPokemon(pokemon6);
        pokedex.adicionarPokemon(pokemon7);
        pokedex.adicionarPokemon(pokemon8);
        pokedex.adicionarPokemon(pokemon9);
        pokedex.adicionarPokemon(pokemon10);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Escolha uma opção:\n" +
                    "1. Exibir todos os Pokémon\n" +
                    "2. Filtrar por tipo\n" +
                    "3. Sair\n" +
                    "Opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\nExibindo todos os Pokémon:");
                    pokedex.exibirTodosPokemons();
                    break;
                case "2":
                    System.out.print("Digite o tipo de Pokémon que deseja ver na Pokedex: ");
                    String tipoEscolhido = scanner.nextLine().toLowerCase();
                    System.out.println("\nPokémons do tipo " + tipoEscolhido + ":");
                    pokedex.exibirPokemonsPorTipo(tipoEscolhido);
                    break;
                case "3":
                    System.out.println("Desligando Pokedex. Adeus!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println("--------------------");
        }
    }
}
