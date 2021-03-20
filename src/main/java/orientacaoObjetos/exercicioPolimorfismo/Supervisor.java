package orientacaoObjetos.exercicioPolimorfismo;

public class Supervisor extends Funcionario{

    public double calculaImposto(){
        return getSalario() * 0.05;
    }
}
