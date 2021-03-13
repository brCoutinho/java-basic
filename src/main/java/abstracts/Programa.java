package abstracts;

public class Programa {
    public static void main(String[] args) {
        final FormaGeometrica quadrado = new Quadrado("Quadrado", 13.0);

        System.out.println(quadrado.nome());
    }
}
