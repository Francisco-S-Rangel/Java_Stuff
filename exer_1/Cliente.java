package exer_1;

import javax.swing.JOptionPane;
public class Cliente implements Funcionalidade{
    private String nome;
    private String email;
    private String sexo;
    private int idade;
    private Pedido pedido = new Pedido();
    private Endereco endereco;

    //Possui apenas dois metodos publicos para não possibilitar o uso inadequdo do software !!
    public void Cadastrar(){
        String aux="",rua="indefinido",cep="indefinido";
        int numero = 0;
        JOptionPane.showMessageDialog(null,"Bem Vindo ao Dream Cars !\n\nFaça o Cadatro e escolha seu Carro do sonhos.");
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
   private String getNome() {
       return nome;
   }
   private void setNome(String nome) {
       this.nome = nome;
   }
   private String getEmail() {
       return email;
   }
   private void setEmail(String email) {
       this.email = email;
   }
   private String getSexo() {
       return sexo;
   }
   private void setSexo(String sexo) {
       this.sexo = sexo;
   }
   private int getIdade() {
       return idade;
   }
   private void setIdade(int idade) {
       this.idade = idade;
   }
}
