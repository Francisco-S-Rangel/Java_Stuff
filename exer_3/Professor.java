package exer_3;

import javax.swing.JOptionPane;
public class Professor extends Pessoa {
    public String Materia;
    public double Salario;
    
    public void inserirDados(){
        String aux,rua,cep;
        int numero;
        this.setNome(JOptionPane.showInputDialog("Nome: "));
        this.setCpf(JOptionPane.showInputDialog("Cpf: "));
        aux = JOptionPane.showInputDialog("Idade: ");
        this.setIdade(Integer.parseInt(aux));
        this.setMateria(JOptionPane.showInputDialog("Materia: "));
        aux = JOptionPane.showInputDialog("Salario: ");
        this.setSalario(Float.parseFloat(aux));
        rua = JOptionPane.showInputDialog("Rua: ");
        aux = JOptionPane.showInputDialog("Numero: ");
        numero = Integer.parseInt(aux);
        cep = JOptionPane.showInputDialog("Cep: ");
        this.inserirEndereco(rua, numero, cep);
    }
    public void verInformacao(){
        System.out.print("Professor.\n\n");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade:"+this.getIdade());
        System.out.println("Salario: "+this.getSalario());
        System.out.println("Materia: "+this.getMateria());
        JOptionPane.showMessageDialog(null,"Professor.\n\nNome: "+this.getNome()
        +"\nCpf: "+this.getCpf()+"\nIdade: "+ this.getIdade()+"\nMateria: "+this.getMateria()
        + "\nSalario: " + this.getSalario() +"\n\nEndereço\n" + "\nRua: "+endereco.getRua()+
        "\nNumero: " + endereco.geNumero()+ "\nCep: " + endereco.getCep());
    }
    public void horario(){
        JOptionPane.showMessageDialog(null,"\nHorarios das Aulas.\n\n\n- 1º Aula: das 8h das 9h."+
        "\n- 2º Aula: das 9h das 10h.\n- 3º Aula: das 10h das 11h.\n- 4º Aula: das 11h das 12h." +
        "\n- 5ºAula: das 13h das 14h.\n- 6º Aula: das 14h das 15h.\n- 7º Aula: das 15h das 16h.\n- 8º Aula: das 16h das 17h.");
    }
    public void setMateria(String materia) {
        Materia = materia;
    }
    public String getMateria() {
        return Materia;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    public double getSalario() {
        return Salario;
    }
}
