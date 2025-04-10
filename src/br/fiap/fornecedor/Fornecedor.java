package br.fiap.fornecedor;

public class Fornecedor {
    private String nome;
    private long cnpj;

    public Fornecedor (String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;

    }

    //metodo de acesso - get
    public String getNome(){
        return nome;
    }

    //metodo de alteração - set
    public void setNome(String nome){
        this.nome = nome;
    }

    //metodos usando um atalho - alt+insert
    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}
