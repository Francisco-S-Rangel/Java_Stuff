package exer_3;

import javax.swing.JOptionPane;
public class Aluno extends Pessoa {
    public String RA;
    public String Disciplina;
    public int Media_final;

    public void inserirDados(){
        String aux,rua,cep;
        int numero;
        this.setNome(JOptionPane.showInputDialog("Nome: "));
        this.setCpf(JOptionPane.showInputDialog("Cpf: "));
        aux = JOptionPane.showInputDialog("Idade: ");
        this.setIdade(Integer.parseInt(aux));
        this.setRA(JOptionPane.showInputDialog("RA: "));
        this.setDisciplina(JOptionPane.showInputDialog("Disciplina: "));
        aux = JOptionPane.showInputDialog("Media Final: ");
        this.setMedia_final(Integer.parseInt(aux));
        rua = JOptionPane.showInputDialog("Rua: ");
        aux = JOptionPane.showInputDialog("Numero: ");
        numero = Integer.parseInt(aux);
        cep = JOptionPane.showInputDialog("Cep: ");
        this.inserirEndereco(rua, numero, cep);
    }
    public void verInformacao(){
        JOptionPane.showMessageDialog(null,"Aluno.\n\nNome: "+this.getNome()
        +"\nCpf: "+this.getCpf()+"\nIdade: "+ this.getIdade() + "\nRa: "+ this.getRA()+"\nDisciplina: "+this.getDisciplina()
        + "\nMedia_final: " + this.getMedia_final() +"\n\nEndereço\n" + "\nRua: "+endereco.getRua()+
        "\nNumero: " + endereco.geNumero()+ "\nCep: " + endereco.getCep());
    }
    public void horario(){
        JOptionPane.showMessageDialog(null,"\nHorarios das Aulas.\n\n- 1º Aula: das 8h das 9h."+
        "\n- 2º Aula: das 9h das 10h.\n- 3º Aula: das 10h das 11h.\n- 4º Aula: das 11h das 12h."+
        "\n- 5º Aula: das 13h das 14h.");
    }
    public void setRA(String rA) {
        RA = rA;
    }
    public String getRA() {
        return RA;
    }
    public void setDisciplina(String disciplina) {
        Disciplina = disciplina;
    }
    public String getDisciplina() {
        return Disciplina;
    }
    public void setMedia_final(int media_final) {
        Media_final = media_final;
    }
    public int getMedia_final() {
        return Media_final;
    }
}