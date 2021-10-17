package exer_2;

public class Funcionario extends Pessoa{
    private String data_admissao;
    private float salario;

    public void verInformacao(){
        System.out.print("Funcionario.\n\n");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade:"+this.getIdade());
        System.out.println("Data de Nascimento: "+this.getData_nascimento());
        System.out.println("Data de adimissão: "+this.getData_admissao());
        System.out.println("Salario: "+this.getSalario());
    }
    public void rotina_trabalho(){
        System.out.print("\nRotina de Trabalho.\n");
        System.out.println("- Entra as 8h.");
        System.out.println("- Almoça ao 12h.");
        System.out.println("- Sai as 17h.");
    }
    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }
    public String getData_admissao() {
        return data_admissao;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getSalario() {
        return salario;
    }  
}