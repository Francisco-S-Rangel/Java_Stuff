package exer_3;

import javax.swing.JOptionPane;
public class Pessoa{
    private String nome;
    private String Cpf;
    private int idade;
    Endereco endereco;
    
    public void inserirDados(){
        String aux,rua,cep;
        int numero;
        this.setNome(JOptionPane.showInputDialog("Nome: "));
        this.setCpf(JOptionPane.showInputDialog("Cpf: "));
        aux = JOptionPane.showInputDialog("Idade: ");
        this.setIdade(Integer.parseInt(aux));
        rua = JOptionPane.showInputDialog("Rua: ");
        aux = JOptionPane.showInputDialog("Numero: ");
        numero = Integer.parseInt(aux);
        cep = JOptionPane.showInputDialog("Cep: ");
        inserirEndereco(rua, numero, cep);
    }
    protected void inserirEndereco(String rua,int numero,String cep){
        endereco = new Endereco(rua, numero, cep);
    }
    public void verInformacao(){
        JOptionPane.showMessageDialog(null,"Pessoa.\n\nNome: "+nome
        +"\nCpf: "+Cpf+"\nIdade: "+ idade + "\n\nEndereço\n"+"\nRua: "+endereco.getRua()+
        "\nNumero: " + endereco.geNumero()+ "\nCep: " + endereco.getCep());
    }
    public void horario(){
        JOptionPane.showMessageDialog(null,"\nRotina.\n\n- Acorda as 6h.\n- Toma café as 6:30.\n- Almoça ao 12h."+
        "\n- toma café as 17h.\n- Janta as 21h.\n- Vai dormir as 23h.");
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setCpf(String cpf) {
        Cpf = cpf;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Endereco getEndereco() {
        return endereco;
    }
}