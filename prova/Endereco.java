package prova;

public class Endereco {
public String rua;
public int numero;
public String cep;
public String bairro;

Endereco(String rua,int numero,String cep,String bairro){
    this.rua = rua;
    this.numero = numero;
    this.cep = cep;
    this.bairro = bairro;
}
protected String getRua(){
    return this.rua;
}
protected int geNumero(){
    return this.numero;
}
protected String getCep(){
    return this.cep;
}
protected String getBairro(){
    return this.bairro;
}
}