import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente();
        float totalCompra = 0;
        int promo;

        Computador[] computador = new Computador[3];
        computador[0] = new Computador();
        computador[1] = new Computador();
        computador[2] = new Computador();

        computador[0].marca = "Positivo";
        computador[0].preco = 2300;
        computador[0].hardwareBasico.nome = "Pentium Core i3 (2200 Mhz), 8GB de RAM, 500GB de HD";
        computador[0].hardwareBasico.capacidade = 500;
        computador[0].sistemaOperacional.nome = "Sistema Operacional Linux Ubuntu";
        computador[0].sistemaOperacional.tipo = 32;
        computador[0].memoriaUSB.nome = "Acompanha Pen-Drive";
        computador[0].memoriaUSB.capacidade = 16;



        computador[1].marca = "Acer";
        computador[1].preco = 5800;
        computador[1].hardwareBasico.nome = "Pentium Core i5 (3370 Mhz), 16GB de RAM, 1TB de HD";
        computador[1].hardwareBasico.capacidade = 1000;
        computador[1].sistemaOperacional.nome = "Sistema Operacional Windows 8";
        computador[1].sistemaOperacional.tipo = 64;
        computador[1].memoriaUSB.nome = "Acompanha Pen-Drive";
        computador[1].memoriaUSB.capacidade = 32;


        computador[2].marca = "Vaio";
        computador[2].preco = 1800;
        computador[2].hardwareBasico.nome = "Pentium Core i7 (4500 Mhz), 32GB de RAM, 2TB de HD";
        computador[2].hardwareBasico.capacidade = 2000;
        computador[2].sistemaOperacional.nome = "Sistema Operacional Windows 10";
        computador[2].sistemaOperacional.tipo = 64;
        computador[2].memoriaUSB.nome = "Acompanha HD Externo";
        computador[2].memoriaUSB.capacidade = 1000;


        System.out.println("Bem vindo a PCMania!");

        System.out.print("Nos infome o seu nome: ");
        cliente.Nome = entrada.nextLine();

        System.out.print("Nos informe o seu cpf: ");
        cliente.cpf = entrada.nextLong();

        do {
            System.out.println("Escolha um PC para comprar (1 - Promoção1, 2 - Promoção2, 3 - Promoção3, 0 - Sair): ");

            promo = entrada.nextInt();

            switch (promo) {
                case 1:
                    computador[0].mostraPcConfigs();
                    totalCompra = cliente.calculaTotalCompra(totalCompra, computador[0].preco);
                    break;
                case 2:
                    computador[1].mostraPcConfigs();
                    totalCompra = cliente.calculaTotalCompra(totalCompra, computador[1].preco);
                    break;
                case 3:
                    computador[2].mostraPcConfigs();
                    totalCompra = cliente.calculaTotalCompra(totalCompra, computador[2].preco);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Obrigado!");
                    break;
                default:
                    System.out.println("Código inválido. Por favor, escolha novamente.");
                    break;
            }
        } while (promo != 0);

        System.out.println("Voce deseja adicionar mais memoria ?");

        System.out.println("Pois bem " + cliente.Nome + " do CPF " + cliente.cpf);
        System.out.println("o total foi de: " + totalCompra);



    }
}