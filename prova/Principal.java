package prova;


import javax.swing.JOptionPane;
public class  Principal {
    public static void main(String[] args){

    Mensalista mensalista;

    String nome,cpf,rua,cep,bairro,disciplina,aux;
    int idade,numero,anos;
    double salario ;
   
   JOptionPane.showMessageDialog(null,"Insera os Dados do Professor!");
   nome = JOptionPane.showInputDialog("Nome: ");
   cpf = JOptionPane.showInputDialog("Cpf: ");
   aux = JOptionPane.showInputDialog("Idade: ");
   idade = Integer.parseInt(aux);
   aux =  JOptionPane.showInputDialog("Salario por Hora: ");
   salario = Double.parseDouble(aux);
   rua = JOptionPane.showInputDialog("Rua: ");
   aux = JOptionPane.showInputDialog("Numero da Residencia: ");
   numero = Integer.parseInt(aux);
   cep = JOptionPane.showInputDialog("Cep: ");
   bairro = JOptionPane.showInputDialog("Bairro: ");
   disciplina = JOptionPane.showInputDialog("Disciplina que Leciona: ");
   aux = JOptionPane.showInputDialog("Anos Lecionando: ");
   anos = Integer.parseInt(aux);



   mensalista = new Mensalista(nome,cpf,idade,salario,rua,numero,cep,bairro,disciplina,anos);
   mensalista.MostrarDados();
   mensalista.MostrarSalarioMensal();
        
    }   
}
