package exer_1;

import javax.swing.JOptionPane;
public class Produto {
    private String nome_produto;
    private String tipo_produto;
    private double preco;
    Catalogo catalogo;

    public void Escolher_Carro(){
        String aux;
        catalogo = new Catalogo();
        aux = JOptionPane.showInputDialog("Escolha a categoria do Carro:\n1-Popular\n2-Luxo");
        if(aux.equals("1")){
            this.setNome_produto(catalogo.Popular());
            this.setTipo_produto("Popular");
            this.setPreco(50000);
        }else if(aux.equals("2")){
            this.setNome_produto(catalogo.Luxo());
            this.setTipo_produto("Luxo");
            this.setPreco(1000000);
        }
    }
    public String getNome_produto() {
        return nome_produto;
    }
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    public String getTipo_produto() {
        return tipo_produto;
    }
    public void setTipo_produto(String tipo_produto) {
        this.tipo_produto = tipo_produto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
