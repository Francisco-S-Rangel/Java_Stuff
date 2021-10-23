package exer_3;

public class Principal{
    public static void main(String[] args){
      Pessoa pessoa = new Pessoa();
      pessoa.inserirDados();
      pessoa.verInformacao();
      pessoa.horario();
      Aluno aluno = new Aluno();
      aluno.inserirDados();
      aluno.verInformacao();
      aluno.horario();
      Professor professor = new Professor();
      professor.inserirDados();
      professor.verInformacao();
      professor.horario();
    }
}