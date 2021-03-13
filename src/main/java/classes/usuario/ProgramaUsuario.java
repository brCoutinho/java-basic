package classes.usuario;

public class ProgramaUsuario {
    //atalho: psvm
    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("Thiago", "asd.123");

        superUsuario.getLogin();
        superUsuario.getSenha();

        //atalho: sout
        System.out.println(superUsuario.getLogin());
        System.out.println(superUsuario.getSenha());
    }

}
