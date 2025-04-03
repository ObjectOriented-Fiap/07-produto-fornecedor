package br.fiap.util;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;
import br.fiap.fornecedor.Fornecedor;
import br.fiap.produto.Produto;


public class Util {
    private Produto[] produto = new Produto[2];
    private Fornecedor[] fornecedor = new Fornecedor[2];
    private int idxProduto = 0;
    private int idxFornecedor = 0;


    //metodo do menu principal
    public void menuPrincipal(){
        int opcao;
        String msg = "1. Cadastrar produto \n 2. Pesquisar produto por nome \n 3.Pesquisar fornecedor por CNPJ \n 4.Finalizar";

        while (true){
            opcao = parseInt(showInputDialog(msg));
//            if (opcao == 4){
//                return;
//            }
            switch (opcao){
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    pesquisarProduto();
                    break;
                case 3:
                    pesquisarFornecedor();
                    break;
                case 4:
                    return;
                default:
                    showMessageDialog(null,"Opção inválida");
            }
        }

    }


    //metodo para cadastrar produtos
    private void cadastrarProduto(){
        String nome;
        int quantidadeEstoque;
        double valor;

        Fornecedor fornecedor = pesquisarFornecedor();
        if (fornecedor == null){
            fornecedor = casdastrarFornecedor();
        }
        nome = showInputDialog("Nome do produto:");
        quantidadeEstoque =parseInt(showInputDialog("Quantidade em estoque:"));
        valor = parseDouble(showInputDialog("Valor unitário:"));
        produto[idxProduto] = new Produto(nome,quantidadeEstoque,valor,fornecedor);
        idxProduto++;
    }

    //metodo para cadastrar fornecedor
    private Fornecedor casdastrarFornecedor(){
        String nome;
        long cnpj;
        nome = showInputDialog("Nome do fornecedor:");
        cnpj = parseLong(showInputDialog("CNPJ:"));
        fornecedor[idxFornecedor] = new Fornecedor(nome,cnpj);
        idxFornecedor++;
        return fornecedor[idxFornecedor - 1];
    }


    //metodo para pesquisar os produtos
    private void pesquisarProduto(){
        String aux = "Produto não encontrado";
        String nome = showInputDialog("Nome do produto:");
        for (int i = 0; i < idxProduto; i++) {
            if (produto[i].getNome().equalsIgnoreCase(nome)){
                aux = "";
                aux += "Nome do produto:" + nome + "\n";
                aux += "Valor unitário:" + produto[i].getValor() + "\n";
                aux += "Quantidade no estoque:" + produto[i].getQuantidadeEstoque() + "\n";
                aux += "Fornecedor:" + produto[i].getFornecedor().getNome() + "\n";
            }
        }
        showMessageDialog(null, aux);
    }

    //metodo para pesquisar fornecedor
    private Fornecedor pesquisarFornecedor() {
        long cnpj = parseLong(showInputDialog("CNPJ do fornecedor:"));
        for (int i = 0; i < idxFornecedor; i++) {
            if (fornecedor[i].getCnpj() == cnpj) {
                return fornecedor[i];
            }
        }
        showMessageDialog(null, "Fornecedor não encontrado");
        return null;
    }

}



