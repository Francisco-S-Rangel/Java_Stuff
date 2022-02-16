package poo2;

public class Caneta{
   /*atributos*/
    /*this é o nome to objeto nesse cado c1, this é uma referencia 
    ao proprio objeto que chamou, sempre que vc quiser modeficar um 
    objeto dentro da propria classe que chamou */
    public String modelo;
    public String cor;
    /*proíbe qualquer acesso externo à própria classe, inclusive das classes filhas.*/
    private float ponta;
    /*permite acesso às classes filhas, mas proíbe a qualquer outro acesso externo.*/
    protected int carga;
    private boolean tampada;
    /*metodo*/
    public void status(){
        System.out.println("Modelo?"+this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta?" + this.ponta);
        System.out.println("Carga?" + this.carga);
        System.out.println("Esta tampada?" + this.tampada);
    }
    protected void rabiscar(){
        if(this.tampada== true){
            System.out.println("Erro! não se pode rabiscar com a caneta tampada.");
        }else{
            System.out.print("Estou rabiscando!!");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar() {
        this.tampada = false;
    }
}