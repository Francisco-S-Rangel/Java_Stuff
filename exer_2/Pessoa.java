package exer_2;

public class Pessoa{
    private String nome;
    private int idade;
    private String data_nascimento;

    public void verInformacao(){
        System.out.print("Pessoa.\n\n");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade:"+this.getIdade());
        System.out.println("Data de Nascimento: "+this.getData_nascimento());
    }
    public void horario_rotina(){
        System.out.print("\nRotina.\n");
        System.out.println("- Acorda as 6h.");
        System.out.println("- Toma cafe as 6:30.");
        System.out.println("- Almoça ao 12h.");
        System.out.println("- toma café as 17h.");
        System.out.println("- Janta as 21h.");
        System.out.println("- Vai dormir as 23h.");
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
}

