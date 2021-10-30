package exer_1;

import javax.swing.JOptionPane;
public class Pedido extends Produto{
    private int quantidade;

    public void fazerPedido(){
        String auxiliar= " ";
        Escolher_Carro();
        auxiliar = JOptionPane.showInputDialog("Quantos modelos desse carrro: ");
        this.setQuantidade(Integer.parseInt(auxiliar));
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
  
}
