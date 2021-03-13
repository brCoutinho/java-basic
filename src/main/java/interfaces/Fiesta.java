package interfaces;

//Herança multipla
public class Fiesta implements Carro,Veiculo{
    @Override
    public String marca(){
        return "Ford";
    }

    @Override
    public String registro(){
        return "CDB342";
    }

    @Override
    public void ligar(){
        Carro.super.ligar();
        Veiculo.super.ligar();
        //Posso implementar um método ligar específico pra essa classe também

        //*Neste caso posso usar qualquer uma das três opções
    }
}
