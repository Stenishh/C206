import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao;
        Escola escola = new Escola();
        Estudante estudante = new Estudante();

        escola.nome = "Colegio Mundial";
        escola.Email = "EscolaMundial@gmail.com";
        escola.numTelefone = "4002-8922";
        escola.endereco = "Rua dos Palmares, 42";
        escola.mostraInfos();

        do {

            System.out.println("1. Cadastrar Estudante");
            System.out.println("2. Mostrar Informações dos Estudantes");
            System.out.println("3. Mostrar Quantidade de Alunos por Ano");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpar o buffer após a leitura do número

            switch (opcao) {
                case 1:

                    System.out.println("Nome do estudante: ");
                    estudante.nome = entrada.nextLine();
                    System.out.println("Idade do estudante: ");
                    estudante.idade = entrada.nextInt();
                    System.out.println("Ano do estudante: ");
                    estudante.ano = entrada.nextInt();
                    escola.addEstudante(estudante);
                    entrada.nextLine(); // Limpando buffer
                    break;

                case 2:
                    System.out.println("Informações dos Estudantes:");
                    escola.mostraInfos();
                    entrada.nextLine();
                    break;
                case 3:
                    escola.qtdEstudante();
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    entrada.nextLine();
                    break;

            }
        } while (opcao != 4);


        entrada.close();

    }
}