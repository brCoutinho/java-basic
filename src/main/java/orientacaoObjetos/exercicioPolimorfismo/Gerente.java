package orientacaoObjetos.exercicioPolimorfismo;

public class Gerente extends Funcionario{

    public double calculaImposto(){
        return getSalario() * 0.01;
    }
}
