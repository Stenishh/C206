import java.util.Scanner;
import Exception.ProjetoDuplicadoException;
import Exception.NotaInsuficienteException;

public class Main {
    public static void main(String[] args) {
        FETIN fetin = new FETIN();
        Scanner scanner = new Scanner(System.in);

        boolean continuar;

        do {
            try {
                System.out.print("Digite o nome do projeto: ");
                String nomeProjeto = scanner.nextLine();
                System.out.print("Digite a nota do projeto " + nomeProjeto + ": ");
                double notaProjeto = scanner.nextDouble();
                scanner.nextLine();

                fetin.adicionarProjeto(nomeProjeto, notaProjeto);

            } catch (ProjetoDuplicadoException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            } finally {
                System.out.print("Deseja adicionar outro projeto? (Digite 'sim' para continuar e 'nao' para sair): ");
                String resposta = scanner.nextLine();
                continuar = resposta.equalsIgnoreCase("sim");
            }
        } while (continuar);

        scanner.close();
        System.out.println("Final do programa.");
    }
}
