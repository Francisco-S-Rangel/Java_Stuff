package prova;

import javax.swing.JOptionPane;
abstract class Professor implements Obrigatorio{
    private String nome;
    private String cpf;
    private int idade;
    private int anos_lecionando;
    private double salario;
    private Disciplina disciplina;
    private Endereco endereco;

    Professor(String nome,String cpf,int idade, double salario,String rua,int numero,String cep, String bairro,String materia,int anos){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
        endereco = new Endereco(rua, numero, cep, bairro);
        disciplina = new Disciplina(materia);
        this.anos_lecionando = anos;
    }
    public void MostrarDados(){
        JOptionPane.showMessageDialog(null,"Professor.\n\nNome: "+this.getNome()
        +"\nCpf: "+this.getCpf()+"\nIdade: "+ this.getIdade()+"\nMateria: "+ disciplina.getDisciplina()
        + "\nSalario por hora: " + this.getSalario() +"\nAnos Lecionando: " + this.getAnosLecionando()+"\n\nEndereço\n" + "\nRua: "+endereco.getRua()+
        "\nNumero: " + endereco.geNumero()+ "\nCep: " + endereco.getCep() + "\nBairro: " + endereco.getBairro());
    };
    protected void inserirEndereco(String rua,int numero,String cep,String bairro){
        endereco = new Endereco(rua, numero, cep, bairro);
    }
    protected void inserirDisciplina(String materia){
        disciplina = new Disciplina(materia);
    }
    private String getNome(){
        return this.nome;
    }
    private String getCpf(){
        return this.cpf;
    }
    private int getIdade() {
        return this.idade;
    }
    public double getSalario() {
        return this.salario;
    }
    private int getAnosLecionando(){
        return this.anos_lecionando;
    }
}