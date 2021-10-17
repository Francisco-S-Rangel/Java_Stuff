
package pessoa;
import java.util.Scanner;

public class Paciente extends Pessoa {
    private String Plano_Saude;
    private double Valor_Internacao;
   
    //Mostra o Dados do Paciente 
    public void Mostrar_Paciente(){
        System.out.println("\n\nNome do Paciente: " + this.getNome() );
        System.out.println("Cpf do Paciente: " + this.getCpf());
        System.out.println("Idade do Paciente: " + this.getIdade());
        System.out.println("Plano de Saude do Paciente: " + this.getPlano_Saude());
        System.out.println("valor da Internacao: " + this.getValor_Internacao());
    }
    
     public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        Paciente paciente = new Paciente();
        System.out.print("Nome do Paciente: ");
        paciente.setNome(entrada.next());
        System.out.print("Cpf do Paciente: ");
        paciente.setCpf(entrada.next());
        System.out.print("Idade do Paciente: ");
        paciente.setIdade(entrada.nextInt());
        System.out.print("Plano de Saude do Paciente: ");
        paciente.setPlano_Saude(entrada.next());
        System.out.print("Valor da Internacao: ");
        paciente.setValor_Internacao(entrada.nextDouble());
        // Vai levar em consideração apenas a idade do paciente 
        paciente.setValor_Internacao(paciente.getValor_Internacao()-
        (paciente.getValor_Internacao()*(paciente.desconto_Internacao(paciente.getIdade()))));
        // Se o valor for acima de 2000 havera um desconto de 10% caso o contrario nada sera descontado 
        
        paciente.setValor_Internacao(paciente.getValor_Internacao()-
                (paciente.getValor_Internacao()*paciente.desconto_Internacao(paciente.getValor_Internacao())));
        
        paciente.Mostrar_Paciente();

        entrada.close();;
      
    }
    public String getPlano_Saude() {
        return this.Plano_Saude;
    }
    public void setPlano_Saude(String Plano) {
        this.Plano_Saude = Plano;
    }
    public double getValor_Internacao(){
        return this.Valor_Internacao;
    }
    public void setValor_Internacao(double valor){
        this.Valor_Internacao = valor;
    }
}
