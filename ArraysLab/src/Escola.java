public class Escola {

    Estudante[] estudante = new Estudante[300];
    String nome;
    String Email;
    String numTelefone;
    String endereco;

    void addEstudante(Estudante novoEstudante) {
        for (int i = 0; i < estudante.length; i++) {
            if (estudante[i] == null) {
                estudante[i] = novoEstudante;
                break;
            }
        }

    }

    void qtdEstudante() {
        int prim = 0;
        int seg = 0;
        int terc = 0;
        for (int i = 0; i < estudante.length; i++) {
            if (estudante[i] == null)
                break;
            switch (estudante[i].ano) {
                case 1 -> prim++;
                case 2 -> seg++;
                case 3 -> terc++;
            }

        }
        System.out.println("Alunos no primeiro ano: " + prim);
        System.out.println("Alunos no segundo ano:" + seg);
        System.out.println("Alunos no terceiro ano:" + terc);

    }

    void mostraInfos() {
        for (int i = 0; i < estudante.length; i++) {
            if (estudante[i] == null)
                break;
            System.out.println("Informações do Estudante ");
            System.out.println("Nome do Estudante: " + estudante[i].nome);
            System.out.println("Idade do Estudante: " + estudante[i].idade);
            System.out.println("Ano do Estudante: " + estudante[i].ano);


        }
    }
}

