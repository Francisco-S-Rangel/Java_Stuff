package exer_1;

// Classe criada simplesmente para deixar o codigo mais bem organizado.
public class Endereco {
    public String rua;
    public int numero;
    public String cep;

    Endereco(String rua,int numero,String cep){
        this.rua= rua;
        this.numero = numero;
        this.cep = cep;
    }
    protected String getRua(){
        return this.rua;
    }
    protected int getNumero(){
        return this.numero;
    }
    protected String getCep(){
        return this.cep;
    }
}
