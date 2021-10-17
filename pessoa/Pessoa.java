package pessoa;


public class Pessoa {
    public String Nome;
    public String Cpf;
    public int idade;
    
    // Funçao desconto normal 
    public double desconto_Internacao(int idade){
        if(idade <= 25){
            return 0.08;
        }else if(idade > 25 && idade <40){
            return 0.2;
        }else if(idade >= 40){
            return 0.3;
        }
        return 0;
    }
    // Se o valor for maior que $2000 vai existir 10% de desconto!
    public double desconto_Internacao(double valor){
        if(valor > 2000){
            return 0.1;
        }
        return 0;
    }
    
    public String getNome() {
        return Nome;
    }

   
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

  
    public String getCpf() {
        return Cpf;
    }

   
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

   
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
