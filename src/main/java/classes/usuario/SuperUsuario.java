package classes.usuario;

public class SuperUsuario {
    private String login;
    private String senha;
    String nome;

    //Construtor: define como vai ser construída essa classe quando for instanciado um novo objeto
    public SuperUsuario(final String login, final String senha){
        this.login = login;
        this.senha = senha;
    }

    public String getLogin(){
        return login;
    }

    protected String getSenha(){
        return senha;
    }
}
