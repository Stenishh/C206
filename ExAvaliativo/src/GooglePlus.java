public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento{

    public GooglePlus(String senha, int NumAmigos){
        super(senha,NumAmigos);

    }
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Google!");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Google!");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Google!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Google!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no Google!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicacao no Google!");
    }


}
