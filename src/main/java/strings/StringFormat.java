package strings;

public class StringFormat {
    public static void main(String[] args) {
        var nome = "Thiago";
        var sobreNome = "Pires";

        final var nomeCompleto = nome + " " + sobreNome;

        System.out.println("Nome: " + nome);

        final var mensagem = String.format("O nome é %s e o sobrenome é %s", nome,sobreNome);
        System.out.println(mensagem);

        System.out.println(String.format("Numero %.2f ", 1.2375d));
    }
}
