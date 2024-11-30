public class Main {
    public static void main(String[] args) {
        // Criação das redes sociais
        Facebook facebook = new Facebook("patinhofeio", 500);
        Instagram instagram = new Instagram("senhaInsta123", 300);

        // Criação do array de redes sociais
        RedeSocial[] redesSociais = {facebook, instagram};

        // Criação do usuário
        Usuario usuario = new Usuario("Robson", "RobsonAmaShadowEmAcao@gmail.com", redesSociais);

        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Do email: " + usuario.getEmail());
        System.out.println();

        // Usando as redes sociais
        for (int i = 0; i < redesSociais.length; i++) {
            System.out.println("Usando a rede social " + (i + 1) + ":");

            if (redesSociais[i] instanceof Compartilhamento) {
                ((Compartilhamento) redesSociais[i]).compartilhar();
            }
            if (redesSociais[i] instanceof VideoConferencia) {
                ((VideoConferencia) redesSociais[i]).fazStreaming();
            }

            if (i == 0) {  // Para a primeira rede social

                redesSociais[i].curtirPublicacao();
            } else {  // Para a segunda rede social

                redesSociais[i].postarVideo();

                redesSociais[i].postarComentario();

                redesSociais[i].postarFoto();
            }

            System.out.println();
        }
    }
}
