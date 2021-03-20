package orientacaoObjetos.exercicioPolimorfismo;

public class Atendente extends Funcionario{

    public double calculaImposto(){
        return getSalario() * 0.01;
    }
}
