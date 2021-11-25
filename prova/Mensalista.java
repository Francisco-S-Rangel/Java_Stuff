package prova;

import javax.swing.JOptionPane;
public class Mensalista extends Professor {
    Mensalista(String nome,String cpf,int idade, double salario,String rua,int numero,String cep, String bairro,String materia, int anos){
        super( nome, cpf, idade, salario,rua, numero, cep, bairro, materia, anos);
    }
    public void MostrarDados(){
       super.MostrarDados();
    }
    public void MostrarSalarioMensal(){
        double ordenado = super.getSalario() * 8;
        ordenado = ordenado * 22;
        ordenado = ordenado - (ordenado*(0.005));
        JOptionPane.showMessageDialog(null,"\n\nSalario Mensal: " + ordenado );
    }
     
}