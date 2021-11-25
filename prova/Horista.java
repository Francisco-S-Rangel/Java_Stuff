package prova;

import javax.swing.JOptionPane;
public class Horista extends Professor {
   Horista(String nome,String cpf,int idade, double salario,String rua,int numero,String cep, String bairro,String materia,int anos){
       super( nome, cpf, idade, salario,rua, numero, cep, bairro, materia, anos);
   }
   public void MostrarDados(){
    super.MostrarDados();
 }
}
