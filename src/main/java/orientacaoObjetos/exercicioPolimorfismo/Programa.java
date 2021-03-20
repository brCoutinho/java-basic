package orientacaoObjetos.exercicioPolimorfismo;

public class Programa {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Thiago");
        gerente.setSalario(10000);

        Supervisor supervisor = new Supervisor();
        supervisor.setNome("Antônio");
        supervisor.setSalario(10000);

        Atendente atendente = new Atendente();
        atendente.setNome("Julio");
        atendente.setSalario(10000);

        System.out.println("Salário do Gerente: " + gerente.getSalario());
        System.out.println("Salário do Supervisor: " + supervisor.getSalario());
        System.out.println("Salário do Atendente: " + atendente.getSalario());

        System.out.println("Imposto Gerente: "  + gerente.calculaImposto());
        System.out.println("Imposto Supervisor: "  + supervisor.calculaImposto());
        System.out.println("Imposto Atendente: "  + atendente.calculaImposto());
    }
}
