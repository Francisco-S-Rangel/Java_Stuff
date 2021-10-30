package exer_1;

import javax.swing.JOptionPane;
public class Cliente implements Funcionalidade{
    private String nome;
    private String email;
    private String sexo;
    private int idade;
    Pedido pedido = new Pedido();
    Endereco endereco;

    public void Cadastrar(){
        String aux="",rua="indefinido",cep="indefinido";
        int numero = 0;
        this.setNome(JOptionPane.showInputDialog("Nome do Cliente: "));
        rua =JOptionPane.showInputDialog("Rua: ");
        aux = JOptionPane.showInputDialog("Numero: ");
        numero = Integer.parseInt(aux);
        cep = JOptionPane.showInputDialog("Cep: ");
        this.setEmail(JOptionPane.showInputDialog("Email do Cliente: "));
        this.setSexo(JOptionPane.showInputDialog("Sexo do Cliente: "));
        aux = JOptionPane.showInputDialog("Idade do Cliente: ");
        this.setIdade(Integer.parseInt(aux));
        inserirEndereco(rua, numero, cep);
        pedido.fazerPedido();

    }
    private void inserirEndereco(String rua,int numero,String cep){
        endereco = new Endereco(rua,numero,cep);
    }
    public void Verificar(){
        JOptionPane.showMessageDialog(null,"Dados do Cliente.\n\nNome: "+this.getNome()+"\nEmail: "+this.getEmail()+"\nSexo: "+this.getSexo() +
        "\nIdade: "+this.getIdade()+"\n\nEndereco:\nRua: "+endereco.getRua()+"\nNumero: "+endereco.getNumero()+"\nCep: "+endereco.getCep()+"\n");

        JOptionPane.showMessageDialog(null,"Dados do Pedido.\n\nProduto: " + pedido.getNome_produto() + "\nTipo: " + pedido.getTipo_produto()+
        "\nPreço: $" + pedido.getPreco() + "\nQuantidade: "+pedido.getQuantidade()+"\n");
    }
   public String getNome() {
       return nome;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }
   public String getEmail() {
       return email;
   }
   public void setEmail(String email) {
       this.email = email;
   }
   public String getSexo() {
       return sexo;
   }
   public void setSexo(String sexo) {
       this.sexo = sexo;
   }
   public int getIdade() {
       return idade;
   }
   public void setIdade(int idade) {
       this.idade = idade;
   }
}
