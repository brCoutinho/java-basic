package strings;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        var nome = "Thiago";
        var sobreNome = "Coutinho";
        final var nomeCompleto = nome + sobreNome;

        System.out.println(nome);

        var string = new String(" Minha String");//Redundante

        System.out.println("Char na posição: " + string.charAt(5));
        System.out.println("Quantidade de dígitos: " + string.length());
        System.out.println("Sem trim [" + string + "]");
        System.out.println("Com trim [" + string.trim() + "]");
        System.out.println("Lower: " + string.toLowerCase());
        System.out.println("Upper: " + string.toUpperCase());
        System.out.println("Contém M? " + string.contains("M"));
        System.out.println("Replace: " + string.replace("n","$"));
        System.out.println("Equals: " + string.equals(" Minha String"));
        System.out.println("EqualsIgnoreCase: " + string.equalsIgnoreCase(" minha sTrinG"));
        System.out.println("Substring(1,6)= " + string.substring(1,6));
    }
}
