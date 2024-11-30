public class Usuario {

    String nome;
    String email;
    RedeSocial[] redesSociais;

    // Construtor com parâmetros para adicionar nome, email e redes sociais
    public Usuario(String nome, String email, RedeSocial[] redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

}
