package orientacaoObjetos.classe;

public class Carro {
    private String modelo;
    private String ano;
    private int quantidadePessoa;

    public Carro(){
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadePessoa() {
        return quantidadePessoa;
    }

    public void setQuantidadePessoa(int quantidadePessoa) {
        this.quantidadePessoa = quantidadePessoa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void AdicionaPessoa(int numeroPessoaAdicionada){
        this.quantidadePessoa = quantidadePessoa + numeroPessoaAdicionada;
    }

    public void RemovePessoa(int numeroPessoaRemovida){
        this.quantidadePessoa = quantidadePessoa - numeroPessoaRemovida;
    }
}
