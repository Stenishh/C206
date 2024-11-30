import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arquivo arquivo = new Arquivo("Arquivo.txt");

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        while (true) {
            System.out.println("1. Dar informações do veículo");
            System.out.println("2. Mostrar as informações dos veículos salvos");
            System.out.println("3. Ordenar os veículos em ordem decrescente de ano");
            System.out.println("4. Mostrar a quantidade de veículos de cada marca disponíveis em estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Motor novoMotor = new Motor();
                    Veiculo novoVeiculo = new Veiculo();
                    try {
                        System.out.print("Digite a marca Rolls-Royce ou Bentley (escreva desse jeito): ");
                        novoVeiculo.setMarca(sc.nextLine());

                        System.out.print("Digite o modelo: ");
                        novoVeiculo.setModelo(sc.nextLine());

                        System.out.print("Digite o ano: ");
                        int ano = Integer.parseInt(sc.nextLine());
                        if (ano < 1960 || ano > 2024) {
                            throw new ValorInvalidoException("Ano inválido!");
                        }
                        novoVeiculo.setAno(ano);

                        System.out.print("Digite os km rodados: ");
                        double kmRodados = Double.parseDouble(sc.nextLine());
                        if (kmRodados < 0) {
                            throw new ValorInvalidoException("Km Rodados não pode ser negativo!");
                        }
                        novoVeiculo.setKmRodados(kmRodados);

                        System.out.print("Digite a potência do motor: ");
                        double potencia = Double.parseDouble(sc.nextLine());
                        if (potencia <= 0) {
                            throw new ValorInvalidoException("Potência do motor não pode ser negativa ou nula!");
                        }
                        novoMotor.setPotencia(potencia);

                        System.out.print("Digite o número de cilindros do motor: ");
                        int numCilindros = Integer.parseInt(sc.nextLine());
                        if (numCilindros <= 0) {
                            throw new ValorInvalidoException("Número de cilindros do motor não pode ser negativo ou nulo!");
                        }
                        novoMotor.setNumCilindros(numCilindros);

                        novoVeiculo.setMotor(novoMotor);

                        arquivo.escreverVeiculo(novoVeiculo);
                        System.out.println("Veículo cadastrado com sucesso!");
                    } catch (ValorInvalidoException | NumberFormatException e) {
                        System.out.println("Erro ao cadastrar veículo: " + e.getMessage());
                    }
                    break;

                case 2:
                    veiculos = arquivo.ler();
                    for (Veiculo veiculo : veiculos) {
                        veiculo.mostraInfos();
                    }
                    break;

                case 3:
                    arquivo.ordenarVeiculos(veiculos);
                    break;

                case 4:
                    arquivo.mostrarQuantidadePorMarca(veiculos);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}