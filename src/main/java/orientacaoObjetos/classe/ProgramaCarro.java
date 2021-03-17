package orientacaoObjetos.classe;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro celta = new Carro();

        celta.AdicionaPessoa(3);
        celta.RemovePessoa(1);

        System.out.println("Quantidade de pessoas dentro do Celta: " + celta.getQuantidadePessoa());
    }
}
