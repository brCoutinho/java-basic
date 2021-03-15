package strings;

import java.util.Arrays;

public class ExercicioString {
    public static void main(String[] args) {
        String[] textoSeparado = "Thiago; thiagocoutinho@gmail.com; 15000".split(";");
        System.out.println(Arrays.toString(textoSeparado));

        System.out.println("Aula".concat(" de Java"));

        System.out.println("1234 asda qw".replace("a","#"));


    }
}
