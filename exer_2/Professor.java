package exer_2;

public class Professor extends Funcionario{
    private String disciplina;
    private int horas_aula;

    public void verInformacao(){
        System.out.print("Professor.\n\n");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade:"+this.getIdade());
        System.out.println("Data de Nascimento: "+this.getData_nascimento());
        System.out.println("Data de adimissão: "+this.getData_admissao());
        System.out.println("Salario: "+this.getSalario());
        System.out.println("Disciplina: "+this.getDisciplina());
        System.out.println("Horas de Aula: "+this.getHoras_aula());
    }
    public void horario_aulas(){
        System.out.print("\nHorarios das Aulas.\n");
        System.out.println("- 1º Aula: das 8h das 9h.");
        System.out.println("- 2º Aula: das 9h das 10h.");
        System.out.println("- 3º Aula: das 10h das 11h.");
        System.out.println("- 4º Aula: das 11h das 12h.");
        System.out.println("- 5º Aula: das 13h das 14h.");
        System.out.println("- 6º Aula: das 14h das 15h.");
        System.out.println("- 7º Aula: das 15h das 16h.");
        System.out.println("- 8º Aula: das 16h das 17h.");
        
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setHoras_aula(int horas_aula) {
        this.horas_aula = horas_aula;
    }
    public int getHoras_aula() {
        return horas_aula;
    }
}
