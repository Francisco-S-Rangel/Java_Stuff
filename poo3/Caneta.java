package poo3;

public class Caneta{
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    /*Construtores são basicamente funções de inicialização de uma classe, as 
    quais são invocadas no momento em que objetos desta classe são criadas. 
    Eles permitem inicializar campos internos da classe e alocar recursos que 
    um objeto da classe possa demandar, tais como memória, arquivos, semáforos, 
    soquetes, etc.
    Em Java, o construtor é definido como um método cujo nome deve ser o mesmo 
    nome da classe e sem indicação do tipo de retorno -- nem mesmo void. O 
    construtor é unicamente invocado no momento da criação do objeto através do 
    operador new. O retorno do operador new é uma referência para o objeto 
    recém-criado.
    Basicamente o metodo construtor atribui valores aos atributos 
    pré-determinados, ou seja a informação que será entregue caso nem um 
    atributo seja alterado*/
    public Caneta(){
        this.tampar();
        this.cor = "Azul";
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getcor(){
        return this.cor;
    }
    public void setcor(String coloracao){
        this.cor = coloracao ;
    }
    public float getponta(){
        return this.ponta;
    }
    public void setponta(float x){
        this.ponta = x;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
  
    public void getstatus(){
        System.out.printf("\nSobre a Caneta:\n");
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Esta Tampada: " + this.getTampada());
    }
}