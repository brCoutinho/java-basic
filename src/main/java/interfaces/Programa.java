package interfaces;

public class Programa {
    public static void main(String[] args) {
        final Celta celta = new Celta();
        System.out.println("Marca do Celta: " + celta.marca());
        celta.ligar();

        final Trator trator = new Trator();
        System.out.println("Registro do trator: " + trator.registro());
        trator.ligar();

        final Fiesta fiesta = new Fiesta();
        fiesta.ligar();
    }
}
