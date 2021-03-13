package interfaces;

public interface Carro {
    String marca();

    //Caso eu crie um novo método e o mesmo não seja default e sim abstrato
    //Meu código irá parar de funcionar pois terei que implementar esse método
    //nas classe Celta e Fiesta. Caso eu opte por default não será necessário
    default void ligar(){
        System.out.println("Ligando o Carro");
    }
}
