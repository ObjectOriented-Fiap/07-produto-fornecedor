package br.fiap.produto;

import br.fiap.fornecedor.Fornecedor;

public class Produto {
    private String nome;
    private double valor;
    private int quantidadeEstoque;

    Fornecedor fornecedor;

   public Produto(String nome, int quantidadeEstoque, double valor, Fornecedor fornecedor){
       this.nome = nome;
       this.quantidadeEstoque = quantidadeEstoque;
       this.valor = valor;
       this.fornecedor = fornecedor;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
