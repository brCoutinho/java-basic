package statics;

public class Programa {
    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Quadrúpede";
        //Aqui eu alterei o atributo zoologia para Quadrupede no cachorro pitbull
        //onde na classe veio estatico como Bípede
        //como eu alterei estaticamente alterou em todas as instancias
        //e o cachorro vira latas se tornará um Quadrupede também

        final Cachorro viraLatas = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viraLatas.zoologia);

        //Por ser estático esse método pode ser chamado ser ser instanciado
        Cachorro.late();
    }
}
