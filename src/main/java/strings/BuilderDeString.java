package strings;

public class BuilderDeString {
    public static void main(String[] args) {
        var nome = "Thiago";

        final var builder = new StringBuilder(nome);
        System.out.println(builder.append("Henrique"));

        final var reverse = builder.reverse();
        System.out.println(reverse);

        final var insert = reverse.insert(0, "#").insert(reverse.length(),"#");
        System.out.println(insert);
    }
}
