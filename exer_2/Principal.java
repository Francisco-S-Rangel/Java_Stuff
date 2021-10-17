package exer_2;

public class Principal {
    public static void main(String[] args){
        //Declarando obj professor
        Professor professor = new Professor();
        //Inserindo os valores de seus respctivos atributos
        professor.setNome("Afonso Aguiar da Silva");
        professor.setIdade(45);
        professor.setData_nascimento("07/02/1976");
        professor.setData_admissao("10/10/2010");
        professor.setSalario(5000);
        professor.setDisciplina("Matematica");
        professor.setHoras_aula(8);
        // Chamando metodos 
        professor.verInformacao();
        professor.horario_aulas();
    }
}
