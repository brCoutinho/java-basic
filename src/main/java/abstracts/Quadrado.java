package abstracts;

public class Quadrado extends FormaGeometrica{

    private String nome;
    private Double area;

    public Quadrado(final String nome, final Double area){
        this.nome = nome;
        this.area = area;
    }

    @Override
    public String nome(){
        return nome;
    }

    @Override//Sobrescrita do método
    //Se não houver sobrescrita a classe que herda de uma abstrata não vai poder ser implementada
    public Double area() {
        return null;
    }



}
