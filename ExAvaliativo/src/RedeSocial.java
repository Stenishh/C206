public abstract class RedeSocial {
    protected String senha; // pq tem o hashtag
    protected int NumAmigos;

    public RedeSocial(String senha, int NumAmigos) {

        this.senha = senha;
        this.NumAmigos = NumAmigos;

    }

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();
    public void curtirPublicacao() {
    }

}
